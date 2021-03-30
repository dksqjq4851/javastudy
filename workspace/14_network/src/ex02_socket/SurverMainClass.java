package ex02_socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SurverMainClass {

	public static void main(String[] args) {
		//serversocket : 서버
		ServerSocket server = null;
		try {
			//서버
			server = new ServerSocket();
			
			//접속할 클라잉언트
			server.bind(new InetSocketAddress("localhost", 4966 ));
			
			//서버는 항상 켜져 있다.(무한루프)
			while(true) {
				
				System.out.println("=========서버가 실행ㅈㅇ입니다.===========");
				//클라이언트의 접속 허용
				Socket client = server.accept();
				//클라이언트의 접속 주소
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println(isa.getHostName() + "  클라이언트가 접속 되었습니다.");
				
				//클라이언트에게 웰컴 메시지 보내기
				String message = "Welcome th My Server! 안녕!";
				OutputStream os = client.getOutputStream();
				os.write(message.getBytes("UTF-8"));
				os.flush();
				
				
			}
			
			
			
			
			
			
			
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(!server.isClosed())server.close();
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}

	}

}

package prac1;

import java.io.BufferedInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		BufferedInputStream bis = null;
		
		try {
			//서버 생성하기
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 4966));
			
			//서버접속하기
			while(true) {
				System.out.println("서버가 동작중입니다.");
				client =  server.accept();
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트 >>" + isa);
				
			//클라이언트에게 답변 메시지 보내기
				bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[1024];
				int length = bis.read(b);
				String message = new String(b, 0, length, "UTF-8");
				System.out.println("클라이언트에게서 온 메세지입니다 >>>" + message);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(!server.isClosed()) {
					server.isClosed();
				}
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		

	}

}

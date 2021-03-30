package ex01_char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 	 BufferedWriterMainClass
 	 1.보조 스트림입니다.
 	 2. filewriter 클래스와 같은 메인스트림과 함께 사용합니다.
 */
public class BufferedWriterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw);
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.");
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			//보조 스트림 bw를 사용할 경우에는 bw만 닫으면 됩니다.
			try {
				if(bw != null)bw.close();
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
	}

}

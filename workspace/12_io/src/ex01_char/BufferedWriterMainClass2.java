package ex01_char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 	 BufferedWriterMainClass
 	 1.보조 스트림입니다.
 	 2. filewriter 클래스와 같은 메인스트림과 함께 사용합니다.
 */
public class BufferedWriterMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("text4.txt")))
		{
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다.");
			
			
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}
		
	}

}

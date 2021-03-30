package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 	filewriter 클래스
 	1. 문자 기반 + 출력 스트림입니다.(writer)
 	2. 문자를 보낼 때 사용합니다.
 		1)통신 : 상대방에게 문자를 보낼 때
 		2)파일 : 텍스트 파일
 	3. 출력 메소드
 		write()
 	4. 출력 단위
 		char[], String, int
 	5. 예외 처리가 필요합니다.
 	
 */

public class FileWriterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
			try {
				fw = new FileWriter("text1.txt");
				char[] cbuf = {'H','e','l','l','o'};
				String str = "Java";
				int ch = '!';
				String str2 = "Nice to meet you";
				fw.write(cbuf);
				fw.write(str);
				fw.write(ch);
				fw.write('\n');
				fw.write(str2);
				
			}catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}finally {
				try {
					if(fw!=null)fw.close();
				}catch (Exception e) {
					e.printStackTrace();// TODO: handle exception
				}
			}

	}

}

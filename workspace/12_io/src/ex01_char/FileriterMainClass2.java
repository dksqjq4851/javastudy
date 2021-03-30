package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 	try-catch-resources문
 	1.close()메소드를 자동으로 호출하는 try문
 	2.형식
 		try
 */
public class FileriterMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileWriter fw = new FileWriter("text2.txt")){
			char [] cbuf = {'H', 'e', 'l','l','o'};
			fw.write(cbuf, 0, cbuf.length);
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

package ex01_char;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("text1.txt")){
			int ch = fr.read();
			
			while(true) {
				 ch = fr.read();
				if(ch ==-1) {
					break;
				}
				System.out.println(ch);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}

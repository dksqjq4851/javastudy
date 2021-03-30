package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("text3.txt"))){
			StringBuilder sb = new StringBuilder();
			while(true) {
				char[] cbuf = new char[5];
				int readCharCount = br.read(cbuf);
				if(readCharCount == -1) {
					break;
				}
				sb.append(cbuf, 0, readCharCount);
			}
			System.out.println(sb.toString());
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}

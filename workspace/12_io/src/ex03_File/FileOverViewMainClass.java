package ex03_File;
/*
  File 클래스
  1. 파일을 조작하는 클래스입니다ㅣ.
  2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다.
 */

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOverViewMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//디렉터리 조작
		
		File dir = new File("C:\\MyTemp"); //경로구분 (\\ == File.separator)
//		File dir = new File("C:" + File.separator + "MyTemp"); Linux와 Windows 호환용

		System.out.println(dir.exists());
		
		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("디렉터리가 생성되었습니다.");
		}

		File file = new File("C:\\MyTemp\\MyFile.txt");
		System.out.println(file.exists());
		try {
		if(file.exists() == false) {
			file.createNewFile();
		}
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(file.getAbsolutePath());//
		System.out.println(file.getPath());//
		System.out.println(file.getParent());//
		System.out.println(file.getName());//
		System.out.println(new Date(file.lastModified()));//
		System.out.println(file.length());// 0 
	}



}

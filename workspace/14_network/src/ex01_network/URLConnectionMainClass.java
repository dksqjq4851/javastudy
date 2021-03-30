package ex01_network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionMainClass {

	public static void main(String[] args) {

		URL url = null;
		URLConnection con = null;
		try{
			url = new URL("https://www.naver.com");
			con = url.openConnection();
			System.out.println(con.getContent());
			System.out.println(con.getURL());
			System.out.println(con.getContentType());
			System.out.println(con.getContentEncoding());
			System.out.println(con.getContentLength());
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}

package ex01_network;

import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {
		//url : uniform resource locator
		//형식이 정해져 있는 자원의 표기방법
		//프르토콜://호스트:포트?파라미터
	 
		URL url1 = null;
		URL url2 = null;
		try {
			
		
		url1 = new URL("https://www.naver.com:9090?query=java");
		System.out.println(url1.getHost());
		System.out.println(url1.getDefaultPort());
		System.out.println(url1.getProtocol());
		System.out.println(url1.getQuery());
		url2 = new URL("https://www.naver.com/webtoon/webtoon.jsp");
		System.out.println(url2.getFile());
		}catch (Exception e) {
			
			e.printStackTrace();// TODO: handle exception
		}
	}

}

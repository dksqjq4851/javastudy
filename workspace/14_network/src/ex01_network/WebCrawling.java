package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawling {
	public static void main(String[] args) {
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		
		try {
			url = new URL("https://www.daum.net/");
			con = (HttpURLConnection)url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			while((line = br.readLine()) != null) {
				//line:~~
				//이와같인 link_favirsch만 포함된 line이 필요합니다.
				if(line.contains("link_favorsch @")) {
					//System.out.println(line);
					//String[] temps = line.split(">");
					//System.out.println(temps[1]);
					
					//line.split(">")[1].split("<") : {"코로나19 발생현황","/a"}
					System.out.println(line.split(">")[1].split("<")[0]);
					
				}
			}
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(br!=null)br.close();
				if(con!=null)con.disconnect();
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
		
	}

}

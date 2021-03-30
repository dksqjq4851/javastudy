package ex01_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class openStreamMainClass {

	public static void main(String[] args) { 
		URL url = null;
		HttpURLConnection con = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			url = new URL("https://m.naver.com/");
			con = (HttpURLConnection)url.openConnection();
			isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);
			
			while(true) {
				String line =  br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line).append("\n");
				//System.out.println(line);
			}
			System.out.println(sb.toString().length());
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(br != null)br.close();
				if(con != null)con.disconnect();
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}

	}

}

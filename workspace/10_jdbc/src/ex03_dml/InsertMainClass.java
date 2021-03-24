package ex03_dml;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*; // java.sql 패키지의 모든 클래스를 import합니다.
import java.util.concurrent.ExecutionException;

import conection.DBConnection;


public class InsertMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (sNo, sName, department, hiredate) VALUES (1,'alice','총무','21/03/22')";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			//executeipdate() 메소드 반환값
			//변화가 생긴 행(Row)의 개수가 반환됩니다.
			//실패하면 0이 반환되고, 성공하면 INSERT된 행(Row)의 개수가 반환됩니다.
			if(result == 0) {
				System.out.println("행이 추가되지 않았습니다.");
				
			}else {
				System.out.println("정상적으로 행이 추가되었습니다.");
			}
		}catch (Exception e) {
		e.printStackTrace();	// TODO: handle exception
		}finally {
			try {
				if(ps!=null) {ps.close();}
				if(con!= null) {con.close();}
				
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}
	}}


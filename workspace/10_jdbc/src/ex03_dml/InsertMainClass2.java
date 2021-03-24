package ex03_dml;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import conection.DBConnection;

public class InsertMainClass2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			//쿼리문에 변수 처리되는 부분은 ?으로 처리합니다.
			
			String sql = "INSERT INTO staff (sNo, sName, department, hiredate) VALUES (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			//변수 처리(?에 값을 전달하기)
			ps.setInt(1, 2);//1번째 ?에 2 전달하기
			ps.setString(2, "hans");//2번째 ? 에 한스 전달하기
			ps.setString(3, "영업");//3번째 ? 에 영업 전달하기
			ps.setDate(4, new Date(System.currentTimeMillis()));// 4번째 ? 에
			
			
			int result = ps.executeUpdate();
			if(result == 0) {
				System.out.println("행이 추가되지 않았습니다.");
			}else {
				System.out.println("행이 추가되었습니다.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}

}

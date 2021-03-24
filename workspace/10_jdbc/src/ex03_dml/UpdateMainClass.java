package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConnection.getConnection();
			String sql = "UPDATE staff SET department = ? WHERE sNo = ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "자제");
			ps.setInt(2, 5);
			int result = ps.executeUpdate();
			if(result == 0) {
				System.out.println("정보가 수정되지 않았습니다.");
			}else {
				System.out.println("정보가 정상적으로 수정되었습니다.");
			}
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}

	}

}

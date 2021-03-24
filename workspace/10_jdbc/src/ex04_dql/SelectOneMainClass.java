package ex04_dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import conection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;//SELECT문과 결과 행(Row)을 저장합니다.
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT sNo, sName, department, hiredate FROM staff WHERE sNo = 1";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();//SELECT문의 실행은 executeQuery() 메소드입니ㅏ.
			//rs에 저장된 데이터는 "반드시" next() 메소드를 호출해서 꺼냅니다.
			//next()메소드 : 결과 행에서 순서대로 한 행씩 꺼냅니다.
			//1.결과행에서 순서대로 한 행씩 꺼냅니다.
			//2.꺼낼 결과 행이 존재하면 true를 반환하고. 없으면 false를 반환합니다.
			if(rs.next()) {
				/*int sNo = rs.getInt(1);
				String sName = rs.getString(2);
				String department = rs.getString(3);
				Date hiredate = rs.getDate(4);*/
				Map<String, Object> staff = new HashMap<String, Object>();
				staff.put("sNo", rs.getInt("sNo"));
				staff.put("sName", rs.getString("sName"));
				staff.put("department", rs.getString("department"));
				staff.put("hiredate", rs.getDate("hiredate"));
				
				
				
				
				System.out.println("sNo = " + staff.get("sNo") + ", sName = " + staff.get("sName")+ ", department=" + staff.get("department") + ",hiredate= " + staff.get("hiredate"));
			}else {
				System.out.println("해당내용이없습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(rs != null)rs.close();
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}

	}

}

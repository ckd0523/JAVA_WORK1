package ch20.mysql.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
// 데이터 삽입
	public static void main(String[] args) {

		Connection conn = null;
		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결하기
			conn= DriverManager.getConnection(
			"jdbc:mysql://192.168.111.200:3306/thisisjava",
			"java",
			"mysql"
			
			);
			
			// 매개변수로 SQL문 작성
			String sql = "" +
					"insert into member_table (uname, uemail, password)" +
					"VALUES(?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "ckd123");
			pstmt.setString(2, "이");
			pstmt.setString(3, "12345");
			
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : "+rows);
			
			pstmt.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {}
			}
		}
		
	}

}

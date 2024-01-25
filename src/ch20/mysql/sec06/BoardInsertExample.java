package ch20.mysql.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExample {
// 데이터 삽입
	public static void main(String[] args) {
		
		// SQL 연결
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.200:3306/thisisjava",
					"java",
					"mysql"
				);
			// 매개변수 SQL문 작성
			String sql = ""+
			"insert into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)"+
			"VALUES(?, ?, ?, now(), ?, ?)";
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(
					sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "크리스마스");
			pstmt.setString(2, "메리 크리스마스");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "crismas.jpg");
			pstmt.setBlob(5, new FileInputStream("src/ch20/mysql/sec06/crismas.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : "+rows);
			
			if(rows ==1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno : "+bno);
				}
				rs.close();
			}
			pstmt.close();
			
			
		}catch(Exception e) {
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

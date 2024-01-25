package ch20.mysql.sec07;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {
// 데이터 수정
	public static void main(String[] args) {

		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.200:3306/thisisjava",
					"java",
					"mysql"
					);
			
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=?, ")
					.append("bdate=now() ")
					.append("WHERE bno=? ")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, new FileInputStream("src/ch20/mysql/sec07/snowman.jpg"));
			pstmt.setInt(5, 3);
					
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행의 수 : "+rows);
			
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

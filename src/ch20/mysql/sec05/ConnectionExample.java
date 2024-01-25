package ch20.mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
// MySQL 연결
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
			
			System.out.println("연결 성공");
			// DB CLUB
			// 데이터 추가 insert C
			// 데이터 불러온다 read R
			// 데이터 조사 select U
			// 데이터 삭제 delete D
						
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					//연결 끊기
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {}
			}
		}
		
		
		
	}

}

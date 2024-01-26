package ch20.mysql.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.mysql.sec09.exam01.User;

public class BoardExample4 {

	private Scanner scanner = new Scanner(System.in);
	private Connection conn;

	public BoardExample4() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://192.168.111.200:3306/thisisjava", "java", "mysql");

		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void login() {
		System.out.println();
		System.out.println("[로그인]");
		System.out.print("아이디 : ");
		String userId = scanner.nextLine();
		System.out.print("패스워드 : ");
		String password = scanner.next();
		
		try {
			String sql = ""+"SELECT userpassword FROM users "+
					"WHERE userId=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String userpassword = rs.getString("userpassword");
				if(password.equals(userpassword)) {
					System.out.println("[로그인에 성공하였습니다]");
					
				}else {
					System.out.println("[로그인에 실패하였습니다.]");
					exit();
				}
				rs.close();
				
			}
			else {
				System.out.println("[아이디가 존재하지 않습니다.]");
				login();
			}
			
			list();
			
		}catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
	}

	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------");

		try {
			String sql = "" + "SELECT bno, btitle,bcontent, bwriter, bdate " + "FROM boards " + "ORDER BY bno DESC";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n", board.getBno(), board.getBwriter(), board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}

		mainMenu();
	}

	public void mainMenu() {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메인 선택 : ");
		String menuNo = scanner.next();
		System.out.println();

		switch (menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();

		}
	}

	public void create() {
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scanner.next());
		System.out.print("내용 : ");
		board.setBcontent(scanner.next());
		System.out.print("작성자 : ");
		board.setBwriter(scanner.next());

		System.out.println("-----------------------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancle");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.next();
		if (menuNo.equals("1")) {
			try {
				String sql = "" + "INSERT INTO boards (btitle, bcontent, bwriter, bdate) " + "VALUES (?, ?, ?, now())";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}

	public void read() {

		System.out.println("[게시물 읽기]");
		System.out.print("bno : ");
		int bno = Integer.parseInt(scanner.next());

		try {
			String sql = "" + "SELECT bno, btitle, bcontent, bwriter, bdate " + "FROM boards " + "WHERE bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("#############");
				System.out.println("번호 : " + board.getBno());
				System.out.println("제목 : " + board.getBtitle());
				System.out.println("내용 : " + board.getBcontent());
				System.out.println("작성자 : " + board.getBwriter());
				System.out.println("날짜 : " + board.getBdate());
				System.out.println("#############");
				System.out.println("-----------------------------------");
				System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
				System.out.print("메뉴 선택 : ");
				String menuNo = scanner.next();
				System.out.println();

				if (menuNo.equals("1")) {
					update(board);
				} else if (menuNo.equals("2")) {
					delete(board);
				}
				System.out.println("#############");
			}

			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}

		list();
	}

	public void update(Board board) {
		System.out.println("[수정 내용 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scanner.next());
		System.out.print("내용 : ");
		board.setBcontent(scanner.next());
		System.out.print("작성자 : ");
		board.setBwriter(scanner.next());

		System.out.println("-----------------------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancle");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.next();
		if (menuNo.equals("1")) {
			try {
				String sql = "" + "UPDATE boards SET btitle=?, bcontent=?, bwriter=? " + "WHERE bno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();

			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}

	public void delete(Board board) {
		try {
			String sql = "DELETE FROM boards WHERE bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}

	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("-----------------------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancle");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.next();
		if (menuNo.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE boards";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}

	public void exit() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

			}
		}
		System.out.println("**게시판 종료**");
		System.exit(0);
	}

	public static void main(String[] args) {

		BoardExample4 boardExample = new BoardExample4();
		boardExample.login();

	}

}

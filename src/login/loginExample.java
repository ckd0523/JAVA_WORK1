package login;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import ch20.mysql.sec09.exam01.User;
import sec06.exam01_jbutton.JButtonExample;
import sec07.exam02_jtextfield_jpasswordfield.JTextFieldJPasswordFieldExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginExample extends JFrame {
	
	private JButton loginBtn;
	private JTextField txtId;
	private JPasswordField txtPassword;

	
	public loginExample() {
		this.setTitle("loginExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(3, 2));
		this.getContentPane().add(new JLabel("아이디", JLabel.CENTER));
		this.getContentPane().add(getTxtId());
		this.getContentPane().add(new JLabel("패스워드", JLabel.CENTER));
		this.getContentPane().add(getTxtPassword());
		this.getContentPane().add(new JLabel("실행", JLabel.CENTER));
		this.getContentPane().add(getloginBtn());
		this.setSize(500, 500);
	}
	
	public JButton getloginBtn() {
		if(loginBtn == null) {
			loginBtn = new JButton();
			loginBtn.setText("로그인");
			loginBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Data();
					
				}
			});
		}
		return loginBtn;
	}
	
	
	
	public JTextField getTxtId() {
		if(txtId == null) {
			txtId = new JTextField();
			txtId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String id = new String(txtId.getText());
					
					}
					
			});
		}
		
		return txtId;
	}
	
	public JPasswordField getTxtPassword() {
		if(txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String password = new String(txtPassword.getPassword());

				}
			});
		}
		return txtPassword;
	}
	
	
	public void Data() {
		Connection conn = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.200:3306/thisisjava",
					"java",
					"mysql"
					);
			
			String sql = ""+
					"SELECT userid, userpassword "+
					"FROM users "+
					"WHERE userid =?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, txtId.getText());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				User user = new User();
				String userId = rs.getString("userid");
				String userpassword = rs.getString("userpassword");
				if(txtPassword.getText().equals(userpassword)) {
					System.out.println("로그인 성공");
					Main main = new Main();
					main.setVisible(true);
					dispose();
				}else {
					System.out.println("로그인 실패");

				}
			}else {
				System.out.println("사용자 아이디가 존재 하지 않음");
			}
			rs.close();
			
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
	
	
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
	
			loginExample jFrame = new loginExample();
			jFrame.setVisible(true);
		
		}
	});
}
}

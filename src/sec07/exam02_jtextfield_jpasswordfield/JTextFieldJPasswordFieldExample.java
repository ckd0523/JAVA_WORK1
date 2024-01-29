package sec07.exam02_jtextfield_jpasswordfield;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
//import javax.swing.JButton;

public class JTextFieldJPasswordFieldExample extends JFrame{
	private JTextField txtId;
	private JPasswordField txtPassword;
	
	//private JButton Login;
	
	public String checkid = "winter";
	public String checkpw="12345";
	
	public JTextFieldJPasswordFieldExample() {
		this.setTitle("JTextField & JPasswordField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2, 2));
		this.getContentPane().add(new JLabel("아이디", JLabel.CENTER));
		this.getContentPane().add(getTxtId());
		this.getContentPane().add(new JLabel("패스워드", JLabel.CENTER));
		this.getContentPane().add(getTxtPassword());
		this.setSize(200, 100);
	}
	
	public JTextField getTxtId() {
//		if(txtId == null) {
//			txtId = new JTextField();
//			txtId.addKeyListener(new KeyAdapter() {
//				public void keyPressed(KeyEvent e) {
//					if(e.getKeyCode()>= KeyEvent.VK_A && e.getKeyCode()<=KeyEvent.VK_Z) {
//						JOptionPane.showMessageDialog(
//								JTextFieldJPasswordFieldExample.this, "알파벳 이군요");
//								
//					}else {
//						JOptionPane.showConfirmDialog(
//								JTextFieldJPasswordFieldExample.this, "알파벳이 아니군요");
//					}
//				}
//			});
//		}
		
		if(txtId == null) {
			txtId = new JTextField();
			txtId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String id = new String(txtId.getText());
					if(id.equals(checkid)){
						JOptionPane.showConfirmDialog(
								
								JTextFieldJPasswordFieldExample.this, "입력한 아이디 : "+id);
					}else {
						JOptionPane.showConfirmDialog(
								
								JTextFieldJPasswordFieldExample.this, "아이디를 다시 입력해주세요.");
					}
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
					if(password.equals(checkpw)&&txtId.getText().equals(checkid)) {
					JOptionPane.showConfirmDialog(
							JTextFieldJPasswordFieldExample.this, "로그인 성공 ");
					}else if(txtId.getText().equals(checkid)){
						JOptionPane.showConfirmDialog(
								JTextFieldJPasswordFieldExample.this, "비밀번호를 다시 입력해주세요 ");
					}else {
						JOptionPane.showConfirmDialog(
								JTextFieldJPasswordFieldExample.this, "아이디를 다시 입력해주세요 ");
					}
				}
			});
		}
		return txtPassword;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextFieldJPasswordFieldExample jFrame = new JTextFieldJPasswordFieldExample();
				jFrame.setVisible(true);
			}
		});
		
	}

}

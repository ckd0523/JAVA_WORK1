package login;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {

	public Main() {
		this.setTitle("loginExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(500, 500);
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

package sec07.exam01_jlabel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.border.*;
import java.awt.color.*;

public class JLabelExample extends JFrame {

	private JLabel jLabel1, jLabel2, jLabel3, jLabel4;
	
	public JLabelExample() {
		this.setTitle("JLabelExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(4, 1));
		
		this.getContentPane().add(getJLabel1());
		this.getContentPane().add(getJLabel2());
		this.getContentPane().add(getJLabel3());
		this.getContentPane().add(getJLabel4());
		this.setSize(200, 300);
		
	}
	
	public JLabel getJLabel1() {
		if(jLabel1 == null ) {
			jLabel1= new JLabel();
			jLabel1.setText("jLabel1");
			jLabel1.setHorizontalAlignment(JLabel.LEFT);
			jLabel1.setBorder(new EtchedBorder());
		}
		return jLabel1;
	}
	
	public JLabel getJLabel2() {
		if(jLabel2 == null ) {
			jLabel2= new JLabel();
			jLabel2.setText("jLabel2");
			jLabel2.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel2.setHorizontalAlignment(JLabel.CENTER);
			jLabel2.setBorder(new BevelBorder(BevelBorder.RAISED));
			
		}
		return jLabel2;
	}
	
	public JLabel getJLabel3() {
		if(jLabel3 == null ) {
			jLabel3= new JLabel();
			jLabel3.setText("jLabel3");
			jLabel3.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel3.setHorizontalAlignment(JLabel.CENTER);
			jLabel3.setHorizontalTextPosition(JLabel.LEFT);
			jLabel3.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		}
		return jLabel3;
	}
	
	public JLabel getJLabel4() {
		if(jLabel4 == null ) {
			jLabel4= new JLabel();
			jLabel4.setText("jLabel4");
			jLabel4.setIcon(new ImageIcon(getClass().getResource("user.gif")));
			jLabel4.setHorizontalAlignment(JLabel.CENTER);
			jLabel4.setIconTextGap(20);
			jLabel4.setBorder(new LineBorder(Color.red,3));
		}
		return jLabel4;
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JLabelExample jFrame = new JLabelExample();
				jFrame.setVisible(true);
			}
		});

	}

}

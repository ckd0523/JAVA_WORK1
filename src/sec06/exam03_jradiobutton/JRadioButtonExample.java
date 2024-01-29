package sec06.exam03_jradiobutton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;


public class JRadioButtonExample extends JFrame {
	
	private JPanel radioPanel;
	private JRadioButton rbBird;
	private JRadioButton rbCat;
	private JRadioButton rbTiger;
	private JRadioButton rbDog;
	private JLabel lblPicture;

	public JRadioButtonExample() {
		setTitle("JRadioButtonExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(), BorderLayout.SOUTH);
		this.getContentPane().add(getLblPicture(), BorderLayout.CENTER);
		pack();
	}
	
	private ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==rbBird) {
				System.out.println("새를 클릭 했습니다.");
				
			}else if(e.getSource() == rbCat) {
				System.out.println("고양이를 클릭 했습니다.");
			}else if(e.getSource() == rbTiger) {
				System.out.println("호랑이를 클릭 했습니다.");
			}else if(e.getSource() == rbDog) {
				System.out.println("강아지를 클릭 했습니다.");
			}
		}
	};
	
	public JPanel getRadioPanel() {
		if(radioPanel == null) {
			radioPanel = new JPanel();
			radioPanel.setLayout(new GridLayout(1, 4));
			radioPanel.add(getRbBird());
			radioPanel.add(getRbCat());
			radioPanel.add(getRbDog());
			radioPanel.add(getRbTiger());
			
			ButtonGroup group = new ButtonGroup();
			group.add(getRbBird());
			group.add(getRbCat());
			group.add(getRbTiger());
			group.add(getRbDog());
		}
		return radioPanel;
	}
	
	public JRadioButton getRbBird() {
		if(rbBird == null) {
			rbBird = new JRadioButton();
			rbBird.setText("Bird");
			rbBird.setSelected(false);		// 초기 선택 되는 설정
			rbBird.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon( new ImageIcon(getClass().getResource("Bird.gif")));
					//System.out.println("새를 클릭 했습니다.");
				}
			});
			rbBird.addActionListener(actionListener);
		}
		return rbBird;
	}
	
	public JRadioButton getRbDog() {
		if(rbDog == null) {
			rbDog = new JRadioButton();
			rbDog.setText("Dog");
			rbDog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon( new ImageIcon(getClass().getResource("Dog.jpg")));
					//System.out.println("강아지를 클릭 했습니다.");
				}
			});
			rbDog.addActionListener(actionListener);
		}
		return rbDog;
	}
	
	public JRadioButton getRbTiger() {
		if(rbTiger == null) {
			rbTiger = new JRadioButton();
			rbTiger.setText("Tiger");
			rbTiger.setSelected(true);		// 초기 선택 되는 설정
			rbTiger.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon( new ImageIcon(getClass().getResource("Tiger.png")));
					//System.out.println("호랑이를 클릭 했습니다.");
				}
			});
			rbTiger.addActionListener(actionListener);
		}
		return rbTiger;
	}
	
	public JRadioButton getRbCat() {
		if(rbCat == null) {
			rbCat = new JRadioButton();
			rbCat.setText("Cat");
			rbCat.setSelected(true);		// 초기 선택 되는 설정
			rbCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon( new ImageIcon(getClass().getResource("Cat2.jpg")));
					//System.out.println("고양이를 클릭 했습니다.");
				}
			});
			rbCat.addActionListener(actionListener);
		}
		return rbCat;
	}
	
	public JLabel getLblPicture() {
		if(lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("Cat2.jpg")));
		}
		return lblPicture;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JRadioButtonExample jFrame = new JRadioButtonExample();
				jFrame.setVisible(true);
			}
		});
		
	}

}

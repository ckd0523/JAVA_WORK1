package sec04.exam05_cardlayout;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class CardLayoutExample extends JFrame {

	private JPanel redCard, greenCard, blueCard;
	
	
	public CardLayoutExample() {
		this.setTitle("CardLayoutExample");
		this.setSize(250, 400);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	this.getContentPane().setLayout(new CardLayout());
	this.getContentPane().add("RedCard", getRedCard());
	this.getContentPane().add("GreenCard", getGreenCard());
	this.getContentPane().add("BlueCard", getBlueCard());
	
	}
	
	public JPanel getRedCard() {
		if(redCard == null) {
			redCard = new JPanel();
			redCard.setBackground(Color.red);
		}
		return redCard;
	}
	
	public JPanel getGreenCard() {
		if(greenCard == null) {
			greenCard = new JPanel();
			greenCard.setBackground(Color.green);
		}
		return greenCard;
	}
	
	public JPanel getBlueCard() {
		if(blueCard == null) {
			blueCard = new JPanel();
			blueCard.setBackground(Color.blue);
		}
		return blueCard;
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final CardLayoutExample jFrame = new CardLayoutExample();
				jFrame.setVisible(true);
				
				Thread thread = new Thread() {
					@Override
					public void run() {
						for(int i = 0; i<10; i++) {
							try {
								Thread.sleep(2000);
							}catch(InterruptedException e) {}
							
							SwingUtilities.invokeLater(new Runnable() {
								@Override
								public void run() {
									CardLayout cardLayout = (CardLayout) jFrame.getContentPane().getLayout();
									cardLayout.next(jFrame.getContentPane());
								}
							});
						}
					}
				};
				thread.start();
			}
		});
		
		
	}

}

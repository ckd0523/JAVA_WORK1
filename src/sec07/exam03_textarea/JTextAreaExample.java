package sec07.exam03_textarea;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import sec07.exam02_jtextfield_jpasswordfield.JTextFieldJPasswordFieldExample;

public class JTextAreaExample extends JFrame {

	private JTextArea txtDisplay;
	private JPanel pSouth;
	private JTextField txtInput;
	private JButton btnSend;
	
	public JTextAreaExample() {
		this.setTitle("JTextAreaExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getTxtDisplay()),
				BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(300, 200);
		
	}
	
	public JTextArea getTxtDisplay() {
		if(txtDisplay == null) {
			txtDisplay = new JTextArea();
			txtDisplay.setEditable(false);		// 편집가능여부
		}
		return txtDisplay;
	}
	
	public JPanel getPSouth() {
		if(pSouth==null) {
			pSouth= new JPanel();
			pSouth.setLayout(new BorderLayout());
			pSouth.add(getTxtInput(), BorderLayout.CENTER);
			pSouth.add(getBtnSend(), BorderLayout.EAST);
			
		}
		return pSouth;
	}
	
	public JTextField getTxtInput() {
		if(txtInput == null) {
			txtInput = new JTextField();
			txtInput.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					getTxtDisplay().append(getTxtInput().getText()+"\n");
					getTxtInput().setText("");
					
					}
			
		
		
		}
		
		

				
		);
		}
		
		return txtInput;
	}
	
	public JButton getBtnSend() {
		if(btnSend == null) {
			btnSend = new JButton();
			btnSend.setText("전송");
			btnSend.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getTxtDisplay().append(getTxtInput().getText()+"\n");
					getTxtInput().setText("");
				}
			});
		}
		return btnSend;
	}
	
	
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTextAreaExample jFrame = new JTextAreaExample();
				jFrame.setVisible(true);
			}
		});

	}

}

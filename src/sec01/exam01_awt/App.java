package sec01.exam01_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends Frame {

	public App() {
		setTitle("AWT App");
		
		setSize(300,100);
		
		add(new Button("OK"), BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);;
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		app.setVisible(true);
		
	}
	
}

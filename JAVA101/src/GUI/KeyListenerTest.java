package GUI;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerTest extends JFrame {

	
	public KeyListenerTest(){
		
		
		JLabel la = new JLabel("log");
		
		
		setTitle("키 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Container c = getContentPane();
		
		
		c.setLayout(null);
		
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				//la.setText(e.getKeyCode());

				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		la.setSize(30,30);
		la.setLocation(0,0);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		
		
				
		
		
		
		
		
		
		

	}
	
	
	
	
	public static void main(String[] args) {
		
		
		new KeyListenerTest();

	}

}

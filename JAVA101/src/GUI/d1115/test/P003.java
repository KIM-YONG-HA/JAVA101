package GUI.d1115.test;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P003 extends JFrame {

	
	public P003() {
		
		setTitle("문제3번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i=1;i<=10;i++) {
			
			String idx = String.valueOf(i);
			c.add(new JButton(idx));
			
		}

		
		
		setSize(500,200);
		setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P003();
	}

}

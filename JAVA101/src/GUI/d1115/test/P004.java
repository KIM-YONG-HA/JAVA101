package GUI.d1115.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P004 extends JFrame {

	
	public P004() {
		
		setTitle("문제4번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		JButton[] btns = new JButton[10];
		
		for(int i=0;i<10;i++) {
			
			String idx = String.valueOf(i+1);
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			
			btns[i] = new JButton(idx);
			btns[i].setBackground(new Color(r,g,b));
			
			c.add(btns[i]);
			
		}

		
		
		setSize(500,200);
		setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P004();
	}

}

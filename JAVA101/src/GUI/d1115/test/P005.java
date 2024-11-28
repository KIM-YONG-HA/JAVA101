package GUI.d1115.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class P005 extends JFrame {

	
	public P005() {
		
		setTitle("문제5번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		
		JLabel[] labels= new JLabel[16];
		
		for(int i=0;i<16;i++) {
			
			String idx = String.valueOf(i);
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			
			labels[i] = new JLabel(idx);
			labels[i].setOpaque(true);
			labels[i].setBackground(new Color(r,g,b));
			c.add(labels[i]);
			
		}

		
		setSize(500,200);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new P005();
	}

}

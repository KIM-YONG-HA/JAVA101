package GUI.d1115.test;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class P001 extends JFrame {

	
	public P001() {
		
		setTitle("문제1번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		Container c = getContentPane();
		c.setBackground(Color.CYAN);
		
		
		
		setSize(400,200);
		setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P001();
	}

}

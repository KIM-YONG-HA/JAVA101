package GUI.d1115.test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P002 extends JFrame {

	
	public P002() {
		
		setTitle("문제2번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));
		
		JButton btn1 = new JButton("East");
		JButton btn2 = new JButton("West");
		JButton btn3 = new JButton("South");
		JButton btn4 = new JButton("North");
		JButton btn5 = new JButton("center");
		
		c.add(btn1, BorderLayout.EAST);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.SOUTH);
		c.add(btn4, BorderLayout.NORTH);
		c.add(btn5, BorderLayout.CENTER);
		
		
		setSize(400,200);
		setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P002();
	}

}

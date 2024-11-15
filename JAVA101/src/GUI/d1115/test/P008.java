package GUI.d1115.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class P008 extends JFrame {

	
	public P008() {
		
		setTitle("문제8번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JButton("열기"));
		p1.add(new JButton("닫기"));
		p1.add(new JButton("나가기"));
		p1.setBackground(Color.gray);
		
		c.add(p1, BorderLayout.NORTH);
		
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		
		
		JLabel[] at = new JLabel[10]; 
		
		for(int i=0;i<at.length;i++) {
			
			int ranPosX = (int)(Math.random() * 100) * 2; 
			int ranPosY = (int)(Math.random() * 100) * 2; 

			at[i] = new JLabel("@");
			at[i].setLocation(ranPosX, ranPosY);
			at[i].setForeground(Color.RED);
			at[i].setSize(50,50);
			p2.add(at[i]);
			
		}

		c.add(p2, BorderLayout.CENTER);
		
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(new JButton("Word Input"));
		p3.add(new TextField(18));
		p3.setBackground(Color.ORANGE);
		
		c.add(p3, BorderLayout.SOUTH);
		
		
		
		
		
		setSize(280,350);
		setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P008();
	}

}

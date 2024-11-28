package GUI.d1115.test;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class P006 extends JFrame {

	private int width = 10;
	private int height = 10;
	
	public P006() {
		
		setTitle("문제6번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel[] labels = new JLabel[20];
		

		
		for(int i=0;i<20;i++) {
			
			int ranPosX = (int)(Math.random() * 250) + 50; 
			int ranPosY = (int)(Math.random() * 250) + 50; 
			
			// 이전 좌표 겹치는 부분 

			labels[i] = new JLabel("");
			labels[i].setOpaque(true);
			labels[i].setBackground(Color.BLUE);
			labels[i].setBounds(ranPosX, ranPosY, width, height);
			c.add(labels[i]);
			
		}

		
		setSize(350,350);
		setVisible(true);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P006();
	}

}

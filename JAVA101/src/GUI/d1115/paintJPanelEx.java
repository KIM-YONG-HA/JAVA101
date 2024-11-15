package GUI.d1115;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {

	
	private MyPanel panel = new MyPanel();
	
	
	public paintJPanelEx() {
		
		setTitle("test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		
		
		
		setSize(400, 400);
		setVisible(true);
		
	}
	
	
	class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			
			g.setColor(Color.red);
			g.drawRect(0, 0, 50, 50);
			
			
			g.setColor(new Color(100, 220, 50));
			g.drawRect(50, 50, 50, 50);
			
			
			g.setColor(new Color(0xffaa11));
			g.drawRect(100, 100, 50, 50);
			
			
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new paintJPanelEx();

	}

}

package GUI.d1114;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;

public class MouseWheel extends JFrame {
	
	public MouseWheel() {
		
		setTitle("클릭, 더블클릭 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		
		c.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {

				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component) e.getSource();
				c.setBackground(new Color(r,g,b));
				
				
				
			}
			
		});
		
		
		
		setSize(300, 200);
		setVisible(true);
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		new MouseWheel();

	}

}

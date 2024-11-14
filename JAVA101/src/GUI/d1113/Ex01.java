package GUI.d1113;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 클릭하면 hello 문자열 옮기기 


public class Ex01 extends JFrame {
	
	
	JLabel txt1 = new JLabel("Hello");
	
	
	public Ex01() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				int posX = e.getX();
				int posY = e.getY();
				txt1.setLocation(posX, posY);
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
			
		});
		
		
		c.setLayout(null);
		txt1.setSize(30,30);
		txt1.setLocation(0,0);
		c.add(txt1);
		
		
		
		setSize(300, 300);
		setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		new Ex01();
		
		
	}

}

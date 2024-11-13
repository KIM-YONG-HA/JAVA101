package GUI;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 클릭하면 hello 문자열 옮기기 


public class Ex02 extends JFrame {
	
	
	JLabel txt1 = new JLabel("Hello");
	
	
	public Ex02() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				int posX = e.getX();
				int posY = e.getY();
				txt1.setLocation(posX, posY);
				
				System.out.println(posX + " " + posY);
				
			}
			
		});
		
		
		c.setLayout(null);
		txt1.setSize(30,30);
		txt1.setLocation(0,0);
		c.add(txt1);
		
		
		
		setSize(300, 300);
		setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		new Ex02();
		
		
	}

}

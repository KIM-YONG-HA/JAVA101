package GUI.d1114;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {

	private JLabel la = new JLabel("No Mouse Event");
	
	
	public MouseListenerAllEx() {
		
		//super("MouseListener와 MouseMotionListener 예제");
		
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		
		MyMouseListener listener =  new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(la);
		
//		JLabel la2 = new JLabel("center");
//		la2.setLocation(150, 100);
//		c.add(la2);
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	

	
	class MyMouseListener implements MouseListener, MouseMotionListener {
	
		@Override
		public void mouseClicked(MouseEvent e) {}
	
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + "," + e.getY() + ")");
		}
	
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + "," + e.getY() + ")");
		}
	
		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component) e.getSource();
			c.setBackground(Color.CYAN);
			
		}
	
		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + "," + e.getY() + ")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + "," + e.getY() + ")");
			
		}
		
		
	}
	
	

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
	
	

}






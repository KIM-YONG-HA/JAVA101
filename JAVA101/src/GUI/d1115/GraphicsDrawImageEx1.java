package GUI.d1115;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx1 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	
	public GraphicsDrawImageEx1() {
		
		setTitle("test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		
		
		setSize(300, 420);
		setVisible(true);
		
		
		
	}

	
	class MyPanel extends JPanel {
		
		private ImageIcon icon = new ImageIcon("src/GUI/images/my_bg.jpg");
		private Image img = icon.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//g.drawImage(img, 0, 0, this);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			//g.drawImage(img, copyx1, copyy1, copyx2,copyy2 ,     )
			 // 넣을공간 rect좌표  , 가져올 이미지 rec 좌표
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		
		new GraphicsDrawImageEx1();
		
	}

}

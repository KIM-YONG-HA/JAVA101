package GUI.d1114;

import java.awt.*;
import javax.swing.*;


public class JLableEx extends JFrame {

	public JLableEx() {
		
		setTitle("레이블 예쩨");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("src/GUI/images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("src/GUI/images/normalIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new JLableEx();
	}

}

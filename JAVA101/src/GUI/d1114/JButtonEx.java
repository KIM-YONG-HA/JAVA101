package GUI.d1114;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonEx extends JFrame {

	
	public JButtonEx() {
		
	
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon nomalIcon = new ImageIcon("src/GUI/images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("src/GUI/images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("src/GUI/images/pressedIcon.gif");
		
		
		JButton btn = new JButton("call!!!", nomalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new JButtonEx();

	}

}

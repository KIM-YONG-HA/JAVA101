package GUI.d1113;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {

	
	public AnonymousClassListener() {
		
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn = new JButton("JAVA");
		c.add(btn);
		
		// 이벤트 처리를 위해 위의 방식으로 작성 
		// c.add(new JButton("Action");
		
		
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton b = (JButton)e.getSource();
				
				if(b.getText().equals("JAVA")) {
					
					b.setText("자바");
					c.setBackground(Color.black);
					
				} else {
					
					b.setText("JAVA");
					c.setBackground(Color.ORANGE);
					
				}
				
			}
			
		});
		
		setSize(350, 100);
		setVisible(true);
		
		
		
	}
	
	
	
	public static void main(String[] args) {

			new AnonymousClassListener();

	}

}

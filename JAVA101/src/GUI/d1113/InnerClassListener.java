package GUI.d1113;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	
	
	public InnerClassListener() {
		
		setTitle("Action 이벤트 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JButton btn = new JButton("Action2");
		
		btn.addActionListener(new MyActionListener());
		
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
		
		
	}
	
	
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action2")) {
				
				b.setText("액션2");
				
			} else {
				
				b.setText("Action2");
				
			}
			
			InnerClassListener.this.setTitle(b.getText());
			
			
		}
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new InnerClassListener();
		
		
	}

}

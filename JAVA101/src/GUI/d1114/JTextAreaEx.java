package GUI.d1114;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaEx extends JFrame {

	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	
	
	
	public JTextAreaEx() {
		
		setTitle("텍스트 영역 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 엔터 키 입력"));
		
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");
				
			}
		});
		
		
		
		
		
		
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new JTextAreaEx();

	}

}

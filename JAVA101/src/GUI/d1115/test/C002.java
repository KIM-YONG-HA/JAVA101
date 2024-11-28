package GUI.d1115.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class C002 extends JFrame {

	
	private JTextField inputField;
	private JComboBox<String> selectBox;
	
	
	public C002() {
		
		setTitle("컴포넌트 2번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 250);
		setLayout(new FlowLayout());
		
		inputField = new JTextField(10);
		
		inputField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JTextField inp = (JTextField) e.getSource();
				selectBox.addItem(inp.getText());
				inp.setText("");
				
			}
		});
		
		
		selectBox = new JComboBox<String>();
		selectBox.setBackground(Color.white);
		
		
		add(inputField);
		add(selectBox);
		
		
		setVisible(true);
		
		
		
	
		
		
		
	}

	public static void main(String[] args) {
		
		new C002();

	}

}

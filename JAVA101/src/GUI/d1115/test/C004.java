package GUI.d1115.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C004 extends JFrame {

	private JTextField totalInput = new JTextField(10);
	private JButton calcBtn;
	private JButton startBtn;
	private JTextField[] input = new JTextField[8];
	private JCheckBox[] changeChk = new JCheckBox[8];
	
	
	public C004() {
		
		setTitle("컴포넌트 4번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(330, 350);
		getContentPane().setBackground(new Color (0xFFB4B6));
		setLayout(new FlowLayout());
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(0xFFB4B6));
		
		topPanel.add(new JLabel("금액"));
		topPanel.add(totalInput);
		calcBtn = new JButton("계산");
		
		
		calcBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int[] change = {50000,10000,1000,500,100,50,10,1};
				int remain =  Integer.parseInt(totalInput.getText());
				int qoutient = 0;
				
				for(int i=0;i<change.length;i++) {
					
					if(!changeChk[i].isSelected()) {
						
						input[i].setText(Integer.toString(0));
						continue;
						
					} 
					
					qoutient = remain / change[i];
					
					if( qoutient != 0) {
						
						remain -= (change[i] * qoutient);
						input[i].setText(Integer.toString(qoutient));
						
					} else {
						
						input[i].setText(Integer.toString(0));
						
					}
					
				}
				
				
			}
			
			
		});
		
		
		topPanel.add(calcBtn);
		
		JPanel midPanel = new JPanel();
		midPanel.setLayout(new GridLayout(8,3,15,3));
		midPanel.setBackground(new Color (0xFFB4B6));
		String[] changeStr = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		
		
		for(int i=0;i<changeStr.length;i++) {
			
			JLabel label = new JLabel();
			label.setText(changeStr[i]);
			label.setHorizontalAlignment(JLabel.RIGHT);
			
			midPanel.add(label);
			
			input[i] = new JTextField(8);
			input[i].setHorizontalAlignment(JTextField.CENTER);
			midPanel.add(input[i]);
			
			changeChk[i] = new JCheckBox();
			changeChk[i].setBackground(new Color(0xFFB4B6));
			midPanel.add(changeChk[i]);
			
			if(i == changeStr.length-1) {
				
				changeChk[i].setSelected(true);
				changeChk[i].setVisible(false);
				
			}
				
			
		}
		
		add(topPanel);
		add(midPanel);
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new C004();

	}

}

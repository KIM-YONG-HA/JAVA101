package GUI.d1115.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class P007 extends JFrame {

	
	public P007() {
		
		setTitle("문제7번");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		top.add(new JLabel("수식입력"));
		top.add(new JTextField(20));
		top.setBackground(new Color(0xC6C6C6));
		
		c.add(top, BorderLayout.NORTH);
		
		
		JPanel mid = new JPanel();
		mid.setLayout(new GridLayout(4,3,3,3));
		
		String[] calcBtnVal = {"0","1","2","3","4","5","6","7","8","9","CE","계산","*","-","X","/"};
		JButton[] btns = new JButton[16];
		
		for(int i=0;i<calcBtnVal.length;i++) {
			String idx = String.valueOf(calcBtnVal[i]);
			
			
			btns[i] = new JButton(idx);
			
			if(i>=12) btns[i].setBackground(Color.CYAN);
			
			mid.add(btns[i]);

		}
		
		
		c.add(mid, BorderLayout.CENTER);
		

		
		JPanel btm = new JPanel();
		btm.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		JLabel btmLabel = new JLabel("계산결과");
		btmLabel.setFont( new Font("", Font.PLAIN, 16));
		
		btm.add(btmLabel);
		btm.add(new JTextField(22));
		btm.setBackground(Color.YELLOW);
		
		c.add(btm, BorderLayout.SOUTH);

		
		setSize(350,280);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		new P007();
	}

}

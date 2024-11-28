package GUI.d1115.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.d1114.ClickAndDoubleClickEx;

public class C001 {

	private JButton testBtn;
	
	public C001() {
		
		
		JFrame frame = new JFrame();
		
		frame.setTitle("컴포넌트 1번");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLayout(new BorderLayout());
		
		
		
		JPanel topPanel = new JPanel();
		
		topPanel.setLayout(new FlowLayout());
		
		
		JCheckBox disabledBtn = new JCheckBox();
		JLabel disabledLabel = new JLabel("버튼 비활성화");
		
		disabledBtn.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				System.out.println();
				
				if(e.getStateChange() == ItemEvent.SELECTED) { // 체크 상태
					
					testBtn.setEnabled(false);
					
				} else { // 체크 해제 
					
					testBtn.setEnabled(true);
					
				}
				
				
				
				
				
			}
		});
		
		
		topPanel.add(disabledBtn);
		topPanel.add(disabledLabel);
		
		
		
		JCheckBox showHideBtn = new JCheckBox();
		JLabel showHideLabel = new JLabel("버튼 감추기");
		
		
		showHideBtn.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange() == 1) { // 체크 상태
					
					testBtn.setVisible(false);
					
				} else { // 체크 해제 
					
					testBtn.setVisible(true);
					
				}
				
			}
		});
		
		
		
		topPanel.add(showHideBtn);
		topPanel.add(showHideLabel);
		

		

		JPanel midPanel = new JPanel();
		midPanel.setLayout(new FlowLayout());
//		
		testBtn = new JButton("test button");
//		
		midPanel.add(testBtn);
		
		
		
		
		
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(midPanel, BorderLayout.CENTER);
		
		
		
		
		
		
		frame.setVisible(true);
		
		
	
		
		
		
	}

	public static void main(String[] args) {
		
		new C001();

	}

}

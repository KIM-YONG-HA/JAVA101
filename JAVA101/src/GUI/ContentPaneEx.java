package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class ContentPaneEx extends JFrame {
	
	
	public ContentPaneEx() {
		
		setTitle("컨텐트 팬 확인");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 눌렀을 때 정싱적인 종료
		
		
		
		// 컨테이너에 컴포넌트 부착
		
		// 컨텐트 팬 : gui 컴포넌트의 부착 공간
		// 컨텐트 팬을 컨테이너에 담는다 
		
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		
		
		// 컴포넌트 위치 조정하기 위해 flow layout 
		
		c.setLayout(new FlowLayout());
		
		
		c.add(new JButton("OK"));
		c.add(new JButton("CXL"));
		c.add(new JButton("Ignore"));
		
		
		setSize(300,150);
		
		setVisible(true);
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {

		
		new ContentPaneEx();
		
		
		
	}

}

package GUI.d1114;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {

	private	String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry", "blackberry"};
	private ImageIcon[] images = {
			
			new ImageIcon("src/GUI/images/icon1.png"),
			new ImageIcon("src/GUI/images/icon2.png"),
			new ImageIcon("src/GUI/images/icon3.png"),
			new ImageIcon("src/GUI/images/icon4.png")
			
	};
	
	
	
	
	public ListEx() {
		
		setTitle("리스트 예제 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JList<String> strList = new JList<>(fruits);
		c.add(strList);
		
		
		JList<ImageIcon> imageList = new JList<>();
		imageList.setListData(images);
		c.add(imageList);
		
		
		JList<String> scrollList = new JList<>(fruits);
		c.add(new JScrollPane(scrollList));
		
		
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new ListEx();
	}

}

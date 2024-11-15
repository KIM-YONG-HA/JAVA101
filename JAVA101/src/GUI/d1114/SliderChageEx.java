package GUI.d1114;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChageEx extends JFrame {
	
	
	private JLabel colorLabel;
	private JLabel rgbCode;
	private JSlider[] slide = new JSlider[3];
	
	
	public SliderChageEx() {
		
		setTitle("슬라이더와 ChangeEvent");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		
		
		colorLabel = new JLabel("slider example");
		rgbCode = new JLabel("(0,0,0)");
		
		for(int i=0;i<slide.length;i++) {
			
			slide[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
			
			slide[i].setPaintLabels(true);
			slide[i].setPaintTicks(true);
			slide[i].setPaintTrack(true);
			
			slide[i].setMajorTickSpacing(50);
			slide[i].setMinorTickSpacing(10);
			
			slide[i].addChangeListener(new MyChangeListener());
			c.add(slide[i]);
			
		}
		
		
		slide[0].setForeground(Color.RED);
		slide[1].setForeground(Color.green);
		slide[2].setForeground(Color.blue);
		
		
		int r = slide[0].getValue();
		int g = slide[1].getValue();
		int b = slide[2].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
		
		
		
		
		
		//rgbCode.setLocation(0, 0);
		
		
		
		c.add(colorLabel);
		c.add(rgbCode);
		
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	

	
	
	class MyChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			
			int r = slide[0].getValue();
			int g = slide[1].getValue();
			int b = slide[2].getValue();
			
			colorLabel.setBackground(new Color(r,g,b));
			String rgb = "(" + r +"," + g +","+ b + ")";
			rgbCode.setText(rgb);
			
			
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		new SliderChageEx();
	}

}

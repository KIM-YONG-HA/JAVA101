package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartTetris {
	
	
	
	private JFrame frame;

	public StartTetris() {
		
		
		frame = new JFrame("Tetris");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(400,550);
		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		
		JLabel titleLabel = new JLabel("Welcome to Tetris", JLabel.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(titleLabel, BorderLayout.NORTH);
		
		
		
		
		JButton startButton = new JButton("game start");
		startButton.setFont(new Font("Arial", Font.BOLD, 20));


		
		JPanel startButtonPanel = new JPanel(new GridBagLayout());

		startButtonPanel.add(startButton);
		 
		frame.add(startButtonPanel, BorderLayout.CENTER);
		
		
		startButton.addActionListener(e -> gameStart());
		
		
		
		
		frame.setVisible(true);
	}
	
	
	private void gameStart() {
		

		frame.getContentPane().removeAll();
		frame.add(new GamePanel());
		frame.setBackground(new Color(0x000000));
		frame.revalidate();
		frame.repaint();
		
		
	}
	
	
	

}

package teris_old;

import javax.swing.JFrame;

public class TetrisFrame extends JFrame {

	
	public TetrisFrame() {
		
		setTitle("Tetris Game");
		setSize(400, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setLocationRelativeTo(null); // 화면 중앙에 표시 
		
		setVisible(true);
		
		// TetrisPanel 추가 
		
		TetrisPanel gamePanel = new TetrisPanel();
		add(gamePanel);
		
		
		
		
	}

	

}

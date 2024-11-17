package teris_old;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TetrisBoard extends JPanel {

	int BOARD_WIDTH;
	int BOARD_HEIGHT;
	private int[][] board;
	
	
	public TetrisBoard() {
		
		
		initBoard();
		
	}
	
	
	void initBoard() {
		
		BOARD_WIDTH = 10;
		BOARD_HEIGHT = 20;
		
		board = new int[BOARD_HEIGHT][BOARD_WIDTH];
		
		for (int row = 0; row < BOARD_HEIGHT; row++) {

			for (int col = 0; col < BOARD_WIDTH; col++) {

				board[row][col] = 0;

			}

		}
		
		
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		int CELL_SIZE = 25;
		
		for(int row=0;row<BOARD_HEIGHT;row++) {
			
			for(int col=0;col<BOARD_WIDTH;col++) {
				
				if(board[row][col] == 0) {
					
					g.setColor(Color.LIGHT_GRAY);
					
				} else {
					
					g.setColor(Color.BLUE);
					
				}
				
				
				g.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);

				g.setColor(Color.black);
				g.drawRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
			
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}

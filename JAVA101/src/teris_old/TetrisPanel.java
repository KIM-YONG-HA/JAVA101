package teris_old;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TetrisPanel extends JPanel implements KeyListener {

	private static final int BOARD_WIDTH = 10; // 가로 칸수
	private static final int BOARD_HEIGHT = 20; // 세로 칸 수 
	private static final int CELL_SIZE = 30; // 블록 크기 

	private int[][] board;
	private int currentX = BOARD_WIDTH / 2;
	private int currentY = 0;
	
	
	public TetrisPanel() {
		
		
		board = new int[BOARD_HEIGHT][BOARD_WIDTH];
		
		
		setFocusable(true);
		addKeyListener(this);

		
		
		board[currentY][currentX] = 1;
		
//		Timer timer = new Timer(500,  e -> updateGame());
//		timer.start();
		
		
		
		
	}

	
	
	
	
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		
		
		
		for(int y=0;y<BOARD_HEIGHT;y++) {
			
			for(int x=0;x<BOARD_WIDTH;x++) {
				
				if(board[y][x] == 1) {
					
					g.setColor(Color.cyan);
					g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
					
				} else {
					
					g.setColor(Color.gray);
					g.drawRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
					
				}
				
				
				
			}
		}
		
		
		
		
		
	}












	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}

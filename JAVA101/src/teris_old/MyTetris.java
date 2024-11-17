package teris_old;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTetris extends JFrame {
	
	
	public MyTetris() {
		
		
		setTitle("테트리스");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1024, 567);
		
		
		// 메뉴 패널
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new GridBagLayout());
		add(menuPanel);
		
		
		// 게임 시작 버튼 
		JButton startButton = new JButton("START");
		startButton.setFont(new Font("Arial", Font.BOLD, 20));
		menuPanel.add(startButton);
		
		
//		startButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				startGame();
//				
//			}
//		});
//		
		
		startButton.addActionListener(e -> startGame());

		
		
		
		setVisible(true);
		
		
		
		
	}
	
	
	
	private void startGame() {
		
		getContentPane().removeAll();
		

		//add(new TetrisBoard());
		
		TetrisBoard board = new TetrisBoard();
		add(board);
		
		
		// 레이아웃 관리자가 다시 동작하도록 요청
		// 컴포넌트 크기, 위치, 배치가 변경 됐을 때 
		revalidate();
		
		// 시각적 업데이트
		// 컴포넌트 그래픽 변경시
	    repaint();
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new MyTetris();
		
	}

}

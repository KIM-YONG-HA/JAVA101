package d1107.am;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	public static void main(String[] args) {

		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<5;i++) {
			
			toolkit.beep();
			System.out.println("beep");
			
			// Thread는 예외처리 필수
			try {
				
				Thread.sleep(500);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		
		
		
		
		
	}

	
	
	@Override
	public void run() {
		

		
		
		
	}
	
	

}

package d1107.am;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		
		for(int i=0;i<10;i++) {
			
			toolkit.beep();
			System.out.println("beep~~");
			try {
				
				Thread.sleep(3000);
						
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		

	}

}

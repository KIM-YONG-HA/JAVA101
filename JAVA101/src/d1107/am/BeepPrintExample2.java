package d1107.am;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
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
			
		});
		
		
		thread.start();
		
		thread.setName("비프음 쓰레드");
		System.out.println(thread.getName());
		
		for(int i=0;i<5;i++) {
			
			
			System.out.println("띵~");
			
			try {
				
				Thread.sleep(500);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		
		
		
		
		
		
	}

}

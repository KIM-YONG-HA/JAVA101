package d1107.am;

public class InterruptExample {

	public static void main(String[] args) {
		
		
		
		Thread thread = new PrintThread2();
		
		
		thread.start();
		
		try {

			Thread.sleep(1000);
			
		} catch (Exception e) {
			
			
		}
		
		
		thread.interrupt();
		

	}

}



class PrintThread2 extends Thread {

	
	int count;
	
	
	
	
	
	public PrintThread2() {
		count = 0;
	}

	@Override
	public void run() {
	
		try {
			
			while(true) {
				
				System.out.println("실행중 ");
				Thread.sleep(1);
				count++;
			}
			
		} catch(InterruptedException e) {
			
			System.out.println(e);
			
			
		}
		
		System.out.println("자원정리 ");
		System.out.println("실행종료 ");
		
		System.out.println(count);
		
	}
	
	
	
	
	
	
	
	
}
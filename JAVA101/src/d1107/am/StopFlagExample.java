package d1107.am;

public class StopFlagExample {

	public static void main(String[] args) {
		
		
		
		
		PrintThread1 p1 = new PrintThread1();
		
		p1.start();
		
		try {
			
			Thread.sleep(1000);
			
		} catch(InterruptedException e) {
			
			
			
		}
		
		
		
		p1.setStop(true);
		
		

	}

}



class PrintThread1 extends Thread {
	
	public int count;
	private boolean stop;

	
	public PrintThread1() {
		count = 0;
	}
	
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		
		while(!stop) {
			
			System.out.println("실행중");
			count++;
			//if() stop = true;
			
		}
		
		System.out.println("실행 종료!");
		System.err.println(count);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


package d1107.am;

public class MainThreadExample {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		
		
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
		
		

	}

}



class Calculator {
	
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public  void setMemory(int memory) {
		
		this.memory = memory;
		
		
		try {
			
		Thread.sleep(500);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		
		
	}
	
	
	
}


class User1 extends Thread {
	
	
	private Calculator calc;
	
	public void setCalculator(Calculator calc) {
		
		this.setName("user1");
		this.calc = calc;
		
		
	}
	
	public void run() {
		
		calc.setMemory(100);
		
		
	}
	
	
}




class User2 extends Thread {
	
	
	private Calculator calc;
	public void setCalculator(Calculator calc) {
		
		this.setName("user2");
		this.calc = calc;
		
		
	}
	
	public void run() {
		
		calc.setMemory(50);
		
		
	}
	
	
}





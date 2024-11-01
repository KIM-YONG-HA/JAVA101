package d1101;

public class Bus implements Vehicle {

	@Override
	public void run() {
		
		System.out.println("버스가 달린다...");

	}
	
	
	public void check() {
		
		System.out.println("요금을 확인!");
		
	}
	
	

}

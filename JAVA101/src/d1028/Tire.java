package d1028;

public class Tire {
	
	
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	public Tire(String location, int maxRotation) {

		this.maxRotation = maxRotation;
		this.location = location;
		
	}
	
	
	
	public boolean roll() {
		
		++accumulatedRotation;
		
		
		if(accumulatedRotation < maxRotation) {
			
			System.out.println(location + " Tire 수명 : " + (maxRotation-accumulatedRotation) + "회" );
			return true;
			
		} else {
			
			System.out.println("***" + location + " Tire 펑크 *** ");
			return false;
		}
		
	}
	
	
	
	
	
	
	

}

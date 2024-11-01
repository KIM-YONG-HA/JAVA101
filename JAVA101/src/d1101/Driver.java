package d1101;

public class Driver {
	
	public void drive(Vehicle vh) {
		
		
		if(vh instanceof Bus) {
			
			Bus bus = (Bus) vh;
			bus.check();
			
		}
		
		vh.run();
		
	}

}

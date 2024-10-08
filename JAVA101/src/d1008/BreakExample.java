package d1008;

public class BreakExample {

	public static void main(String[] args) {
		
		
		while(true) {
			
			int num = (int) (Math.random() * 5) + 1;
			
			System.out.println(num);
			if(num == 5) {
				
				System.out.println("break");
				break;
				
			}
				
		}
		

	}

}

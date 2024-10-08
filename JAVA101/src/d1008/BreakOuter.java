package d1008;



public class BreakOuter {

	public static void main(String[] args) {
		
		
		
		
		Outer : for(char upper = 'A'; upper <= 'Z'; upper++) {
			
			
			System.out.println(upper);
			
			if(upper == 'B') break Outer;
			
			for(char lower = 'a'; lower<='z'; lower++) {
				
				System.out.printf("%s - %s%n", upper, lower);
				
				//if(lower == 'g') break Outer;
				
				
				
			}
			
			
			
		}
		
		
		
		// 특정 알파벳이 몇번째인지도 가능할 듯...
		

	}

}

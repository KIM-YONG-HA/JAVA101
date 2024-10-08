package d1008;

import javax.sql.rowset.serial.SQLOutputImpl;

public class BreakOuter {

	public static void main(String[] args) {
		
		
		
		
		Outer : for(char upper = '가'; upper <= 'Z'; upper++) {
			
			
			//System.out.println(upper);
			
			
			for(char lower = 'a'; lower<='z'; lower++) {
				
				//System.out.printf("%d - %d", upper, lower);
				
				System.out.println(upper);
				
			}
			
			
			
		}
		
		
		
		// 특정 알파벳이 몇번째인지도 가능할 듯...
		

	}

}

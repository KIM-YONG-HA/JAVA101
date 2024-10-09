package starPatternPrinting;

import java.util.Iterator;

public class Pattern03 {

	public static void main(String[] args) {

		
//		오른쪽 정렬 직각삼각형 (Right-Aligned Right-Angled Triangle)
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		
		
		int rows = 5;
		
		
		for (int i = 1; i <= rows; i++) { 
           
            for (int j = 1; j <= rows - i; j++) { 
            	
                System.out.print(" ");
                
            }
            
            
            for(int k = 1; k <= i; k++) {
            	
            	System.out.print("*");
            	
            }
            
            System.out.println(); 
            
        }
		
		

	}

}

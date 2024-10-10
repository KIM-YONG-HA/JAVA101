package d1010;

public class Test02 {

	public static void main(String[] args) {
		
		
		
		
		
//		패턴 1
//		*
//		**
//		***
		
		System.out.println("패턴1");
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
//		패턴 2
//		
//		   *
//		  **
//		 ***
//		****
		
		
		System.out.println();
		System.out.println("패턴2");
		int rows = 4;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= rows - i; j++ ) { // if문 사용시 j--, i>j 비교 
				
				System.out.print(" ");
				
			}
			
			for(int k = 1; k <= i; k++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
		
//		패턴3
//		    *      4/1
//		   ***	   3/3
//		  *****    2/5
//		 *******   1/7
//		*********  0/9
		
		
		// 다른 로직 
		// for(int i = 0; i < 5; i++)
		// for(int j = 1; i < 5-i;j++)
		// for(int k = 0; k < (i*2)+1;k++)
		
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			
			
			for(int j = 1; j <= 5 - i; j++) {
				
				System.out.print(" ");
				
			}
			
										        // i : 1, 2, 3, 4, 5
			for(int k = 1; k<=(2 * i) - 1; k++) { // k : 1, 3, 5, 7, 9
				
				System.out.print("*");
				
			}
			
			
			
			System.out.println();
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}

package d1010;

public class Test01 {

	public static void main(String[] args) {
		
		// 2~9단까지 출력 
		// 중첩 for문 사용 
		
		for(int i = 2; i <= 9; i++) {
			
			
			System.out.printf("%d 단 출력 %n", i);
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%d x %d = %d %n", i, j, (i*j));
				
			}
			
			System.out.println();
			
		}
		
		

		
		
		
		
		
		
		
		

	}

}


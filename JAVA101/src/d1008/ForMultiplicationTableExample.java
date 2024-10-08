package d1008;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		
		// n 단만 출력 
		
//		System.out.println("n단 출력");
//		for(int i = 1; i <= 9; i++) {
//			
//			System.out.printf(" 2 x %d = %2d%n", i, 2*i);
//			
//		}
//		
		
		// 2~9단까지 모두 출력 
		
		for(int i = 2; i <= 9; i++) {
			
			System.out.printf("%d단 출력%n", i);
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%d x %d = %2d%n",i,j,(i*j));
				
			}
			
			System.out.println();
			
		}
		
		
		

	}

}

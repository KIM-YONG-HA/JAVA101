package d1008;

public class Test04 {

	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 짝수만 출력, 짝수 합 출력
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0) {
				
				sum += i;
				System.out.print(i + ", ");
				
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("1~100사이 짝수의 합은 " + sum);
		
		
		
		
		
		
		
		
		
		

	}

}

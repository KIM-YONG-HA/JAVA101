package d1011;

import java.util.Scanner;

public class MiniTest02 {

	public static void main(String[] args) {
		
		
//		
//		2. 1부터 사용자에게 입력 받은 수까지
//		정수들의 합을 출력하세요.
//		ex )
//		정수를 하나 입력하세요 : 5
//		1 + 2 + 3 + 4 + 5 = 15
//		
//		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int inp = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=inp; i++) {
			
			sum += i;
			
			if(i < inp) {
				
				System.out.printf("%d + ", i);
				
			} else {
				
				System.out.printf("%d = %d ", i, sum);
				
			}
			
		}
		
		
		
		
		

	}

}

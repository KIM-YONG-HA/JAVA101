package d1008;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		
		// 사용자로부터 값을 2개 입력 받음
		// 작은 수부터 큰 수까지 반복, 출력
		// 출력은 홀수만 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 숫자 입력 : ");
		int x = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int y = sc.nextInt();
		int z;
		
		// 변수 2개로 삼항연산자 가능
		//int startNum = x < y ? x : y;
		//int maxLen = x < y ? y : x;
		 
		if(x > y) {
			
			 z = x;
			 x = y;
			 y = z;
			
		}
		
		
		System.out.println("작은 수는 : " + x);
		System.out.println("큰 수는 : " + y);
		
		
		System.out.println("----------------홀수만 출력시작---------------");
		for(int s = x; s <= y; s++) {
			
			if(s%2 == 1) System.out.println(s);
			
		}
		
		

		
		
		
		

	}

}

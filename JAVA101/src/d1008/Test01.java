package d1008;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int inp = sc.nextInt();
		
		if(inp % 2 == 0) {
			
			System.out.println(inp +"는 짝수입니다");
			
		} else {
			
			System.out.println(inp +"는 홀수입니다");
			
		}
		
		
		
	}

}

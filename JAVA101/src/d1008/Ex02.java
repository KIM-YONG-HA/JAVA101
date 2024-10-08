package d1008;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// 부장 : 700만원 출력
		// 과장 : 500만원 출력
		// 나머지 300만원 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직급 입력 : ");
		String pos = sc.nextLine();
		
		switch(pos) {
		
			case "부장" : System.out.println("700만원 "); break;
			case "과장" : System.out.println("500만원 "); break;
			default: System.out.println("300만원 ");
		
		}
		
		

	}

}

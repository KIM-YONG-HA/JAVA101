package d1004;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		
		// Scanner 
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력해주세요 : ");
//		
//		String str = sc.nextLine();
//		
//		System.out.println(str);
		
//		
//		System.out.print("정수를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.println("입력한 값은 : " + a);
//		

		
		System.out.print("시력 입력 : ");
		double d = sc.nextDouble();
		
		System.out.println("시력은 : " + d);
		
		
		String s1 = sc.next(); // 엔터도 인식되는 경우도 있음
		String s2 = sc.nextLine(); // 한 줄
		
		
		
		
		

	}

}

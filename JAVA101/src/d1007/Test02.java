package d1007;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		// 스캐너 선언
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("첫번째 정수값 입력 : ");
		String str1 = sc.nextLine();
		System.out.print("두번째 정수값 입력 : ");
		String str2 = sc.nextLine();
		System.out.println("-------------------");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int rs = num1 + num2;
		System.out.println(rs);
		
		
		
		
		
		
		
		
		

	}

}

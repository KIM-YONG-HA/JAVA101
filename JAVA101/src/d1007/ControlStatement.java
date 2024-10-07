package d1007;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		// 제어문(조건문, 반복문)
		
		
		
		// 조건문 
		
		
//		int a = 10;
//		
//		if(a == 10) {
//			
//			System.out.println("10이다");
//			
//		} else {
//			
//		
//			
//			
//		}
//		
//		
		
		
		// if-else문
		
//		int score = 93;
//		
//		if(score >= 90) {
//			
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다");
//			
//		} else {
//			
//			System.out.println("00");
//			
//		}
		
		
		// if-else if-else문
		
		
		
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();

		
//		A 91~100
//		B 81~90
//		C 71~80
//		D 70 이하
		
		String grade = "";
		String range = "";
		
		if(score >= 91 && score <= 100) {
			
			grade = "A";
			range = "91 ~ 100";
			
		} else if(score >= 81 && score <= 90) {
			
			grade = "B";
			range = "81 ~ 90";
			
		} else if(score >= 71 && score <= 80) {
			
			grade = "D";
			range = "71 ~ 80";
			
			
		} else {
			
			grade = "D";
			range = "70 이하";
			
		}
		
		System.out.println("점수 : " + score);
		System.out.println("점수가 " + range + "입니다");
		System.out.println("등급은 " + grade + "입니다");
		
		
		
		
		
		
		
		
		

	}

}

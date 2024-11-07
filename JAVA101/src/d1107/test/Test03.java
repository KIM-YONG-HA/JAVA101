package d1107.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		
//		
//		3. 사용자에게 6과목 등급을 공백으로 구분하여 입력하게 합니다.
//		입력받은 학점은 ArrayList 에 저장합니다. 리턴 타입은 Character.
			
//		A ~ F 등급까지 있으며  A:4점 B:3점 C:2점 D:1점 F는 0점 입니다.
//		입력받은 등급으로 학점을 출력하세요
		
//		예시 : 
//		6과목 학점을 공백으로 구분하여 입력 : 
//		A A B B C C
//		학점의 점수 합 : 18
//
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("6과목 등급 공백으로 구분하여 입력");
		String strGrade = sc.nextLine();
		List<Character> list = new ArrayList<>();
		
		
		System.out.println(strGrade.length());
		
		for(int i=0;i<strGrade.length();i++) {
			
			System.out.println(i);
			//list.add(strGrade.charAt(i*2));
			
		}
		
	
		
		
		
		
		int gradeToPoint = 0;
		
		
		
//		
//		
//		switch(tmp) {
//		
//			case "a":
//			case "A": ; break;
//			
//			case "b":
//			case "B": ; break;
//			
//			case "c":
//			case "C": ; break;
//				
//			case "d":
//			case "D": ; break;
//			
//			case "f":
//			case "F": ; break;
//			
//			default :
//		
//		}
//		
		
		
		System.out.println("학점의 점수 합 : " + gradeToPoint);
		
		
		
		
		
		
		

	}

}

package j241007;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.round;


public class MathClass {

	public static void main(String[] args) {
		

		// Math Class의 생성자는 접근 제어자가 private이기 때문에 
		// 다른 클래스에서 인스턴스 생성 불가
		
		double a = 90.7652;
		a *= 100;
		
		System.out.println(a);
		System.out.println(round(a));
		
		System.out.println("반올림 : " + round(90.5));
		System.out.println("올림 : " + ceil(0.1));
		System.out.println("버림 : " + floor(2.5));
		
//		
//		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		
//		System.out.println(score[4]);
		
		
		
		
		
		
		

	}

}

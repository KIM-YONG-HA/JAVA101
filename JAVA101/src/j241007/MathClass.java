package j241007;

public class MathClass {

	public static void main(String[] args) {
		

		// Math Class의 생성자는 접근 제어자가 private이기 때문에 
		// 다른 클래스에서 인스턴스 생성 불가
		
//		double a = 90.7652;
//		a *= 100;
//		
//		System.out.println(a);
//		System.out.println(round(a));
//		
//		System.out.println("반올림 : " + round(90.5));
//		System.out.println("올림 : " + ceil(0.1));
//		System.out.println("버림 : " + floor(2.5));
//		
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
		
		
		// 난수 생성 
		// Math.random()
		
		double ran1 = Math.random(); // 0.0 <= num <= 0.99 
		System.out.println(ran1);
		System.out.println();
		
		int ran2 = (int)(Math.random() * 10); // 0 <= num <= 9
		System.out.println(ran2);
		System.out.println();
		
		int ran3 = (int)(Math.random()*10) + 1; // 0 + 1 <= num <= 9 + 1, 1에서  10까지 
		System.out.println(ran3);
		System.out.println();
		
		
		int ran4 = (int)(Math.random() * 11 ) - 10;  // (0.0 X 11) - 10 <= num <= (0.99 x 11) - 10, -10에서 10까지  
		System.out.println(ran4);
		System.out.println();
		
		
		
		
		// 소수점 자리 ....
		// round(), ceil(), floor();
		
		
		
		
		// 제곱근 
		// sqrt()
		
		double a = Math.sqrt(3); // √ 3
		double b = Math.sqrt(4); // √ 4
		double c = Math.sqrt(5); // √ 5
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		double aa = Math.sqrt(3*3); // √ 3X3
		double bb = Math.sqrt(4*4); // √ 4X4
		double cc = Math.sqrt(5*5); // √ 5X5
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println();
		
		double calc = Math.sqrt(3*3 + 4*4); // // √ 3X3 + √ 4X4 
		System.out.println(calc);
		
		

	}

}

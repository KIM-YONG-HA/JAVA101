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


/*
//난수 생성 예제
//Java의 Math.random() 메서드를 사용하여 난수를 생성하는 방법을 알아보겠습니다.

public class RandomExample {
 public static void main(String[] args) {
     // 1. 0.0 이상 1.0 미만의 난수 생성
     // Math.random() 메서드는 0.0 (포함)에서 1.0 (미포함) 사이의 난수를 반환합니다.
     double ran1 = Math.random(); // 0.0 <= num < 1.0
     System.out.println("0.0 이상 1.0 미만의 난수: " + ran1);
     System.out.println();
     
     // 2. 0부터 9까지의 정수 난수 생성
     // (Math.random() * 10) 의 결과는 0.0 (포함)에서 10.0 (미포함) 사이의 실수입니다.
     // 이를 정수로 변환하기 위해 (int)로 캐스팅합니다. 이 경우 0부터 9까지의 정수가 생성됩니다.
     int ran2 = (int)(Math.random() * 10); // 0 <= num <= 9
     System.out.println("0부터 9까지의 정수 난수: " + ran2);
     System.out.println();
     
     // 3. 1부터 10까지의 정수 난수 생성
     // 1을 더함으로써 난수의 범위를 1에서 10으로 이동합니다.
     int ran3 = (int)(Math.random() * 10) + 1; // 1 <= num <= 10
     System.out.println("1부터 10까지의 정수 난수: " + ran3);
     System.out.println();
     
     // 4. -10부터 10까지의 정수 난수 생성
     // (Math.random() * 11)의 결과는 0.0 (포함)에서 11.0 (미포함) 사이의 실수입니다.
     // 여기에 -10을 더함으로써 난수의 범위를 -10에서 0까지로 이동시킵니다.
     // 따라서 최종적으로 -10부터 10까지의 정수가 생성됩니다.
     int ran4 = (int)(Math.random() * 11) - 10; // -10 <= num <= 0
     System.out.println("-10부터 0까지의 정수 난수: " + ran4);
     System.out.println();
 }
}

Java의 Math.random()을 이용한 난수 생성
Java에서 난수를 생성할 때 가장 많이 사용되는 방법 중 하나가 Math.random() 메서드입니다. 이 메서드는 0.0 (포함)에서 1.0 (미포함) 사이의 난수를 생성하는 데 사용됩니다. 위 코드에서는 이를 활용하여 다양한 범위의 난수를 생성하는 방법을 살펴보았습니다.

실수 난수 생성: Math.random()을 사용하여 생성된 실수 난수는 0.0 이상 1.0 미만의 값을 가집니다. 이 값은 주로 확률 계산이나 비율을 사용할 때 유용합니다.

정수 난수 생성: 정수 범위를 지정하고 싶을 때는 Math.random()으로 생성된 값을 특정 값으로 곱한 후, (int)로 캐스팅하여 정수로 변환합니다. 

예를 들어, 0부터 9까지의 정수 난수를 생성하기 위해 10을 곱한 후 정수형으로 변환합니다.

범위 조정: 원래 난수의 범위를 이동시키고 싶다면, 생성된 난수에 상수를 더하거나 빼는 방법을 사용합니다. 예를 들어, 1에서 10까지의 난수를 생성하기 위해 10을 곱한 후 1을 더합니다.

음수 포함 난수 생성: 특정 범위에 음수를 포함하고 싶을 때는 음수의 시작점에서 양수 범위를 지정하여 연산합니다. 예를 들어, -10부터 10까지의 난수를 생성하기 위해 (Math.random() * 11) - 10와 같은 방식을 사용할 수 있습니다.

이와 같이 Math.random() 메서드를 활용하면 다양한 형태의 난수를 쉽게 생성할 수 있습니다. 필요에 따라 난수의 범위와 형식을 조정하여 다양한 상황에 맞게 사용할 수 있습니다.

*/







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



// Math.random() 메서드
// 0.0 (포함)에서 1.0 (미포함) 사이 난수를 반환.


// 0.0 이상 1.0 미만의 난수 생성
 double ran1 = Math.random(); // 0.0 <= num < 1.0
 System.out.println("0.0 이상 1.0 미만의 난수: " + ran1);
     System.out.println();
  
     
     // 0부터 9까지의 정수 난수 생성
 // (Math.random() * 10) 의 결과는 0.0 (포함)에서 10.0 (미포함) 사이의 실수
 // 정수로 변환하기 위해 (int)로 캐스팅 
 // 0부터 9까지의 정수가 생성
 int ran2 = (int)(Math.random() * 10); // 0 <= num <= 9
 System.out.println("0부터 9까지의 정수 난수: " + ran2);
 System.out.println();
 
 
 // 1부터 10까지의 정수 난수 생성
 // 1을 더함으로써 난수의 범위를 1에서 10으로 변경
 // 0 + 1 <= num <= 9 + 1
 // 1 <= num <= 10
 
 int ran3 = (int)(Math.random() * 10) + 1;
 System.out.println("1부터 10까지의 정수 난수: " + ran3);
 System.out.println();


 
 // -10부터 10까지의 정수 난수 생성
 // (Math.random() * 21)의 결과는 0.0 (포함)에서 21.0 (미포함) 사이의 실수입니다.
 // 여기에 -10을 더해 난수의 범위를 -10에서 10
 // -10부터 10까지의 정수가 생성
 int ran4 = (int)(Math.random() * 21) - 10; // -10 <= num <= 0
 System.out.println("-10부터 0까지의 정수 난수: " + ran4);
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




Java의 Math.random()을 이용한 난수 생성

Java에서 난수를 생성할 때 가장 많이 사용되는 방법 중 하나가 Math.random() 메서드.

random() 메서드는 0.0 (포함)에서 1.0 (미포함) 사이의 난수를 생성하는 데 사용. 

생성된 실수 난수는 0.0 이상 1.0 미만의 값을 가집니다. 
 
배열의 인덱스값을 랜덤으로 생성해서 배열을 셔플하거나, 1~45 범위의 로또 번호 생성 등에 사용



실수 이기 때문에 정수를 원한다면 (int)로 캐스팅하여 정수로 변환 




     
 정리 
 
 시작수를 n, 종료를 m 이라고 할 때(이때 n,m은 양의 정수)
 
 (int)(Math.random() * m) + n
 ex) 1 ~ 45
 (int)(Math.random() * 45) + 1
 ex) 0 ~ 5
 (int)(Math.random() * 5)

 시작수를 n, 종료를 m 이라고 할 때(이때 n은 음의 정수)
 (int)(Math.random()∗(m−n+1))+n
 ex) -10 ~ 10 
 (int)(Math.random()∗(10-(-10)+1)) - 10
 ex) - 2000 ~ 4000
 (int)(Math.random()∗(4000−(-2000)+1)) - 2000
 
 n, m의 절대값을 더한 후 1 더해주면 종료값이라 생각하면 편하다 => 6001






*/







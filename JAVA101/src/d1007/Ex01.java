package d1007;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 연산자(Operator)
		
		// 산술 부호 문자열 대입 증감 비교 논리 조건 
		
		
		
		// 우선순위
		
		// 단항->이항->삼항
		// 산술->비교->논리->대입
		
		
		// 대부분 좌에서 우
		// 우선순위 같다면 왼쪽부터 수행
		// 100 / 2 * 3 % 5
		
		
		// 증감, 대입은 우에서 좌로 
		// int a += 1; int a = a + 1
		// a = b = c = 5
		
		
		// 논리곱 a && b => true 1 x false 0 
		
		
		
		// 단항연산자 ++x;
		// 이항연산자 x + y;
		// 삼항연산자 (sum > 90) ? A : B;
		
		
		
		// 증감연산자 
		
		int a = 10;
		int b = 10;
		int rs1 = ++a + 10; // a증가 1 => 11 + 10,
		int rs2 = b++ + 10; // 10 + 10 계산 후 b증가1
		
		
		System.out.println(rs1); // 21
		System.out.println(rs2); // 20
		System.out.println(b); // 11
		

//		++a; // 다른 연산 수행 전 피연산자 1증가		
//		a++; // 다른 연산 수행 후 피연산자 1증가
		

		
		
		System.out.println("----------");
		
		int x = 1;
		int y = 1;
		int z = 0;
		
		++x;
		y++;
		
		System.out.println(x); // 2
		System.out.println(y); // 2
		
		
		System.out.println("---");
		z = x++;
		// z = x;
		// x = x+1;
		System.out.println(z); // 2
		System.out.println(x); // 3
		System.out.println("---");
		
		
		
		// 논리부정연산자(!)
		// boolean 타입에서만 사용 가능 
		
		
		
		
		// 비교 연산자 
		boolean flag = (10 > 5) ? true : false;
		System.out.println(flag);
		
		
		

		
		// AND 논리곱 &&
		
		// T && T => T, 1 + 1 = 1
		// T && F => F, 1 + 0
		// F && T => F, 0 + 1
		// F && F => F, 0 + 0 
		
		
		
		// OR 논리합 ||
		// T || T => T
		// T || F => T
		// F || T => T
		// F || F => F
		
		
		// XOR 배타적논리합 ^
		// T ^ T => F
		// T ^ F => T
		// F ^ T => T
		// F ^ F => T
		
		// NOT 논리부정 !
		// !T => F
		// !F => T
		
		
		
		
		
		
		// 복합대입연산자 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}



package d1004;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		// public : 누구나 접근 가능  
		// private :
		
//		char a = 'A';
//		System.out.println(a);
		
		
		// 강제 형변환 (캐스팅)
		// 작은타입 변수명 = (작은 타입)큰타입
		int x = 10;
		
		byte z = (byte)x;
		
		
		// 자동 형변환
		
		byte a = 3;
		byte b = 7;
		//int rs = a + b;
		
		
		// 연산자 
		
		
		
		int intValue = 10;
		double doubleValue = 5.5;
		
		int rs = intValue + (int)doubleValue; // int로 형변환시 소수점 버림 
		//double rs = intValue + doubleValue; 
		
		System.out.println(rs);

		
		
		

		// + 연산 
		System.out.println(a+b+"문자열");
		System.out.println(a+"문자열"+b);
		System.out.println("문자열"+a+b);
		
		// 앞에서 부터 연결
		// 문자열을 만나면 연결이 된다
		// 
		
		
		
		
		

	}

}



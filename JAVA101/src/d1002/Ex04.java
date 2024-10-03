package d1002;

public class Ex04 {

	public static void main(String[] args) {
		
		int a = 127;
		byte b = (byte)a; // 강제형 변환
		
		//System.out.println(b);
		
		double x = 5.0;
		int y = (int)x;
		System.out.println(y);
		
		
		
		int n1 = '김';
		int n2 = '용';
		int n3 = '하';

		char c4 = (char)n1;
		char c5 = (char)n2;
		char c6 = (char)n3;
		
			
		System.out.println(""+c4+c5+c6);
		
		
		
		int num1 = 100;
		long num2 = 100L;
		long rs = num1 + num2; // 더 큰 타입으로 자동 형변환 
		
		
		// byte to char
		// 자동 형변환 불가, byte 범위에 음수 포함되기때문
		
		
		
		// long to float, double
		
		// long 8byte , float 4byte
		
		// 지수표기법으로 자동타입변환 가능
		
		// 500 ->5E2f
		
		
		
		int ii = 10;
		double dd = 5.5;
		
		int rr = (int) (ii + dd);
		
		System.out.println(rr);
		
		
		
		
		
		
	}

}

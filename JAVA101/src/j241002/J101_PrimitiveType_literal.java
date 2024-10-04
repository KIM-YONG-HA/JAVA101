package j241002;

public class J101_PrimitiveType_literal {

	public static void main(String[] args) {
		// literal : 소스코드에서 개발자에 의해 직접 입력된 값
		
		// 다음의 경우 정수로 인식 
		// 2진수 : Ob, 0B로 시작 / 0과 1로 구성 
		// 8진수 : 0부터 시작, 0~7로 구성
		// 10진수 : 0~9 로 구성 
		// 16진수 : 0x, 0X로 시작 0~9 / A(10),B,C,D,E,F(15) 
		
		
		
		// 진수 변환 
		
		// 8진수 : 206
		// 2진수로 변환 
		// 010 000 110
		// 128+4+2
		// 가중치로 10진수로 변환 
		// 134
		
		
		// 16진수 : B3
		// 11 3
		// 2진수 변환
		// 1011 0011
		// 128 + 32 + 16 + 2 + 1
		
		
		
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수
		
		System.out.println("2진수 : " + var1);
		System.out.println("8진수 : " + var2);
		System.out.println("10진수 : " + var3);
		System.out.println("16진수 : " + var4);
		
		
		
		
		
	}

}

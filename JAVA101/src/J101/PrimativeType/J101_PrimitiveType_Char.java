package J101.PrimativeType;

public class J101_PrimitiveType_Char {
	public static void main(String[] args) {
		
		// char
		// 메모리 : 2Byte(16bit)
		// 범위 : 0 ~ (2^16-1) / 0 ~ 65533

		// 문자 리터럴 : 작은 따옴표에 감싼 형태 
		// 유니코드 : 아스키 코드에서 확장 
		
		
		char c11 = 'A'; // 문자
		char c22 = 65; // 10진수
		char c33 = '\u0041'; // 16진수
		char c44 = '가';
		char c55 = 44032;
		char c66 = '\uac00';
		
		System.out.println(c11);
		System.out.println(c22);
		System.out.println(c33);
		System.out.println(c44);
		System.out.println(c55);
		System.out.println(c66);
		
		
		
		
		
	}
}


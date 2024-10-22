package j241002;

public class J101_PrimitiveType_Int {

	public static void main(String[] args) {
		
		// int
		// 메모리 : 4Byte(32bit)
		// 범위 : -2^31 ~ (2^31-1) / -2,147,483,648 ~ 2,147,483,647

		int var1 = 0b1001; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 111; // 10진수
		int var4 = 0xAF; // 16진수
		
		System.out.println("2진수 : " + var1);
		System.out.println("8진수 : " + var2);
		System.out.println("10진수 : " + var3);
		System.out.println("16진수 : " + var4);
		
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
		
	}

}

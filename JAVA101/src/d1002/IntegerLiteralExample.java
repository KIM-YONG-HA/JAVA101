package d1002;

public class IntegerLiteralExample {

	public static void main(String[] args) {


		int var1 = 0b1011; // 2
		int var2 = 0206; // 8
		int var3 = 365; // 10
		int var4 = 0xB3; // 16
		
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
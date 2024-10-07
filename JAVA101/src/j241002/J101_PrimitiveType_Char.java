package j241002;

public class J101_PrimitiveType_Char {
	public static void main(String[] args) {
		
		
		// char
		// 메모리 : 2Byte(16bit)
		// 범위 : 0 ~ (2^16-1) / 0 ~ 65533

		// 문자 리터럴 : 작은 따옴표
		// 유니코드 : 아스키 코드에서 확장 
		
		char var1 = 'A';
		int var2 = var1;
		int var3 = 'B';
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		int name1 = '홍';
		int name2 = '길';
		int name3 = '동';
		
		System.out.println("----------------");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		char c1 = 54861;
		char c2 = 44600;
		char c3 = 46041;
		
		System.out.println("----------------");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		
		
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


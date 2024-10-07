package j241002;

public class J101_TypeCasting2 {

	public static void main(String[] args) {
		
		
		// 강제형변환
		
		// 작은 허용범위 타입 = (작은 허용범위 타입) 큰허용범위타입
		
		int intValue = 10;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue); // 10
		
		
		// int타입은 char타입보다 더 큰 허용범위를 가지나 자동 타입변환 되지 않는다.
		// 정수값으로 char타입에서 문자를 출력하기 위해 변환한다
		int intValue1 = 65;
		char charValue1 = (char) intValue1;
		System.out.println(charValue1);
		
		
		// 실수(float, double)은 정수타입(byte, short, int, long)으로 자동변환 되지 않는다.
		// 소수점 부분은 버려지고 정수부분만 저장된다.
		
		double doubleValue2 = 3.14;
		int intValue2 = (int) doubleValue2;
		System.out.println(intValue2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

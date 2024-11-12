package J101.TypeCasting;

public class J101_TypeCasting1 {

	public static void main(String[] args) {
		
		// 자동형변환(Promotion), 묵시적형변환
		
		// 큰 허용 범위타입 = 작은 허용 범위타입
		
		// 기본타입 허용 범위 크기 
		// byte < short < int < long < float < double
		
		byte byteVal = 10;
		int intVal = byteVal;
		System.out.println(intVal); // 10
		
		
		long longVal = 5000000000L;
		float floatVal = longVal;
		double doubleVal = longVal;
		
		System.out.println(floatVal); // 5.0E9
		System.out.println(doubleVal); // 5.0E9
		
		
		// 예외 : byte to char
		// 허용범위가 다르다 (byte타입 : -128 ~ 127 / char타입은 0 ~ 65533) 
		
		
		char charValue = '가';
		int intValue = charValue;
		System.out.println(intValue); // 유니코드로 출력 44032
		
				
		int intValue1 = 11;
		long longValue1 = intValue1;
		System.out.println(longValue1); // 11
		
		
		long longValue2 = 100;
		float floatValue2 = longValue2;
		System.out.println(floatValue2); // 100.0
		
		float floatValue3 = 100.5F;
		double doubleValue3 = floatValue3;
		System.out.println(doubleValue3); // 100.5
		
		
		
		
		
		
		
		
		
		
//		
//		
//		byte b1 = 10;
//		byte b2 = 20;
//		int byteResult = b1 + b2;
//		
//		//System.out.println(byteResult);
//		
//		
//		
//		float f1 = 1.5F;
//		double d1 = 1.52;
//		double doubleResult = f1 + d1;
//		
//		//System.out.println(doubleResult);
//		
//		
//		float f2 = 2.2f;
//		float f3 = 2.2f;
//		double doubleResult2 = f2 + f3;
//		
//		//System.out.println(doubleResult2);
//		
//		
		
		
	
	}

}

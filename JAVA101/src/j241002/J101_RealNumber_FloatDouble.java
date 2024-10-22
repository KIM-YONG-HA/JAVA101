package j241002;

public class J101_RealNumber_FloatDouble {

	public static void main(String[] args) {

		
		// float
		// 크기 : 4byte(32bit)
		// 범위 : (1.4 x 10^-45) ~ (3.4 x 10^38)
		// 정밀도 : 소수점 이하 약 7자리(6~9) 
		
		
		// double 
		// 크기 : 8byte(64bit)
		// 범위 : (4.9 x 10^-324) ~ (1.8 x 10^308)
		// 정밀도 : 소수점 이하 약 15자리 (15~18)
		
		
		// 실수값 저장 
		//float var1 = 3.14; // type mismatch
		float var2 = 3.14f;
		double var3 = 3.14; // float 보다 약 2배정도 정밀도가 높아서 double 
		
		// 정밀도 테스트 
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		
		//System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		

	}

}

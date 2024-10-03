package d1002;

public class ByteExample {

	public static void main(String[] args) {
		
		// byte 범위 : -128 ~ 127
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;
		
		
		byte a = 10;
		byte b = 20;
		//byte rs = a + b;
		
		
		//long aa = 1000; int형
		long aa = 1000L; // Long 명시 
		long bb = 2000L;
		long cc = aa + bb;
		
		// int로 자동 변환

		
		// long dd = 2222222222; // int로 인식
		 long dd = 2222222222L;
		
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);

		/*
		  Description	Resource	Path	Location	Type
		  Type mismatch: cannot convert from int to byte	ByteExample.java	/chap01/src/d1002	line 14	Java Problem
		 */
		

	}

}

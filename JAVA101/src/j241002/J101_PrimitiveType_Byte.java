package j241002;

public class J101_PrimitiveType_Byte {

	public static void main(String[] args) {
		
		// 기본형 타입(Primitive Type), 8개 
		
		// 정수형(Integer) : byte < short == char < int < long 
		// 실수형 : float < double 
		// 논리형(Boolean) : boolean  
		
		
		// 참조형 String 자바에서 제공하는 클래스(대문자로 시작)
		
		
		
		// byte
		// 메모리 : 1Byte(8bit)
		// 범위 : -2^7 ~ (2^7-1) / -128 ~ 127
		
		byte by1 = -128;
		byte by2 = -30;
		byte by3 = 0;
		byte by4 = 30;
		byte by5 = 127;
		//byte var6 = 128;
		
		System.out.println(by1);
		System.out.println(by2);
		System.out.println(by3);
		System.out.println(by4);
		System.out.println(by5);
		//System.out.println(by6);
		
		/*
		  
		  Description	Resource	Path	Location	Type
		  Type mismatch: cannot convert from int to byte	ByteExample.java	/chap01/src/d1002	line 14	Java Problem
		  
		 */
		

	}

}

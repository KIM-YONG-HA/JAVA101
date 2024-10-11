package d1011;

import java.net.SocketTimeoutException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 객체 : 세상에 존재하는 모든 것 
		
		
		// new 키워드로 인스턴스화, 메모리에 올린다 
		//Scanner sc = new Scanner(System.in); 
		
		
		// 참조 타입 (Reference Type)
		// 객체(object)의 주소(번지)를 참조하는 타입
		// 배열, 열거, 클래스, 인터페이스
		
		
		// 실제 값이 저장되는 것이 아니라 주소 값이 저장된다.
		
//		String str = new String("홍길동");
//		String name = "홍길동"; // new 키워드, import 없이 사용 가능 
		
		

		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		String str3 = "안녕";
		String str4 = "안녕";
		
		
		System.out.println(str1 == str2); // 번지를 비교 
		System.out.println(str1.equals(str2)); // 실제 값을 비교 
		System.out.println();
		System.out.println(str2 == str3); // 번지를 비교 
		System.out.println(str2.equals(str3));
		System.out.println();
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		
		
		

	}

}

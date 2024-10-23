package d1023;

public class MainClass {

	// 메인 메소드는 1개만
	// 소스가 길어지면 분리
	// public static : 정적, 하나에 클래스에서만 가능 
	

	// 접근제한자, 메모리 저장 위치, 리턴타입, 메소드이름, 매개변수(Parameter)
	public static void main(String[] args) {

		Test test = new Test();
		test.a = 10;
		
		
		
	}

}

class Test {
	
	// 필드(Field) : 속성
	int a;
	
	// 생성자(Constructor) : 규칙
	Test(){}
	
	// 메소드(Method) : 동작
	void testMethod(){
		
		
	}
	
	
}

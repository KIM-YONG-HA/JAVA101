package d1022;

public class Calculator {
	
	
	// 필드(Field) : 속성
	int tmpField;
	
	// 생성자(Constructor) : 규칙
	Calculator(){
		//System.out.println("calc");
		
	}
	
	// 메소드(Method) : 동작
	// 접근제한자, 메모리 저장 위치, 리턴타입, 메소드이름, 매개변수(Parameter)
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	int add(int a, int b) {
		
		int rs = a + b;
		return rs;
		
	}
	
	
	double div(int a, int b) {
		
		double rs = (double)a / b;
		return rs;
		
	}
	
	

}

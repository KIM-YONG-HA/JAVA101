package d1030;

public class TestClass {

	public static void main(String[] args) {
		
		
		MyClass mc = new MyClass(new Audio());
		
		// MyClass 안에 인터페이스 변수가 있어서 선언 필요 없다
		
		
		mc.rc.turnOn();
		
		
		mc.methodB(new Audio());
		
		
		

	}

}

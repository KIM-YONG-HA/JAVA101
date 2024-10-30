package d1030;


public class MyClass {
	
	
	// 필드에 인터페이스 가능
	RemoteControl rc;
	
	
	// 생성자 매개변수에 인터페이스 가능
	MyClass(RemoteControl rc){
		
		this.rc = rc;
		
		//rc.turnOn();
		//rc.turnOff();
		
	}
	
	// 메소드 매게변수에 인터페이스 가능 
	void methodB(RemoteControl rc) {
		
		System.out.println("methodB");
		//rc.turnOn();
		
		
	}
	
	
	// 리턴타입에 객체.. 인터페이스도 가능 
	
	
	
	
	

}

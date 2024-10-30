package d1030;

public class SmartExample {

	public static void main(String[] args) {
		
		
		SmartTelevision smTv = new SmartTelevision();
		
		RemoteControl rc = smTv; // search 메소드가 없다
		Searchable sh = smTv; // 인터페이스 선언
		
		
		
		
		
		
		
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		sh.search("http://www.naver.com");
		
		
		

	}

}

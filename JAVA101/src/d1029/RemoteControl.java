package d1029;

public interface RemoteControl {
	
	// 상수
	public static final int A = 10; // 상수 키워드 생략가능 
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	// 추상 메소드 
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	

}

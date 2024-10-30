package d1030;

public interface RemoteControl {

	
	// 상수
	public static final int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	
	// 추상메소드 
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	
}

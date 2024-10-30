package d1030;

public class SmartTelevision implements RemoteControl, Searchable {

	// 필드
	private int volume;

	// 메소드
	@Override
	public void turnOn() {
		System.out.println("SMART TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("SMART TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {

		if (volume > MAX_VOLUME) {

			this.volume = RemoteControl.MAX_VOLUME;

		} else if (volume < MIN_VOLUME) {

			this.volume = RemoteControl.MIN_VOLUME;

		} else {

			this.volume = volume;

		}

		System.out.println("현재 SMART TV 볼륨 : " + this.volume);

	}

	@Override
	public void search(String url) {
		
		System.out.println(url + " 검색...");

	}

}

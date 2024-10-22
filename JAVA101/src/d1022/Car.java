package d1022;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

// 중복제거 전 
//	
//	public Car() {
//
//	}
//
//	public Car(String model) {
//		this.model = model;
//	}
//
//	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//
//	public Car(String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}

	
	
	
	
	// this() 자기자신 생성자 호출
	// 생성자 내 첫번째 줄에서만 사용가능
	
	
	// 중복 제거 후 
	public Car() {

	}

	public Car(String model) {
		this(model, null, 0);
	}

	public Car(String model, String color) {
		this(model, color, 0);
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}

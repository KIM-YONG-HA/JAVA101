package d1022;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	public Car() {

	}

	public Car(String model) {
		super();
		this.model = model;
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}

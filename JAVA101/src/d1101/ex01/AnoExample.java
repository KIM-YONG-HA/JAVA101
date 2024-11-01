package d1101.ex01;

public class AnoExample {

	public static void main(String[] args) {

		
		Ano ano = new Ano();
		
		
		ano.field.turnOn();
		ano.field.turnOff();
		
		
		ano.method1();
		
		
		ano.method2(

				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("SMART TV ON");

					}

					@Override
					public void turnOff() {
						System.out.println("SMART TV OFF");
					}
				}

		);
		
		
		
		
		
		
		
		
		
	}

}

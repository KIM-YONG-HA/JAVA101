package d1022;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		// calc.powerOn();

		int a = 5;
		int b = 6;
		int addResult = calc.add(a, b);
		System.out.println("add: " + a + "+" + b + " = " + addResult);

		int c = 10;
		int d = 4;
		double divResult = calc.div(c, d);
		System.out.println("div: " + c + "/" + d + " = " + divResult);

		// calc.powerOff();

	}

}

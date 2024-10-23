package d1022;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.powerOn();
		
		
		System.out.println(calc.sum(22, 44));
		
		int rs = calc.sum(11, 11);
		System.out.println(rs);
		
		calc.powerOff();
		
		

	}

}



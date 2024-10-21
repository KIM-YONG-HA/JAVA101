package d1021;

public class FieldInitValueExample {

	public static void main(String[] args) {

		
		FieldInitValue fiv = new FieldInitValue(1, 2);
		
		System.out.println("btye : " + fiv.byteField);
		System.out.println("char : " + fiv.charField);
		System.out.println("short : " + fiv.shortField);
		System.out.println("int : " + fiv.intField);
		System.out.println("long : " + fiv.longField);
		System.out.println("float : " + fiv.floatField);
		System.out.println("double : " + fiv.doubleField);
		System.out.println("boolean : " + fiv.boolField);
		System.out.println("int array : " + fiv.arrayField);
		System.out.println("string : " + fiv.refField);
		
	}

}

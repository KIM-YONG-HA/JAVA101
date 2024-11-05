package d1105;

public class NumberFormatException_Test {

	public static void main(String[] args) {

		
		
		
		String data1 = "100";
		String data2 = "a100";
		
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		
		int rs = val1 + val2;
		
		System.out.println(data1 + " + " + data2 + " = " + rs);
		

/*

Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt(Integer.java:588)
at java.base/java.lang.Integer.parseInt(Integer.java:685)
at d1105.NumberFormatException_Test.main(NumberFormatException_Test.java:15)

*/



		
		
		
		
		
		
	}

}

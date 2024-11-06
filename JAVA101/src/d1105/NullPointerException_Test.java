package d1105;

public class NullPointerException_Test {

	public static void main(String[] args) {
		
		
		String data = null;
		System.out.println(data.toString());
		
		
/*

Exception in thread "main" 

java.lang.NullPointerException: Cannot invoke "String.toString()" 

because "data" is null at 

d1105.NullPointerException_Test.main(NullPointerException_Test.java:10)
 
 */		

	}

}

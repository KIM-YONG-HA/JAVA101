package d1105;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		/*
		 * 
		Class clazz = Class.forName("java.lang.String2");

		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unhandled exception type ClassNotFoundException

			at d1105.TryCatchFinallyExample.main(TryCatchFinallyExample.java:9)

		*/
		
		
		try {
			
			Class clazz = Class.forName("java.lang.String2");
			
		} catch (ClassNotFoundException e) {

			
			System.out.println("클래스가 없다.");
			//System.out.println(e);
			//e.printStackTrace();
			
		}
	


			
			
		
		
		
	}

}

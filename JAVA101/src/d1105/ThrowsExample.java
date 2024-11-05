package d1105;

public class ThrowsExample {

	public static void main(String[] args){

		try {
			
			findClass();

		} catch (Exception e) {

			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("클래스가 존재 하지 않습니다.");
		}

	}

	public static void findClass() throws Exception {

		Class clazz = Class.forName("java.lang.String2");

	}

}

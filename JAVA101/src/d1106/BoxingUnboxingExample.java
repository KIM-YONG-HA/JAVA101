package d1106;

public class BoxingUnboxingExample {

	public static void main(String[] args) {

		
		// Boxing : 기본 타입을 객체화 
		Integer obj1 = new Integer(300);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		Integer obj4 = 300;
		
		
		
		
		// Unboxing : 
		
		
		int val1 = obj1.intValue();
		
		int val4 = obj4 + 100; // 자동 언박싱
		
		
		System.out.println(obj1.intValue() + obj2.intValue() + obj3.intValue());
		
		
		System.out.println(obj3 == obj4);
		System.out.println(val1 == obj4);
		
		

		
		
		

	}

}

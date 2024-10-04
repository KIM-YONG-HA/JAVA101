package d1004;

public class PrintfExample {

	public static void main(String[] args) {
		
		int val = 123;
		
		System.out.printf("상품의 가격은 : %d원\n", val);
		System.out.printf("상품의 가격은 : %6d원\n", val);
		System.out.printf("상품의 가격은 : %-6d원\n", val);
		System.out.printf("상품의 가격은 : %06d원\n", val);
		
		
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n ", 10, area );
		
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		
		

	}

}

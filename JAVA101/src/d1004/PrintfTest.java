package d1004;

public class PrintfTest {

	public static void main(String[] args) {
		
		
		
		String prdct1 = "사탕";
		int price1 = 500;
		int ea1 = 3;
		
		
		String prdct2 = "생수";
		int price2 = 1000;
		int ea2 = 10;
		
		
		System.out.printf("상품명 : %s | 가격 : %6d원 | 수량 : %02d개\n", prdct1, price1, ea1);
		System.out.printf("상품명 : %s | 가격 : %6d원 | 수량 : %02d개\n", prdct2, price2, ea2);
		
		
		
		double x = 1.23456;
		
		
		System.out.printf("실수 x의 값 : %8.3f\n", x);
		System.out.printf("실수 x의 값 : %-8.3f\n", x);
		System.out.printf("실수 x의 값 : %08.3f\n", x);
		

	}

}

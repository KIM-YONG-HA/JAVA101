package d1007;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		
		int x = 'A'; // 65
		int y = 'a'; // 97
		
		
		
		if( x >= 65 & x <= 90 ) System.out.println("대문자");
		if( x >= 97 && x <= 122) System.out.println("소문자");
		if( !( x < 48 ) && !( x > 57) ) System.out.println("0~9 숫자");
		
		
		
		int value = 6;
		
		if(value % 2 == 0 | value % 3 == 0) System.out.println("2 또는 3의 배수");
		if(value%2 == 0 || value%3 == 0) System.out.println("2 또는 3의 배수");
		
		

	}

}


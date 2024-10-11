package d1011;

import java.util.Scanner;

public class MiniTest04 {

	public static void main(String[] args) {
		
		
//		4. 정수 두개와 연산자를 입력받고
//		계산하는 프로그램을 만들어 보세요
//		연산자 입력에 "exit" 라는 값이 들어 올 때까지
//		우한으로 반복하며 exit가 들어오면
//		"프로그램을 종료합니다"를 출력하고 종료되며
//		0으로는 나눌 수 없기 때문에
//		나눗셈에 0을 입력하면 나눌수 없다고 출력하세요
		
//		예시 :
//		연산자 ( +, -, *, / , % ) : +
//		정수1 : 10
//		정수2 : 10
//		10 + 4 = 14
		
			
		
		Scanner sc = new Scanner(System.in);
		String op = "";
		int x = 0;
		int y = 0;
		int calc = 0;
		boolean isCalc = true;
		
		
		while(isCalc) {
			
			System.out.print("연산자 ( +, -, *, /, % ) : ");
			op = sc.next();
			
			if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%") && !op.equals("exit")) {
				
				System.out.println("연산자와 exit만 입력 가능합니다.");
				continue;
				
			}
			
			
			
			 if(!op.equals("exit")) {
				 
				System.out.print("정수1 : ");
				x = sc.nextInt(); 
				
				System.out.print("정수2 : ");
				y = sc.nextInt(); 
			 
			 }

			
			if(op.equals("+")){
				
				calc = x + y; 
				
			} else if(op.equals("-")) {
				
				calc = x - y; 
				
			} else if(op.equals("*")) {
				
				calc = x * y; 
				
			} else if(op.equals("/")) {
				
				if(y != 0) {
				
					calc = x / y;
					
				} else {
					
					System.out.println("0으로 나눌 수 없습니다");
					
				}
				
			} else if(op.equals("%")) {
				
				calc = x % y; 
				
			} else if(op.equals("exit")) {
				
				System.out.println("프로그램을 종료합니다."); 
				break;
				
			} else {
				
				//System.out.println("프로그램을 종료합니다."); 
				break;
			}
			
			
			System.out.printf("%d %s %d = %d%n", x, op, y, calc);
			
			isCalc = false;

			
		} // end while
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		

	}

}

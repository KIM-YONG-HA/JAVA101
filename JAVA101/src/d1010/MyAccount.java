package d1010;

import java.util.Scanner;

public class MyAccount {

	public static void main(String[] args) {
		
		
		
		int inp = 0;
		int deposit = 0;
		int withdraw = 0;
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료 ");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			inp = sc.nextInt();
			
			if(inp == 1) { // 예금
				
				System.out.print("입금액> ");
				deposit += sc.nextInt(); //
				System.out.println();
				
			} else if(inp == 2) { // 출금
				
				System.out.print("출금액> ");
				withdraw = sc.nextInt();
				deposit -= withdraw;
				System.out.println();
				
			} else if(inp == 3) { // 잔고
				
				System.out.println("예금잔액> " + deposit);
				System.out.println();
				
			} else if(inp == 4)  {
				
				System.out.println();
				System.out.println("프로그램 종료");
				break;
				
			} else {
				
				System.out.println("1~4까지만 입력");
				System.out.println();
				
			}
			
			
		}
		
		
		

	}

}

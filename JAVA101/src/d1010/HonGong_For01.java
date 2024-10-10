package d1010;

import java.util.Scanner;

public class HonGong_For01 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력1 : "); 
		x = sc.nextInt();
		System.out.print("정수 입력2 : "); 
		y = sc.nextInt();
		
		int startNum = x > y ?  y : x ;
		int maxLength = x > y ?  x : y ;
		int total = 0;
		
		
		for(int i = startNum; i <= maxLength; i++) {
			
			total += i;
			
			if(i < maxLength) {
				
				System.out.printf("%d+", i);
				
			} else {
				
				System.out.printf("%d=%d%n", i, total);
				
			}
			
		}
		
		

		
		
		
		

	}

}

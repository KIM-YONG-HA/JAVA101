package d1010;

import java.util.Scanner;

public class HonGong_While01 {

	public static void main(String[] args) {
		

		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = sc.nextInt();
		int sum = 0;
		
		
		int i = 1;
		while(i<=num) {
			
			sum += i;
			i++;
			
		}
		
		
		System.out.println("1~"+num+"까지의 합은 : " + sum);
		
		
		
		
		

	}

}

package algorithm;

import java.util.Scanner;

public class P2480 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int cnt = 1;
		int prize = 0;
		int max = 0;
		int num = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			max = (max > arr[i]) ? max : arr[i];
			
		}
		
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i-1] == arr[i]) {
				num = arr[i];
				cnt++;
			}
			
		}
		
		if(cnt == 3) {
			
			prize = 10000 + (num * 1000);
			
		} else if(cnt == 2) {
			
			prize = 1000 + (num * 100);
			
		} else if(cnt == 1) {
			
			prize = max * 100;
			
		}
		
		System.out.println(cnt);
		System.out.println(max);
		System.out.println(prize);
		

	}

}

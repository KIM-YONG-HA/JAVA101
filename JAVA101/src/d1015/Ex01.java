package d1015;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		
		//배열 선언
		
		// 배열형 인트
		int[] arr1 = new int[5];
		
		int arr2[] = new int[5];
		
		int[] arr3 = {3,2,1};
		
		
		
		Scanner sc = new Scanner(System.in);

		
		// 배열길이 : 배열.length
		for(int i = 0;i<arr1.length;i++) {
			
			System.out.print("배열에 저장될 정수 입력 : ");
			arr1[i] = sc.nextInt();
			
		}
		
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println(arr3[0]);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

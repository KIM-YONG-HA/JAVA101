package d1017;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		// 1. 주민등록번호를 입력 받는다(하이픈포함)
		// 2. 배열에 저장
		// 3. 뒷자리를 별표로 마스킹(성별제외), 마스킹 전 데이터 보관

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 입력> ");
		String num = sc.nextLine();
		
		char[] arr = new char[14];
		char[] copy = new char[14];

		// copy = arr.clone();
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = num.charAt(i);
			
			if(i <= 7) {
				
				copy[i] = String.valueOf(num).charAt(i);
				
			} else {
				
				copy[i] = '*';
				
			}
			
		}

		
		System.out.println("마스킹 전 출력");
		System.out.println(arr);

		System.out.println("마스킹 후 출력");
		System.out.println(copy);
		
		
		
		
		
		

	}

}


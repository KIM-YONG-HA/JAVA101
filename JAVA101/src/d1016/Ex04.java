package d1016;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		// String Type Array
		
		
		String[] strArr1 = new String[3];
		
		strArr1[0] = "홍길동";
		strArr1[1] = "박명수";
		strArr1[2] = "유재석";
		
		
		String[] strArr2 = {"홍길동","박명수","유재석"};
		
		
		
//		System.out.println(strArr1[0].equals(strArr2[0]));
//		System.out.println(strArr1[0] == strArr2[0]);
		
		
		
		
		
		
		// 3명의 이름을 입력 받고 출력 
		
		
		
		String[] nameArr = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<nameArr.length; i++) {
			
			System.out.print((i+1) + "번째 이름 입력 : ");
			nameArr[i] = sc.nextLine();
			
		}
		

		
		for(int i=0; i<nameArr.length; i++) {
			
			if(i < nameArr.length -1) {
				
				System.out.print(nameArr[i] + ", ");
				
			} else {
				
				System.out.print(nameArr[i] );
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}

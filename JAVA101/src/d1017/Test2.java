package d1017;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

			
		
		// 1~10까지 랜덤한 값 저장 후 출력
		// 중복 제거 
		
		
		Scanner sc = new Scanner(System.in);
		int numArr[] = new int[10];
		
		
		
		for(int i=0;i<numArr.length; i++) { // 10회 난수 생성
			
			numArr[i] = (int)(Math.random() * 10) + 1;
			
			// 중복제거 시작 
	
			for(int j=0;j<i;j++) {
				
				if(numArr[i] == numArr[j]) {
					i--;
				}
				
			}
				
			
		}
		
		for(int i=0;i<numArr.length; i++) {
			
			System.out.print(numArr[i] + " ");
			
		}
		
		

	}

}

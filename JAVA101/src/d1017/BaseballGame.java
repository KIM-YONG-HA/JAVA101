package d1017;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		// com : 1~9 사이의 3자리 난수 생성(중복방지)
		
		// user : 중복되지 않는 수 3개 입력 
		
		// strike, ball, out, homerun
		
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("컴퓨터 난수 생성");
		for(int i=0;i<com.length;i++) {
			
			com[i] = (int)(Math.random()*9)+1;
			
			for(int j=0;j<i;j++) {
				
				if(com[i] == com[j]) i--;
				
			}
			
			
		}
		
		
		// com 난수 생성 출력
		for(int i=0;i<com.length;i++) {
			
			System.out.print(com[i]);
			
		}
		
		
		System.out.println("");
		
		
		boolean isEnd = false;
		int strikeCount = 0;
		int ballCount = 0;
		int outCount = 0;
		
		while(!isEnd) {
			
			// user 숫자 입력
			for(int i = 0; i<user.length;i++) {
				
				System.out.printf("%d번째 숫자 입력 : ",i+1);
				user[i] = sc.nextInt();
				
			}
			
			
			// 1~9사이 유효성
			
			
			// 중복값 유효성
			
			
			// homerun
			if (com[0] == user[0] && com[1] == user[1] && com[2] == user[2]) {

				System.out.println("홈런!!!");
				isEnd = true;
				break;

			}

			
			//System.out.println("스트라이크 계산 ");
			
			// strike count
			for(int i=0;i<user.length;i++) {
				
				if(com[i] == user[i]) {
					
					strikeCount++;
					
				}
				
			}
			

			// ball count 
			//System.out.println("볼 계산");
			
			for (int i = 0; i < user.length; i++) {
				
				for (int j = 0; j < user.length; j++) {
					
					if (i != j && com[i] == user[j]) {

						ballCount++;
						// System.out.println(com[i] + " ? " + user[j]);
						// System.out.println("볼카운트 증가");

					}
				}

			}
			

			// 스트라이크+볼 계산후 나머지가 아웃  
			outCount = 3 - strikeCount - ballCount;
		
			
			System.out.printf("strike : %d, ball : %d, out : %d", strikeCount, ballCount, outCount);
			System.out.println();
			
		} // end-while
		

		
		
		
		// O 3s 
		// O 2s 1o
		// O 1s 1b 1o
		// O 1s 2o
		// 1o
		// 2o
		// 3o
		
		
		
		
		
		
		
		

	}

}

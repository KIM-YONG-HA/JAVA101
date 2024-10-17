package d1017;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		
		boolean isRun = true;
		int stdCount = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(isRun) {
			
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			
			System.out.print("선택> ");
			//int slctNum = Integer.parseInt(sc.next());
			int slctNum = sc.nextInt();
			
			if(slctNum == 1) {
				
				System.out.print("학생수> ");
				stdCount = sc.nextInt();
				
			} else if(slctNum == 2) {
				
				scores = new int[stdCount];
				
//				int idx = 0;
//				while(idx < stdCount) {
//					
//					System.out.printf("scores[%d]> ", idx);
//					scores[idx] = sc.nextInt();
//					idx++;
//					
//				}
					
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = sc.nextInt();
					
				}
				
				
			} else if(slctNum == 3) {
				
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]> %d", i, scores[i]);
					System.out.println();
				}
				
			} else if(slctNum == 4) {
				
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for(int i=0;i<scores.length;i++) {

					//if(scores[i] > max)max = scores[i];
					max = max > scores[i] ? max : scores[i];
					sum+=scores[i];
					
				}
				
				avg = (double)sum/stdCount;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
				
			} else if(slctNum == 5) {
				
				
				System.out.println("프로그램 종료.");
				isRun = false;
				
			} else {
				
				
				System.out.println("잘못된 번호 입력");
			}
			
		} // end-while
		
		

	}

}


package d1015;

public class Test7_t {

	public static void main(String[] args) {
		
		
		
		int[] ar = new int[45];
		int[] lotto = new int[6];
		
		
		// 1 ~ 45 저장
		for(int i = 0; i < ar.length; i++) {
			
			ar[i] = i+1;
			
		}
		

		// 게임 5번 실행
		for(int j=1; j<=5; j++) {
			
			// 셔플 
			for(int k = 1; k <= 500; k++){
			
				int st = (int)(Math.random() * 45);
				int ed = (int)(Math.random() * 45);
				
				int tmp = ar[st];
				ar[st] = ar[ed];
				ar[ed] = tmp;
				
			}
			
			
			// 6개씩 출력
			for(int i=0; i<lotto.length; i++) {
				
				lotto[i] = ar[i];
				System.out.print(lotto[i] + " ");
				
			}
			
			System.out.println();
			
			
		}
		

		
		

	}

}

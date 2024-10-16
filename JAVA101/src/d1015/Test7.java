package d1015;

public class Test7 {

	public static void main(String[] args) {
			
	
//		7. 로또 번호를 추첨하는 프로그램을 만듭니다.
//		int 배열 2개를 초기화 합니다.
//		int[] ar = new int[45];
//		int[] lotto = new int[6];
//		
//		총 5게임이며
//		하나의 게임에서 중복된 번호가 나오지 않게 해보세요.
//		
//		*** 1번째 게임 결과 ***
//		33 15 36 37 44 41 
//		
//		*** 2번째 게임 결과 ***
//		18 35 30 16 36 10 
//		
//		*** 3번째 게임 결과 ***
//		39 27 13 44 11 20 
//		
//		*** 4번째 게임 결과 ***
//		33 40 19 5 27 28 
//		
//		*** 5번째 게임 결과 ***
//		17 24 26 11 29 4 
		
		
		
		int[] ar = new int[45];
		int[] lotto = new int[6];
		
		
		boolean doubleChk = true;
		
		
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("*** " + i + "번째 게임 결과 ***");
			
			int idx = 0;
			
			while(doubleChk) {
				
				lotto[idx] = (int)(Math.random() * 45) + 1;
				
				if(idx > 0) {
					
					if(lotto[idx] == lotto[idx-1]) {
						
						lotto[idx] = (int)(Math.random() * 45) + 1;
						
					}
					
				}
				
				idx++;
				
				if(idx ==  6) doubleChk = false;
				
				
			}
			
			
			for(int j = 0; j <= 5; j++) {
				
				System.out.print(lotto[j] + " ");
				
			}
			
			
			doubleChk = true;
			
			System.out.println();
			System.out.println();
			
		}
		
		
		
		
		
		
		

		
		

	}

}

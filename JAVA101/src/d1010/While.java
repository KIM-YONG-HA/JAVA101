package d1010;

public class While {

	public static void main(String[] args) {
		
		
//		
//		int i = 0;
//		
//		
//		while(i < 5) {
//			
//			System.out.println(i);
//			i++;
//			
//		}
//		
//		
//		System.out.println();
//		i = 0;
//		
//		
//		do {
//			
//			if(i==3) {
//				
//				System.out.println("break");
//				break;
//			}
//			System.out.println(i);
//			i++;
//			
//		} while (i < 5);
//		
//		
//		
		
		
		
		
		// 1~6사이의 난수 생성
		// 6나오면 반복 종료 
		// 몇 회 실행했는지 
		
		
		int cnt = 0;
		
		while(true) {
			
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			cnt++;
			
			
			if(num == 6) {
				System.out.println("break");
				break;
			}
			
		}
		
		System.out.println("while : " + cnt);
		
		
		

	}

}

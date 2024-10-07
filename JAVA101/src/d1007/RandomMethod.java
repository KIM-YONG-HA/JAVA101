package d1007;

public class RandomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Math.random() * n : n까지 랜덤한 숫자
		// (Math.random() * n) + 1 : 1부터 n까지 랜덤한 숫자
		
		
		// 주사위 숫자 
//		int dice = (int)(Math.random() * 6) + 1;
//		System.out.println(dice);		
		
		
		int num = (int)(Math.random() * 6) + 1;
		
		System.out.println(num+"번이 나왔습니다.");
		
		
		if(num == 1) {
			
			System.out.println("1번이 나왔습니다.");
			
		} else if(num == 2) {
			
			System.out.println("2번이 나왔습니다.");
			
		} else if(num == 3) {
			
			System.out.println("3번이 나왔습니다.");
			
		} else if(num == 4) {
			
			System.out.println("4번이 나왔습니다.");
			
		} else if(num == 5) {
			
			System.out.println("5번이 나왔습니다.");
			
		} else if(num == 6) {
			
			System.out.println("6번이 나왔습니다.");
			
		}
		
		
		

	}

}

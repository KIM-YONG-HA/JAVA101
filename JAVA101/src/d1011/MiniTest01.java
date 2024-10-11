package d1011;import java.util.Scanner;



public class MiniTest01 {

	public static void main(String[] args) {
		
		
//		사용자로부터 한 개의 값을 입력받아
//		1부터 입력받은 숫자까지 숫자들을 출력하세요
//		단, 입력한 수는 1보다 크거나 같아야하며
//		1미만의 숫자가 입력되면 '1 이상의 숫자를 입력하세요'
//		출력하고 다시 입력하게 하세요.
		

		Scanner sc = new Scanner(System.in);
		int inp;
		
		while(true) {
			
			System.out.print("숫자 입력 : ");
			inp = sc.nextInt();
			
			if(inp < 1) {
				
				System.out.println("1 이상의 숫자를 입력하세요");
				
			} else {
				
				for(int i = 1; i<=inp; i++) {
					
					System.out.print(i + " ");
					
				}
				
				break;
				
			}
			
			
		}
		
		
		
		

	}

}

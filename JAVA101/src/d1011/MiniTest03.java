package d1011;

import java.util.Scanner;

public class MiniTest03 {
	
	public static void main(String[] args) {

// 3. 사용자로부터 첫번째로 입력받은 숫자부터, 
// 두 번째로 입력받은 숫자까지 구구단을 출력하는
// 프로그램을 만들어보세요, 단 9를 초과하는
// 숫자를 입력하면 "9 이하의 숫자만 입력해주세요"를
// 출력하세요
		
		
		Scanner sc = new Scanner(System.in);

			
			System.out.println();
			
			while(true) {
				
				
				System.out.print("첫 번째 숫자 입력 : ");
				int x = sc.nextInt();
				System.out.print("두 번째 숫자 입력 : ");
				int y = sc.nextInt();
				int z = 0;
					
					if(x > y) {
						
						z = x;
						x = y;
						y = z;
						
					}
					
				
				if(x > 10 || y > 10) {
					
					System.out.println("9 이하의 숫자만 입력해주세요.");
					continue;
					
				} else {
					
					for(int i = x; i <= y; i++ ) {
					
					System.out.println(i +"단 출력 시작 ");
					
						for(int j = 1; j <= 9; j++) {
							
							System.out.printf("%d x %d = %d%n", i, j, (i*j));
							if(j == 9) System.out.println();
							
						}
					
					}
					
					break;
					
				}

			
		}
		
		
	}

}

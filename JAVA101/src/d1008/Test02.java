package d1008;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		
		
		
		
		// 과락 6개 이하 
		// 총개수 합격
		
		int total = kor + math + eng;
		
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		
		
		
		// if-else만 사용
		if((kor > 6 && math > 6 && eng > 6) && total >= 30) {
			
			System.out.println("합격입니다.");
			
		} else {
			
			System.out.println("불합격입니다.");
			
		}
		
		
		// if-else if-else 사용
		if(kor <= 6 || math <= 6 || eng <= 6 ) {
				
		 System.out.println("불합격입니다.");
				
		} else if(total >= 30) {
			
			System.out.println("합격입니다.");
			
		}
	
		
		
		
		// & 이면서, | 이거나 
		
		// A & B : 
		
		// A && B : A가 false면 뒤에 검사 안 함
		
		
		
		

	}

}


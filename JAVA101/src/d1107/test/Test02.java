package d1107.test;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test02 {

	public static void main(String[] args) {
		
//		2. Vector 에 5개의 정수를 입력 받아서 그 중에 가장 큰 값을 출력하세요.
		
		
		
		List<Integer> list = new Vector<>();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int idx = 1;
		
		while(idx <= 5) {
			
			System.out.printf("%d번째 정수 입력 > ", idx);
			int inp = sc.nextInt();
			list.add(inp);
			
			idx++;
			
		}
		
		
		int max = list.get(0);
		
		for(int i=1;i<list.size();i++) {
			
			if(max < list.get(i)) max = list.get(i);
			
		}
		
		System.out.println("가장 큰 값 : " + max);
		
		

	}

}

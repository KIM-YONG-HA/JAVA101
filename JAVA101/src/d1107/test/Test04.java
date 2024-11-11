package d1107.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		
//		
//		4. 사용자에게 강수량을 입력받아 LinkedList에 입력된 강수량을 저장합니다.
//		while 문을 사용해 사용자에게 강수량을 반복적으로 입력 받으며
//		사용자가 0.0 을 입력하면 반복을 종료합니다.
		
//		입력된 값이 숫자가 아닌 경우 " 강수량 숫자를 입력하세요." 라는 메시지 출력
		
//		calcAvg 라는 메소드를 호출해 입력된 강수량의 평균을 계산합니다.
		
//		계산 후 출력
//
//		예시 :
//		강수량 : 10.5
//		강수량 : 20.5
//		강수량 : 30.5
//		강수량 : 0.0
//		강수량 평균 : 20.5
//
//		
		
		
		List<Double> rainFallList = new LinkedList<>();
		
		
		double sum = 0;
		double avg = 0;
		double result = 0;
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("강수량 : ");
			
			if(!sc.hasNextDouble()) {
				
				System.out.println("강수량 숫자를 입력하세요.");
				continue;
				
			} 
			
			double inp = sc.nextDouble();
				
				if(inp != 0.0) {
					
					rainFallList.add(inp);
					sum += inp;
					result = calcAvg(sum, rainFallList.size());
					
				} else {
					
					System.out.println("강수량 평균 : " + result);
					break;
					
				}
				
			
			
	
		}
		
		
		
		
		
	}
	
	
	
	static double calcAvg(double sum, int len) {
		
		return sum / len;
		
	}

	

}

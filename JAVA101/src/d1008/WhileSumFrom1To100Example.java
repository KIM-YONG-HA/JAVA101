package d1008;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int idx = 1;
		
		
		while(idx <= 100) {
				
			sum += idx;
			idx++;
			
		}
		
		System.out.println("1~100 합계는 : " + sum);
		System.out.println("마지막 인덱스 : " + idx);
		
		
		

	}

}


package d1015;

public class Test4 {

	public static void main(String[] args) {
		// 길이가 100인 정수형 배열 
		// 1~50까지 랜덤한 숫자
		// 저장된 값 중 30이상의 평균
		
		int[] arr = new int[100];
		int cnt = 0;
		int sum = 0;
		
		
		
		for(int i = 0; i<arr.length; i++) {

			arr[i] = (int)(Math.random() * 50) + 1;
			
			System.out.print(arr[i] + " ");
			
			if(arr[i] >= 30) {
				
				sum += arr[i];
				cnt++;
				
			}
			
		}
		
		
		double avg = (double) sum / cnt;
		
		System.out.println();
		System.out.println("30 이상 합계 : " + sum);
		System.out.println("30 이상의 수 : " +cnt);
		System.out.println("평균 : " + avg);
		
		

	}

}

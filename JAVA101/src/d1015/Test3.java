package d1015;

public class Test3 {

	public static void main(String[] args) {
		// 길이 30 정수형 배열
		// 1~ 70사이 랜덤한 값
		
		
		int[] arr = new int[30];
		int ran = 0;
		
		for(int i = 0; i<arr.length;i++) {
			
			ran = (int)(Math.random() * 70) + 1;
			arr[i] = ran;
			
		}
		
		
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			
			
			sum += arr[i];
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("합 : " + sum);
		
		
		

	}

}

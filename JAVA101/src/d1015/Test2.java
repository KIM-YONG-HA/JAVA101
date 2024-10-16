package d1015;

public class Test2 {

	public static void main(String[] args) {
		// 길이 30인 인트형 변수
		// 3의 배수만 저장 
		
		
		int[] arr = new int[30];
		
		
		for(int i = 0; i<arr.length;i++) {
			
			arr[i] = (i+1) * 3;
			
		}
		
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		
		

	}

}

package d1015;

public class Test1 {

	public static void main(String[] args) {
		
		// 1~20까지 배열에 저장 후 출력 
		
		int[] arr = new int[20];
		
		
		for(int i = 1; i <= arr.length; i++) {
			
			arr[i-1] = i;
			
		}
		
		
		for(int i = 0;i<arr.length;i++) {
			
			if(i < arr.length - 1) {
				
				System.out.print(arr[i] + ", ");
				
			} else {
				
				System.out.print(arr[i] + " ");
				
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}

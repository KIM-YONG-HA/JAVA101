package d1016;

public class Ex03 {

	public static void main(String[] args) {

		
		int[] ar = {10, 20, 30};
		
		
		for(int i=0; i<ar.length; i++) {
			
			System.out.println(ar[i]);
			
		}
		
		
		System.out.println("---------------");
		
		int[][] arr = {{10,20},{30,40},{50,60,70}};
		
		for(int i=0;i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		System.out.println("---------------");
		
		
		// 향상된 for문 
		int sum = 0;
		for(int a : ar) {
			
			System.out.print(a+ " ");
			sum += a;
			
		}
		
		System.out.println(sum);

				
		
		
		
		
		
		

	}

}

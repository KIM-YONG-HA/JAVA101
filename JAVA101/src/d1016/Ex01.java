package d1016;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		int[] ar = new int[5]; // 1차원 배열
		
		ar[0] = 1;
		
		
		
		
		int[][] arr = new int[3][2]; // 2차원 배열
		
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		arr[2][0] = 5;
		arr[2][1] = 6;
		
		
		
		for(int i = 0; i < 3; i++) {
			
			
			
			for(int j = 0; j < 2; j++) {
				
				
				//System.out.printf("%d,%d => %d ", i, j, arr[i][j]);
				
				System.out.print(arr[i][j] + " ");
				
				
			}
			
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

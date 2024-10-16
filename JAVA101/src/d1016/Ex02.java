package d1016;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// array in array 
		
		// 0 : {1,2,3}
		// 1 : {4,5,6}
		// 2 : {7,8,9}
		int[][] arr = new int[3][3];
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		
//		arr[2][0] = 7;
//		arr[2][1] = 8;
//		arr[2][2] = 9;
		
		int val = 1;
		
		for(int i = 0; i<3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				arr[i][j] = val;
				val++;
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		
		System.out.println(arr.length);
		
		
		

	}

}

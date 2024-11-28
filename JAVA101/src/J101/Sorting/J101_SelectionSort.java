package J101.Sorting;

public class J101_SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {3,5,4,2,1};
		
		
		int minIdx = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			minIdx = i;
			
			//System.out.print(i);
			
			for(int j=i+1;j<arr.length;j++) {
				
				System.out.print(" "+ j);
				
				if(arr[j] < arr[minIdx]) {
					
					minIdx = j;
					
				}
				
			}
			
			
			if(minIdx != i) {
				
				int tmp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = tmp;
				
			}
			
			
			//System.out.println();
			
		}
		
		
		
		for(int num : arr) {
			
			
			System.out.print(num);
			
			
		}
		
		
		

	}

}

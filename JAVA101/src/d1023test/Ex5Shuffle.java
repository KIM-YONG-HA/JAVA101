package d1023test;

public class Ex5Shuffle {
	
	/*
	 * (1) shuffle메서드를 작성하시오.
	 */
	
	static int[] shuffle(int[] origin) {
		
		
		/*
		 
		 for(int i=0;i<arr.length*2;i++){
		 
		 	int tmp = arr[x];
		 	int x = (int)(Math.random() * arr.length);
		 	int y = (int)(Math.random() * arr.length);
		 	
		 	tmp = arr[x];
		 	arr[x] = arr[y];
		 	arr[y] = tmp;
		 
		 }

		 return arr;
		 
		 */
		
		

		for(int i=0;i<origin.length;i++) {
			
			for(int j=0;j<5;j++) {
				
				int tmp;
				int beforeIdx = i;
				int afterIdx = (int)(Math.random() * (origin.length-1) );
				
				if(beforeIdx != afterIdx) {
					
					tmp = origin[beforeIdx];
					origin[beforeIdx] = origin[afterIdx];
					origin[afterIdx] = tmp;
					
				}
			
				
			}
			
		}
		
		return origin;
		
	}
	
	
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}






}


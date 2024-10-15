package d1015;

public class Test5 {

	public static void main(String[] args) {
	
//		
//		5. 길이가 60인 정수를 하나 선언하고 1~200 까지 랜덤한 수를 저장합니다 
//		저장된 값을 모두 출력하고 그 중 최대값과 최소값을 출력 해보세요
//
//		ex ) 
//
//		161 117 137 160 58 110 126 134 163 177 67 56 195 141 81 110 3 22 161 103 67 136 24 152 131 106 41 171 6 106 173 18 134 42 4 4 88 143 111 165 181 105 189 30 127 168 98 35 129 155 1 177 127 24 126 39 5 23 83 
//		최대값 : 195 , 최소값 : 1
//		
//		
		
		
		int[] arr = new int[60];
		int min = 0;
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			
			arr[i] = (int)(Math.random() * 200) + 1;
			
			System.out.print(arr[i] + " ");
			
			if(i == 0) {
				
				min = arr[i];
				max = arr[i];
				
			}
			
			
			if(i > 0) {
				
				if(min > arr[i]) min = arr[i];
				if(max < arr[i]) max = arr[i];
				
			}
			
			
		}
		
		System.out.println();
		System.out.println(" 최대값 :" + max +", 최소값 : " + min);
		
		
		
		
		

	}

}

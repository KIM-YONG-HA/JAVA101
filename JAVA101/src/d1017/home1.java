package d1017;

public class home1 {

	public static void main(String[] args) {
		
		
		// 길이 20의 배열 2개를 선언한다.
		// -2000 부터 4000 사이의 랜덤한 값을 저장한다.
		// 1번째 ~ 20번까지 출력하는데
		// 숫자가 큰 순서로 1~20위 까지도 함께 출력한다.
		
		// ex) n 번째 값 : -000 / 순위 : 0
		
		int [] arr = new int[20];
		int [] idxArr = new int[20];
		
		
		// 난수 저장 
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = (int)(Math.random() * 6001) - 2000;
			System.out.print(arr[i] + ", ");
			
		}
		
		
		// 
		// 0 : 1, 2, 3, 4
		// 1 : 2, 3, 4
		// 2 : 3, 4
		// 3 : 4
		// 
		
		System.out.println();
		System.out.println();
		
		
		for(int i=0;i<arr.length - 1;i++) {
			
			//System.out.print("i : " + i);
			
			int maxIDX = i;
			
			for(int j=i+1;j<arr.length ;j++) {
				
				//System.out.print(" j : " + j);
				
				idxArr[i] = maxIDX;
				
				if(arr[maxIDX] < arr[j]) {
					
					maxIDX = j;
					
				}
				
				int tmp = arr[i];
				arr[i] = arr[maxIDX];
				arr[maxIDX] = tmp;
				//
			}
				
			//System.out.println();
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(idxArr[i]+" 번째 값 :" +   arr[i] + " / "+ (i+1) + "위 ");
			
			
		}
		
		
		

	}

}

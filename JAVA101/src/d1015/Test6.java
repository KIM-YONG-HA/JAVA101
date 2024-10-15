package d1015;

public class Test6 {

	public static void main(String[] args) {

//		
//		6. 길이 30인 정수형 배열을 하나 선언하여 1 ~ 30 사이의 랜덤한 값을 저장하고 
//		출력한 뒤 저장된 배열의 값을 셔플 (섞고) 다시 출력하세요.
//
//		*** 셔플 전에 데이터 ***
//		13 8 23 26 14 1 23 12 3 22 18 25 15 20 14 1 11 28 17 1 2 9 7 17 4 21 6 13 19 17 
//
//		*** 셔플 이후의 데이터 ***
//		1 13 15 17 17 21 1 9 4 23 25 3 26 22 13 17 20 7 1 14 12 11 6 2 23 28 18 14 8 19 
//
//		
		
		int[] arr = new int[30];
		int[] shuffleArr = new int[30];
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = (int) (Math.random() * 30) + 1;

		}
		
		System.out.println();
		
		
		for(int i = 0 ; i<arr.length; i++) {
			if(i == 0) System.out.println("** 셔플 전 데이터 ***");
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		
		
		for(int i = 0; i<arr.length; i++) {
			
			shuffleArr[i] = 0;
			
		}
		

		for(int i = 0; i<arr.length; i++) {
			if(i == 0) System.out.println("** 셔플 후 데이터 ***");
			
			shuffleArr[arr[i]] = arr[i];
			System.out.print(shuffleArr[i] + " ");
			
		}
		
		
		System.out.println();
		
		
		
		System.out.println("*** 셔플 이후의 데이터 ***");
		for(int i = 1 ; i<=500; i++) {
			
			int st = (int) (Math.random() * 30);
			int ed = (int) (Math.random() * 30);
			
			int tmp = arr[st];
			arr[st] = arr[ed];
			arr[ed] = tmp;
			
			System.out.print(arr[i] + " ");
			
			
		}
		
		
		
		
		


		

		

		
		
		
		
		



	}

}

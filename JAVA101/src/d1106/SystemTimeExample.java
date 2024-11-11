package d1106;

public class SystemTimeExample {

	public static void main(String[] args) {

		
		long nano1 = System.nanoTime();
		
		
		
		int sum = 0;
		for(int i=0;i<1000000;i++) {
			
			sum += i;
			
		}
		
		long nano2 = System.nanoTime();
		
		System.out.println("합계 : " + sum);
		System.out.println(" " + (nano2-nano1) + " 소요");
		
		
		
	}

}

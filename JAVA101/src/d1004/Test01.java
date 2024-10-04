package d1004;

public class Test01 {

	public static void main(String[] args) {
		
//		
//		
//		char c1 = 'a';
//		
//		
//		//System.out.println(c1);
//		
//		
//		char c2 = (char) (c1 + 1);
//		
//		
//		
//		System.out.println((c1 + 1));
//		
//		System.out.println(c2); // b출렬 
//		
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		//int result = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
		int result = (int)var1 + (int)(var2+var3) + (int)Double.parseDouble(var4);
		
		// 모두 더하고 소수점 버리고 출력 
		// 9 출력 
		
		System.out.println(result);
		

	}

}

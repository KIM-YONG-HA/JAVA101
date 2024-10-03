package d1002;

public class VariableScopeExample {
	
	public static void main(String[] args) {
		
		int v1 = 15;
		int v2 = 0; // 선언과 동시에 0으로 초기화 필요
		String str = ""; // 선언과 동시에 0으로 초기화 필요
		
		
		
		if(v1>10) {
			
			v2 = v1 - 10;
			
		}
		
		int v3 = v1 + v2 + 5;
		
		System.out.println(v3);
		
	}

}

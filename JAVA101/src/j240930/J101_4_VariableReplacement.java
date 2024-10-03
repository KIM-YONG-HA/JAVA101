package j240930;

public class J101_4_VariableReplacement {

	public static void main(String[] args) {
		
		/*****
		 
		요구사항
		변수 x, y의 값을 서로 교체하여 출력하기
		
		*****/
		
		int x = 1;
		int y = 2;
		
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(x+", "+y);
		

	}

}

package J101.Variable;

public class J101_VariableReplacement {

	public static void main(String[] args) {
		
		/*
		 
		변수 x, y의 값을 서로 교체하여 출력하기
		
		*/
		
		int x = 1;
		int y = 2;
		
		System.out.println(x+", "+y);
		
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(x+", "+y);
		

	}

}

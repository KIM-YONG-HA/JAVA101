package d1007;

public class IncreaseDecreseOperatorExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		
		// 단항
		x++; // x 1증가 : 11
		++x; // x 1증가 : 12
		System.out.println("x : " + x); // x = 12
		
		
		// 단항
		y--; // y 1감소 : 9
		--y; // y 1감소 : 8
		System.out.println("y : "+ y); // y = 8
		
		
		
		z = x++;
		System.out.println("z : " + z); //
		System.out.println("x : " + x); //
		
		z = x++;
		System.out.println("z : " + z); //
		System.out.println("x : " + x); //

		
		// x = 15, y = 8
		z = ++x + y++;
		System.out.println("----------");
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
		

	}

}


package d1107.pm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>(); // 뒤에 제네릭 생략가능.
		
		
		
		list.add("1. JAVA");
		list.add("2. JDBC");
		list.add("3. Servlet/JSP");
		
		list.add(2, "4. Database");
		list.add("5. iBATIS");
		
		
		int size = list.size();
		System.out.println(size);
		
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(" " + list.get(i) );
			
		}

		System.out.println("  ");
		
		
		list.remove(3);
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(" " + list.get(i) );
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}

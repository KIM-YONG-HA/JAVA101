package J101.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class J101_Set_HashSet {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>();
		
		
		set.add("text1");
		set.add("text2");
		set.add("text3");
		set.add("text4");
	
		
		
		System.out.println(set.size()); // 4
		
		
		Iterator<String> ite = set.iterator();
		
		while(ite.hasNext()) {
			
			String data = ite.next();
			System.out.print(data + " "); // text3 text4 text1 text2 
			
		}
		
		
		
		
		
	}

}

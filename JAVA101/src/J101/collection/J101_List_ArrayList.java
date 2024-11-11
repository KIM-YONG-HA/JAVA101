package J101.collection;

import java.util.ArrayList;
import java.util.List;

public class J101_List_ArrayList {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		
		
		list.add("text1");
		list.add("text2");
		list.add(2, "text3");
		list.add(3, "text4");

		System.out.println(list.contains("text4")); // true
		
		System.out.println(list.get(0)); // text1
		
		System.out.println(list.isEmpty()); // false
		
		System.out.println(list.size()); // 4
		
		
		System.out.println(list); // [text1, text2, text3, text4]
		list.remove(0);
		System.out.println(list); // [text2, text3, text4]
		list.remove(0);
		System.out.println(list); // [text3, text4]

		
		
		list.remove("text3");
		System.out.println(list); // [text4]

		
		list.clear();
		System.out.println(list); // []
		
		
		
		list.add("text1");
		list.add("text2");
		list.add("text3");
		list.add("text4");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i) + " "); //text1 text2 text3 text4 
			
		}
		
		System.out.println();
		
		for(String str : list) {
			
			System.out.print(str + " "); //text1 text2 text3 text4 
			
		}
		
		
		
		
		
		
		
	}

}

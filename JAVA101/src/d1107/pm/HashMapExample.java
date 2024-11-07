package d1107.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>();
		
		
		// 객체 저장 
		map.put("홍길동", 10);
		map.put("박명수", 33);
		map.put("유재석", 77);
		
		
		System.out.println(map.size());
		
		
		System.out.println();
		
		
		System.out.println(map.get("홍길동"));
		
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.printf("{%s, %s}%n", key, value);
			
		}
		
		
		System.out.println();
		
		
		for(String str : map.keySet()) {
			
			
			
			System.out.printf("%s", str);
			
			
			
		}
		
		
				
		
		
		
		
		

	}

}

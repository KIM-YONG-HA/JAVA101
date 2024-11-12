package J101.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class J101_Map_HashMap {

	public static void main(String[] args) {

		
		// 이름을 키로 점수를 저장하기 
		
		
		
		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("홍길동", 100);
		map.put("유재석", 80);
		map.put("정형돈", 10);
		map.put("박명수", 77);
		map.put("홍길동", 44); // 이름키가 중복되어 100->44로 변경 
		
		
		System.out.println(map.size());
		
		
		
		
		
		
		System.out.println("홍길동의 점수 : " + map.get("홍길동")); // 44
		
		
		
		// 객체를 하나씩 처리 
		
		Set<String> keySet = map.keySet(); // key set 얻기 
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			
			
			String key = keyIterator.next();
			Integer value = map.get(key);
			
			System.out.printf("[%s:%d]%n", key, value);
			
//			[정형돈:10]
//			[박명수:77]
//			[홍길동:44]
//			[유재석:80]
			
		}
		
		
		
		
		
		// 객체를 하나씩 처리 
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

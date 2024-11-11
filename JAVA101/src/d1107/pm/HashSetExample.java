package d1107.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		
		
		
		// hashSet : 빠른 검색과 삽입이 가능하며 중복을 제거해준다(순서보장 X)
		
		// 사용
		// 1. 중복제거
		// 2. 고유값저장(ID, email, ...) => ArrayList도 가능 
		// 3. 집합 연산시 사용
		// 4. 해시태그 
		
		// treeSet : 이진 탐색 트리 기반, 정렬된 순서로 요소를 유지 
		
		
		
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Java");
		set.add("JSP");
		
		
		System.out.println(set.size());

		
		Iterator<String> it = set.iterator();
		
		
		while(it.hasNext()) {
			
			String str = it.next();
			
			System.out.printf("%s %n", str);
			
		}
		
		
		
		System.out.println();
		
		
		
		
		it = set.iterator();
		
		for(String str : set){
			
			System.out.println(str);
			
			
		}
		
		
		
		System.out.println();
		
		
		set.clear();
		
		
		
		if(set.isEmpty()) 
			System.out.println("비어있음");
		else 
			System.out.println("비어있지않음");
		
		
		
		
		
		
		
		
		
		
	}

}

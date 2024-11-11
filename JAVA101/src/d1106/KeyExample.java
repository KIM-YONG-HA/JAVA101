package d1106;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		
		hashMap.put(new Key(1), "홍길동");
		
		
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);
		
		//
		
		
		// 해시코드 : 객체를 생성 시 생기는 정수의 값
		// 객체마다 다른 값을 가지며 해시코드가 같다고 객체가 같은 것은 아니다.
		// 해시코드가 다르면 다른 객체이다.
		// 해시기반으로 된 컬렉션 규칙 
		
		
		// 객체를 빠르게 찾기 위해서 사용
		
		// 해시코드간의 충돌이 발생할 수 있으며 
		// 논리적 비교시 오버라이딩 해야함.
		
		
		
		
		
		
	}

}

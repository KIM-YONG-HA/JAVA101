package d1107.pm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		
		// ArrayList : 배열을 기반으로하는 동적 리스트
		// 장점
		// 1. 검색 속도가 빠르다
		// 2. 요소 추가시 크기를 자동으로 조정
		// 3. 읽기작업이 많고 삽입/삭제가 적은 경우에 적합하다. => 게시판 CRUD에 적합
		
		// LinkedList : 동기화된 배열 기반 리스트(멀티쓰레드 환경에서 안전하게 사용가능)
		// 장점
		// 1. 삽입 및 삭제가 빠르고 주로 Queue나 Stack구현에 적합
		// 단점
		// 1. 성능이 다소 떨어진다. 
		
		
		
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		
		
		long startTime;
		long endTime;
		
		
		startTime = System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			
			list1.add(0, String.valueOf(i));
			
			
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 실행시간 : " + (endTime - startTime));
		
		
		
		
		
		startTime = System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			
			list2.add(0, String.valueOf(i));
			
			
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 실행시간 : " + (endTime - startTime));
		
		
		
		
		
		

	}

}

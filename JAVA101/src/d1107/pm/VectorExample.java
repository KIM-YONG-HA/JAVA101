package d1107.pm;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		
		// 벡터는 동기화된 메소드로 구성
		// 벡터 종료전까지 다른 쓰레드는 접근 불가 => 쓰레드에 안전하다.
		//
		
		
		List<Board> list = new Vector<>();
		
		list.add(new Board(1,"1. 제목을 입력하여...", "1. 내용 lorem ipsum imda", "1. 관리자"));
		list.add(new Board(2,"2. 제목을 입력하여...", "2. 내용 lorem ipsum imda", "2. 관리자"));
		list.add(new Board(3,"3. 제목을 입력하여...", "3. 내용 lorem ipsum imda", "3. 관리자"));
		list.add(new Board(4,"4. 제목을 입력하여...", "4. 내용 lorem ipsum imda", "4. 관리자"));
		list.add(new Board(5,"5. 제목을 입력하여...", "5. 내용 lorem ipsum imda", "5. 관리자"));
		
		System.out.println(list.get(0));
		
		list.remove(2);
		list.remove(2);
		
		
		
		for(int i=0;i<list.size();i++) {
			
			Board board = list.get(i);
			System.out.printf("%s %s %s %n" , board.title, board.content, board.writer);
			
		}
		
		System.out.println();
		
		
		for(Board str : list) {
			
			System.out.println(str);
			
		}
		
		
		
		

	}

}

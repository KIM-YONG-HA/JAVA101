package J101.collection;

import java.util.List;
import java.util.Vector;

public class J101_List_Vector {

	public static void main(String[] args) {
		
		
		List<Board> list = new Vector<>();
		
		
		list.add(new Board("제목1", "내용1", "작성자1"));
		list.add(new Board("제목2", "내용2", "작성자2"));
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4", "작성자4"));
		list.add(new Board("제목5", "내용5", "작성자5"));
		
		list.remove(1);
		list.remove(3);
		
		
		for(int i=0;i<list.size();i++) {
			
			Board b1 = list.get(i);
			System.out.printf("|%s|%s|%s|%n", b1.getTitle(), b1.getContent(), b1.getTitle());
			
		}
		
		System.out.println();
		
		Board b2 = null;
		for(Board b : list) {
			
			if(list.size() > 0) {
				
				b2 = b;
				System.out.println(b2); // toString 메소드 실행 
				
			}
			
		}

	}

}

class Board {

	private String title;
	private String content;
	private String writer;

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}

package d1107.pm;

public class Board {
	
	int idx;
	String title;
	String content;
	String writer;
	
	
	
	public Board(int idx, String title, String content, String writer) {
		
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		
	}



	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

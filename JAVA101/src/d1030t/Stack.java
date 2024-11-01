package d1030t;

public interface Stack {
	int length(); // 현재 스택에 저장된 요소의 개수
	int capacity(); // 스택의 최대 저장 용량
	String pop(); // 스택에서 요소 꺼내서 반환 / 비어있으면 null
	boolean push(String val); // 스택에 새로운 요소 추가 스택이 가득 차있으면 false
}

class StringStack implements Stack{
	// 필드
	private String[] ss;
	private int index;
	
	// 생성자
	public StringStack(int size) {
		ss=new String[size];
		index=-1;
	}
	
	// 메소드
	@Override
	public int length() {
		return index+1;
	}

	@Override
	public int capacity() {
		return ss.length;
	}

	@Override
	public String pop() {
		if( index == -1) {
			return null;
		}
		
		return ss[index--];
	}

	@Override
	public boolean push(String val) {
		if( index == ss.length-1 ) {
			return false;
		}
		ss[++index]=val;
		return true;
	}
	
}

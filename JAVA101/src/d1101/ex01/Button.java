package d1101.ex01;

public class Button {
	
	
	// 인터페이스 
	OnClickListener listener;
	
	
	void setOnClickListener(OnClickListener listener) {
		
		this.listener = listener;
		
	}
	
	
	void touch() {
		
		listener.onClick();
		
	}
	
	
	
	static interface OnClickListener {
		
		
		void onClick();
		
		
	}
	
	
	
	
	
	
	
	
	

}

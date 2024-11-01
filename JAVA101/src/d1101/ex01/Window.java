package d1101.ex01;

public class Window {
	
	
	
	
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	
	
	
	// 필드에 저장 
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			
			System.out.println("전화를 겁니다.");
			
		}
		
		
	};
	
	
	
	
	Window(){
		
		// 필드로 매개변수 전달
		
		btn1.setOnClickListener(listener);
		
		
		// btn2번 방식 많이 사용 
		btn2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {

				System.out.println("메세지를 보냅니다.");

			}
			
		});
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}

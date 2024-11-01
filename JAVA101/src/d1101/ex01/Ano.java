package d1101.ex01;


public class Ano {


	
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			
			System.out.println("TV ON");
			
		}
		
		@Override
		public void turnOff() {
			
			System.out.println("TV OFF");
			
		}
	};
	
	
	
	
	// 로컬
	
	public void method1() {
		
		
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("AUDIO ON");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("AUDIO OFF");
				
			}
			
		};
		
		
		
		localVar.turnOn();
		localVar.turnOff();
		
		
	}
	
	
	
	void method2(RemoteControl rc) {
		
		rc.turnOn();
		rc.turnOff();
		
	}
	
	
	
	
	
	

}

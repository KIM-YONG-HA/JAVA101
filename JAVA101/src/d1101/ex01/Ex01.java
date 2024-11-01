package d1101.ex01;

public class Ex01 {

	public static void main(String[] args) {
	
		
		A a = new A();

		
		a.methodA();
		
		
		

	}

}




class A {
	
	int fieldA = 5;
	
	A(){
		
		System.out.println("A 객체 생성");
		
	}
	
	void methodA() {
		
		System.out.println("methodA 실행");
		
		
		class B {
			
			int fieldB = 10;
			
			
			B(){
				
				System.out.println("B 객체 생성");
				
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}

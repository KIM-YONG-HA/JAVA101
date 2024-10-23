package sec06.exam03.pakage1;


public class A {

	// 생성자 접근제한 
	A a1 = new A(true); // public : 내부에서 사용 가능
	A a2 = new A(10); // default : 내부에서 사용 가능
	A a3 = new A("str"); // private : 내부에서 사용 가능
	
	
	public A(boolean b) {} 
	A(int b){}			   
	private A(String s) {} 
	
	
}

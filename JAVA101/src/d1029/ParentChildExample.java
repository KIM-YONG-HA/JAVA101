package d1029;

public class ParentChildExample {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		
		Parent parent = child;
		
		parent.method1(); // 출력: parent method1 
		parent.method2(); // 출력 : child method2;
		
		
		
		

	}

}



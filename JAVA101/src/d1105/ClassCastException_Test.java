package d1105;

public class ClassCastException_Test {

	public static void main(String[] args) {

		
		Animal an = new Dog();
		Dog dog = (Dog) an;
		
		
		Cat cat = (Cat) an; // 오류 발생
		
		
		if(an instanceof Dog) {
			
			
		}

		
		
		
		
		
		
		
		
		
	}

}


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

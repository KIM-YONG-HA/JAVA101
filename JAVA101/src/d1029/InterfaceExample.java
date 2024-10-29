package d1029;




class Cat implements Animal {

	
	
	@Override
	public void eat(String feed) {
		System.out.println("고양이는 " + feed + "를 먹는다.");
		
	}

	@Override
	public void walk(String move) {
		System.out.println("고양이는 " + move + "로 이동한다.");		
		
	}

	@Override
	public void sleep(String zzz) {
		
		System.out.println("고양이는 " + zzz + " 잔다");		
		
	}
	
	
	
	
	
}



class Monkey implements Animal {

	
	
	@Override
	public void eat(String feed) {
		System.out.println("원숭이는 " + feed + "를 먹는다.");
		
	}

	@Override
	public void walk(String move) {
		System.out.println("원숭이는 " + move + "로 이동한다.");		
		
	}

	@Override
	public void sleep(String zzz) {
		
		System.out.println("원숭이는 " + zzz + " 잔다");		
		
	}
	
	
	
	
	
}




class Chicken implements Animal {

	
	
	@Override
	public void eat(String feed) {
		System.out.println("닭은 " + feed + "를 먹는다.");
		
	}

	@Override
	public void walk(String move) {
		System.out.println("닭은 " + move + "로 이동한다.");		
		
	}

	@Override
	public void sleep(String zzz) {
		
		System.out.println("닭은 " + zzz + " 잔다");		
		
	}
	
	
	
	
	
}

public class InterfaceExample {

	public static void main(String[] args) {

		
		Cat cat = new Cat();
		cat.eat("츄르");
		
		
		Monkey monkey = new Monkey();
		monkey.eat("사과");
		monkey.walk("두 발 또는 네 발");
		
		Chicken chicken = new Chicken();
		chicken.walk("두 발");
		chicken.sleep("서서");
		
		
		
	}

}

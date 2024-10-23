package d1023;


//Marine 클래스와 생성자, getter, setter메소드와 기능 메소드를 정의하고
//Marine 클래스를 테스트 할 수 있는 클래스를 정의

	
//( 단, 모든 Marine의 공격력과 방어력은 같아야 한다. )
//- 기능 메소드 : 
//1) 공격력 증가 
//2) 방어력 증가 
//3) 체력 감소
//4) 마린 위치 이동
	



public class Marine {
	
	
	private int x, y, hp, weapon, armor;
	
	Marine() {

		this.x = 0;
		this.y = 0;
		this.weapon = 10;
		this.armor = 10;
		this.hp = 100;
		System.out.printf("마린 생성!! %n");

	}

	public Marine(int x, int y, int hp, int weapon, int armor) {
		super();
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.weapon = weapon;
		this.armor = armor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWeapon() {
		return weapon;
	}

	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	
	
	//1) 공격력 증가 
	
	void upgradeWeapon(int w) {
		
		int val = this.getWeapon() + w;
		this.setWeapon(val);
		System.out.printf("공격력 %d 증가 (현재 공격력:%d)%n", w, val);
		
		
	}
	
	//2) 방어력 증가 
	void upgradeArmor(int a) {
		
		int val = this.getWeapon() + a;
		this.setWeapon(val);
		System.out.printf("방어력 %d 증가 (현재 방어력:%d)%n", a, val);
		
		
	}
	
	
	//3) 체력 감소
	void hpCalc(int hp) {
		
		int crntHp = this.getHp() - hp;
		this.setHp(crntHp);
		System.out.printf("hp %d 감소 (현재 hp:%d)%n", hp, crntHp);
	}
	
	
	//4) 마린 위치 이동
	void positionChange(int x, int y) {
		
		int posX = this.getX() + x;
		int posY = this.getY() + y;
		
		this.setX(posX);
		this.setY(posY);
		
		System.out.printf("마린이 (%d, %d) 좌표로 이동 %n", posX, posY);
		
	}

	
	
	
	
	
	
	
}
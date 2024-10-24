package d1023test;

//Marine 클래스와 생성자, getter, setter메소드와 기능 메소드를 정의하고
//Marine 클래스를 테스트 할 수 있는 클래스를 정의

	
//( 단, 모든 Marine의 공격력과 방어력은 같아야 한다. )

//- 기능 메소드 : 
//1) 공격력 증가 
//2) 방어력 증가 
//3) 체력 감소
//4) 마린 위치 이동
	



public class Marine {
	
	
	private int x, y, hp;
	private static int weapon, armor;
	
	Marine() {

		this.x = 0;
		this.y = 0;
		this.hp = 100;

	}

	public Marine(int x, int y) {
		this(x, y, 100);
	}
	
	public Marine(int x, int y, int hp) {
		this(x, y, hp, 1);
	}
	
	public Marine(int x, int y, int hp, int weapon) {
		this(x, y, hp, 1, 1);
	}

	public Marine(int x, int y, int hp, int weapon, int armor) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		Marine.weapon = weapon;
		Marine.armor = armor;
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
		Marine.weapon = weapon;
	}

//	
//	public static int getWeapon() {
//		return Marine.weapon;
//	}
//
//	public static setWeapon(int weapon) {
//		Marine.weapon = weapon;
//	}
//
//	
	
	
	
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
		Marine.armor = armor;
	}
	
	
	
	//1) 공격력 증가 
	
	void upgradeWeapon(int weapon) {

		Marine.weapon += weapon;
		System.out.printf("공격력 %d 증가 (현재 공격력:%d)%n", weapon, Marine.weapon);
		
	}
	
	//2) 방어력 증가 
	void upgradeArmor(int armor) {
		
		Marine.armor += armor;
		
		System.out.printf("방어력 %d 증가 (현재 방어력:%d)%n", armor, Marine.armor);
		
	}
	
	
	//3) 체력 감소
	void hpCalc(int hp) {
		
		int val = this.getHp() - hp;
		this.setHp(val);
		System.out.printf("hp %d 감소 (현재 hp:%d)%n", hp, val);
	}
	
	
	//4) 마린 위치 이동
	void move(int x, int y) {
		
		int posX = this.getX() + x;
		int posY = this.getY() + y;
		
		this.setX(posX);
		this.setY(posY);
		
		System.out.printf("마린이 (%d, %d) 좌표로 이동 %n", posX, posY);
		
	}

	
	void unitStatus() {
		
		//마린의 위치는 (0,0)이고 체력은 0, 공격력은 0, 방어력은 0입니다.
		
		String msg = "%n > 마린의 ";
		msg += "위치는 (" + this.getX() +","+ this.getY() + ")이고 ";
		msg += "체력은 " + this.getHp() + ", ";
		msg += "공격력 " + Marine.weapon + ", ";
		

		
		String defaultGage = "□";
		String upGage = "■";
		
		msg += "방어력 " + Marine.armor + " ";
		
		
		
		msg += "입니다. %n%n";
		
		System.out.printf(msg);
		
		
	}

	@Override
	public String toString() {
		return "Marine [x=" + x + ", y=" + y + ", hp=" + hp + "]";
	}
	
	
	
	
	
	
	
	
}

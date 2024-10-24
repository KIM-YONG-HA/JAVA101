package d1023test;


class Marine_t{
	// 필드
	private int x, y, hp;  // hp는 체력
	private static int weapon, armor;   // weapon는 공격력, armor는 방어력
	
	// 생성자
	public Marine_t() {	}
	
	public Marine_t(int x, int y) {
		this(x, y, 100, 1, 1);
	}
	public Marine_t(int x, int y, int hp) {
		this(x, y, hp, 1, 1);
	}
	public Marine_t(int x, int y, int hp, int weapon) {
		this(x, y, hp, weapon, 1);
	}
	public Marine_t(int x, int y, int hp, int weapon, int armor) {
		this.x=x; this.y=y; this.hp=hp; Marine.weapon=weapon;
		Marine.armor=armor;
	}

	
	// getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x<0) {
			return;
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y<0) {
			return;
		}
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("체력은 음수로 지정할 수 없습니다.");
			return;
		}
		this.hp = hp;
	}

	public static int getWeapon() {
		return Marine.weapon;
	}

	public static void setWeapon(int weapon) {
		if(weapon<0) {
			System.out.println("공격력은 음수로 지정할 수 없습니다.");
			return;
		}
		Marine.weapon = weapon;
	}

	public static int getArmor() {
		return Marine.armor;
	}

	public static void setArmor(int armor) {
		if(armor<0) {
			System.out.println("방어력은 음수로 지정할 수 없습니다.");
			return;
		}
		Marine.armor = armor;
	}
	// 공격력 증가 메소드
	public static void weaponUp() {
		weapon++;
	}
	// 방어력 증가 메소드
	public static void armorUp() {
		armor++;
	}
	// 체력 감소 메소드
	public void hpDown() {
		hp--;
		if(hp<0) {
			System.out.println("Marine 사망!!!");
			hp=0;
		}
	}
	// 마린 위치 이동
	public void marineMove(int x, int y) {
		this.x=x ; this.y=y;
		System.out.println("Marine의 위치가 "+x+", "+y+" 위치로 이동되었습니다.");
	}
	
	
	@Override
	public String toString() {
		return "[ Marine의 위치는 ("+x+", "+y+")이고, 체력은 "+
				hp+", "+"공격력은 "+weapon+", "+"방어력은 "+
				armor+" 입니다. ]";
	}
}

public class Marine_t {

	public static void main(String[] args) {
		System.out.println("***   마린 생성 시작");
		Marine m1=new Marine();
		System.out.println(m1);
		Marine m2=new Marine(2, 2);
		System.out.println(m2);
		Marine m3=new Marine(3, 3, 60);
		System.out.println(m3);
		Marine m4=new Marine(4, 4, 50, 1);
		System.out.println(m4);
		Marine m5=new Marine(5, 5, 70, 1, 1);
		System.out.println(m5);
		
		System.out.println("***  방어력 증가");
		Marine.armorUp();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		System.out.println("***   공격력 증가");
		Marine.weaponUp();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		System.out.println("***  마린 hp 감소");
		m1.hpDown();
		System.out.println(m1);
		m2.hpDown();
		System.out.println(m2);
		
		System.out.println("*** m1 마린 위치 변경");
		m1.marineMove(4, 6);
		System.out.println(m1);
	}

}

package d1023;

public class Ex5 {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		m1.upgradeWeapon(10);
		m1.upgradeArmor(10);
		
		
		
		Marine m2 = new Marine();
		System.out.println(m2.getHp());
		m2.positionChange(22, 44);
		
		m2.hpCalc(50);
		System.out.println(m2.getHp());
		
		System.out.println(m1.getHp());
		
		
	}

}

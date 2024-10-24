package d1023test;

public class MarineTestClass {

	public static void main(String[] args) {

		Marine m1 = new Marine();
		m1.upgradeWeapon(10);
		m1.upgradeArmor(10);
		m1.hpCalc(10);
		m1.positionChange(10, 20);
		
		
		System.out.println();
		System.out.println();
		
		
		Marine m2 = new Marine();
		
		m2.upgradeWeapon(20);
		m2.upgradeArmor(20);
		m2.hpCalc(50);
		m2.positionChange(100, 200);
		

		
		
	}

}

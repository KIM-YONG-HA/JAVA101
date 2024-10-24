package d1023test;

public class MarineTestClass {

	public static void main(String[] args) {

//		Marine m1 = new Marine();
//		m1.upgradeWeapon(1);
//		m1.upgradeArmor(1);
//		
//		
//		Marine m2 = new Marine();
//		
//		m2.upgradeWeapon(1);
//		m2.upgradeArmor(1);
//		
//		

//		
//		Marine m4 = new Marine();
//		m4.upgradeWeapon(1);
//		m3.upgradeArmor(0);
//		
		
		
		
		Marine m0 = new Marine(0, 0);
		
		m0.upgradeArmor(1);
		m0.upgradeWeapon(1);
		
		m0.unitStatus();
		

		Marine m1 = new Marine(1, 1);
		
		m1.upgradeArmor(1);
		m1.upgradeWeapon(1);
		m1.hpCalc(99);
		m1.unitStatus();
		
		
		Marine m3 = new Marine();
		m3.upgradeWeapon(1);
		m3.upgradeArmor(1);
		m3.move(123, 829);
		m3.unitStatus();
		
		
	}

}

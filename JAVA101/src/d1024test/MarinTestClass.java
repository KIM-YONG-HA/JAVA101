package d1024test;

public class MarinTestClass {


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

package d1030t;

public class Ex3 {
	
	public static void main(String[] args) {
		// 3번, 4번
//		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
//		toDollar.run();
		// -----------
		System.out.println("-------");
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
	}

}

class Won2Dollar extends Converter {

	public Won2Dollar() {}
	
	public Won2Dollar(double src) {
		ratio = src;
	}
	
	@Override
	protected double convert(double src) {
		//    내가 입력 24000 / 고정된값 , 1200
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
}

class Km2Mile extends Converter {

	public Km2Mile() {}
	
	public Km2Mile(double km) {
		ratio = km;
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
	
}

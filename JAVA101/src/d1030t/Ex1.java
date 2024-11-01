package d1030t;

public class Ex1 {
	// 1번 , 2번

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		// ---------
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048 컬러
		iptv.printProperty();

	}

}

class TV {
	
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	

	// 필드
	int color;
	
	// 생성자
	public ColorTV(int size) {
		super(size);
	}
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(getSize() + "인치" + color + "컬러");
	}
	
	
}


class IPTV extends ColorTV {

	String ip;
	
	public IPTV(int size) {
		super(size);
    }
	
	public IPTV(int size, int color) {
		super(size, color);
	}
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	@Override
	void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}
	
	
	
	
	
}



package d1030test;

public class IPTV_Test {

	public static void main(String[] args) {
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		// "192.1.1.2" 주소에 32인치, 2048 컬러
		iptv.printProperty();
	}

}

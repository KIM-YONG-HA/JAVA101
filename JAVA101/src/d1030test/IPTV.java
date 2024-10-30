package d1030test;

public class IPTV extends ColorTV {
	
	
	String remoteAddr;

	
	public IPTV(String remoteAddr, int size, int color) {
		super(size, color);
		this.remoteAddr = remoteAddr;
	}
	
	
	void printProperty() {
		
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러%n", remoteAddr, this.getSize(), color);
		
	}
	
	
	

}

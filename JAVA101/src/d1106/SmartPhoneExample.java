package d1106;

public class SmartPhoneExample {
	
	
	public static void main(String[] args) {
		
		
		SmartPhone sp = new SmartPhone("삼성", "갤럭시");
		
		
		String strObj = sp.toString();
		
		System.out.println(strObj);
		
		System.out.println(sp);
		
		
		
		
		
	}
	

}




class SmartPhone {
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	
	@Override
	public String toString() {
		
		return company + ", " + os;
		
	}
	
	
	
	
	
}
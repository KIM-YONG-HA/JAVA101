package d1028;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		
		DmbCellPhone dmb = new DmbCellPhone("아이폰", "흰색", 1);
		
		System.out.println("모델:"+dmb.model);
		System.out.println("색상:"+dmb.color);
		System.out.println("채널:"+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요.");
		dmb.recieveVoice("안녕하세요! 저는 홍길동인데요.");
		dmb.sendVoice("아~ 예 반갑습니다.");
		
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		

	}

}

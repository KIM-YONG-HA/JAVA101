package d1023test;

class ExSutdaCard {
	
	public static void main(String args[]) {
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info()); // 3
		System.out.println(card2.info()); // 1K
		
	}
	
}


class SutdaCard {

	int num; // 카드의 숫자(1~10사이 값)
	boolean isKwang; // 광이면 true, 아니면 false

	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;

	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String info() {

		char tmp = ' ';
		tmp = this.isKwang ? 'K' : ' ';

		String result = String.valueOf(this.num) + tmp;
		return result;

	}

}




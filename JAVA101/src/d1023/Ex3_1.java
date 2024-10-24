package d1023;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * (1) 인스턴스메서드 getDistance를 작성하시오.
	 */
	
	 double getDistance(int x2, int y2) {
			
			double posA = x2 - this.x;
			double posB = y2 - this.y;
			
			// 로직 재확인
			
//			double posC = Math.sqrt(posA) + Math.sqrt(posB) ;
//			double result = Math.sqrt(posC);
			
			
			double posC = Math.sqrt(posA * posA + posB * posB) ;
			double result = posC;
			
			return result;
		}

}

class Ex3_1 {
	
	public static void main(String args[]) {
		
		MyPoint p = new MyPoint(1, 1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
		
	}
	
}

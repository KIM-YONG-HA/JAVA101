package d1023;

class Ex3 {
	
	/*
	 * 두 점 (x,y)와 (x1,y1)간의 거리를 구한다. 
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	
	static double getDistance(int x1, int y1, int x2, int y2) {
		
		
		double posA = x2 - x1;
		double posB = y2 - y1;
		double posC = Math.sqrt(posA) + Math.sqrt(posB) ;
	
		double result = Math.sqrt(posC);
		
		return result;
	}
	
	
	
	public static void main(String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	

	
}
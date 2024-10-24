package d1023test;

class ExStudent {

	public static void main(String args[]) {
		
	 Student s = new Student("본인이름",1,1,100,60,76);
	 System.out.println("이름:"+s.name); // 이름:홍길동
	 System.out.println("총점:"+s.getTotal()); // 총점:236
	 System.out.println("평균:"+s.getAverage()); // 평균:78.7
	 
	 System.out.println(s.info());
	 
	 
	}

}

class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	public Student() {
		
	}
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		//this.getTotal();
		//this.getAverage();
		
		
	}


	// 국어, 영어, 수학 합계 계산
	int getTotal() {
		
		int sum = this.kor + this.eng + this.math;
		return sum;
		
		
	}
	
	// 평균을 소수점 1자리로 계산 
	float getAverage() {
		
		int sum = this.kor + this.eng + this.math;
		float result = (float) sum / 3 ;
		result = (float)Math.round(result*10) / 10;
		
		// Math.round(getTotal() / 3f * 10) / 10f
		
		return result;
		
		
	}
	

	String info() {
		
		String out = 
		this.name + "," + 
		this.ban + "," + 
		this.no +  "," + 
		this.kor + "," + 
		this.eng + "," + 
		this.math;
		out += ",";
		out += this.getTotal();
		out += ",";
		out += this.getAverage();
		
		return out;
		
		
	}
	
	
	
	
	

}
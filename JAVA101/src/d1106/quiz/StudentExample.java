package d1106.quiz;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {

		
		
			// student key, 총점 을 지정하는 hashMap 객체 생성
		
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		
		System.out.println("new Student(\"1\").hashCode() : " + new Student("2").hashCode()); // hashCode : 49
		
		
		hashMap.put(new Student("2"), "95");
		
		String score = hashMap.get(new Student("2"));
		
		
		System.out.println("2번 학생의 총점 : " + score);
		
		
		
	}

}

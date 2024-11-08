package d1107.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

//				
//				
//		5. 학생 정보 관리 시스템 만들기.
//		사용자로부터 학생 정보를 입력 받습니다 
//		이름, 학과, 학번, 학점 평균(실수값)을 입력받으며 
//		입력은 쉼표로 구분됩니다.
//		입력된 값이 STOP 인 경우 입력을 종료합니다
//		입력된 정보를 기반으로 Student 객체를 생성해서 ArrayList에 추가합니다.
//		
		
		
		
		
		
//		
//		5-1. 학생 정보 출력
//		모든 학생 정보를 출력하는 테이블 형식을 제공하고.
//		출력 형식은 학생 이름, 학과, 학번, 학점 평균 입니다.
//		Iterator를 사용해서 리스트의 모든 학생 정보를 순회하여 출력하세요
//		
		
		
		
		
		
		
//		5-2. 학생 검색
//		
//		사용자에게 검색할 학생 이름을 입력 받고, 종료를 입력 받으면 프로그램 종료
//		입력된 이름으로 학생 리스트를 검색해 학생 정보를 출력하고
//		검색 결과가 없을 경우엔 검색할 이름이 존재하지 않습니다 출력.
//		
//		예시 )
//		학생정보 입력(학생이름, 학과, 학번, 학점평균(실수값))
//		김수로,컴공,240101,3.5
//		학생정보 입력(학생이름, 학과, 학번, 학점평균(실수값))
//		장동건,호텔조리,240203,4.0
//		학생정보 입력(학생이름, 학과, 학번, 학점평균(실수값))
//		STOP
//		=========================================
//		  학생 이름      학과        학번     학점평균
//		=========================================
//		  김수로	    컴공	240101	  3.5
//		  장동건	    호텔조리	240203	  4.0
//		검색할 학생이름>> 김수로
//		  김수로	    컴공	240101	  3.5
//		검색할 학생이름>> 홍길동
//		검색할 이름이 존재하지 않습니다.
//		검색할 학생이름>> 종료
//		프로그램을 종료합니다.
//		
//		
//		

		
		
//		학생정보 입력(학생이름, 학과, 학번, 학점평균(실수값))
//		김수로,컴공,240101,3.5
//		장동건,호텔조리,240203,4.0
		
		
		// 5. 학생 정보 입력 
		
		List<Student> stList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("학생 정보 입력 > ");
			String stInp = sc.next();
			
			if(stInp.equals("STOP") || stInp.equals("stop") ) {
				System.out.println("입력 종료 ");
				break;
			}
			
			String stInfo[] = stInp.split(",");
			
			double averageScore = Double.parseDouble(stInfo[3]);
			stList.add(new Student(stInfo[0], stInfo[1], stInfo[2], averageScore));
			
		}
		
		
		
//        =========================================
//		  학생 이름      학과        학번     학점평균
//		=========================================
//		  김수로	    컴공	240101	  3.5
//		  장동건	    호텔조리	240203	  4.0
		
		
		// 5-1. 학생 정보 출력
		
		Iterator<Student> iterator = stList.iterator();
		
		Student.topMenu();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		
		
		
//		5-2. 학생 검색
//		
//		사용자에게 검색할 학생 이름을 입력 받고, 종료를 입력 받으면 프로그램 종료
//		입력된 이름으로 학생 리스트를 검색해 학생 정보를 출력하고
//		검색 결과가 없을 경우엔 검색할 이름이 존재하지 않습니다 출력.
		
		
		
		
		
		// 검색할때 
		
		// 클래스 null로 선언하고 콜렉션을 넣어준다 
		
		
		while(true) {
			
			System.out.print("학생 이름 입력 > ");
			String name = sc.next();
			
			if(name.equals("종료")) {
				
				System.out.println("프로그램 종료!");
				break;
				
			}
			
			Student student = null;
			
			for(Student stu : stList) {
				
				if(stu.getName().equals(name)) {
					
					student = stu;
					
				}
				
			}
			
			if(student != null) {
				
				System.out.println(student);
				
			} else {
				
				System.out.println("없는 학생 ");
				
			}
			
		}
		
		
		
		
		
		


	}

}


class Student {
	
	private String name; // 학생이름
	private String major; // 학과
	private String stNum; // 학번
	private double averageScore; // 학점평균
	
	
	public Student(String name, String major, String stNum, double averageScore) {
		this.name = name;
		this.major = major;
		this.stNum = stNum;
		this.averageScore = averageScore;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public String getStNum() {
		return stNum;
	}



	public void setStNum(String stNum) {
		this.stNum = stNum;
	}



	public double getAverageScore() {
		return averageScore;
	}



	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}



	static void topMenu() {
		
		String print = "";
		
		print += "=========================================\n";
		print += " 학생 이름    학과       학번     학점평균\n";
		print += "=========================================\n";
		
		System.out.print(print);
		
	}
	

	@Override
	public String toString() {
		
		String print = "";
		
		print += "  " + this.name + "    ";
		print += this.major + "    ";
		print += this.stNum + "    ";
		print += this.averageScore;
		
		
		return print;
		
	}



	
	
	
	




	
}





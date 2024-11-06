package d1106.quiz;

public class Student {

	
	
	
	private String studentNum;

	public Student(String studentNum) {
		
		this.studentNum = studentNum;
		
	}
	
	
	public String getStudentNum() {
		
		return studentNum;
		
	}
	
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		

		
		if(obj instanceof Student) {
			
			Student student = (Student) obj;
			
			
//			if(studentNum == student.getStudentNum())
			
			
			if(studentNum.equals(student.getStudentNum()) ) {
				
				return true;
				
			}
			
			
		}
		
		
		return false;
	}


	@Override
	public int hashCode() {
		
		System.out.println("studentNum.hashCode : " + studentNum.hashCode());
		return studentNum.hashCode();
		
	}
	
	
	
	
}

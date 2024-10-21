package d1021;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member mb = new Member();

		
		
		
		
		System.out.print("이름>");
		mb.userName = sc.next();
		
		System.out.print("아이디>");
		
		
		mb.userID = sc.next();
		
		System.out.print("비밀번호>");

		mb.passwd = sc.next(); 
		
		System.out.print("나이>");
		mb.userAge = sc.nextInt();

		
		System.out.println("회원가입 완료");
		
		
		System.out.println();
		
		
		
		
		

		
		
		
		
		while(true) {
			
			
			String mb_id, mb_passwd; 
					
					
			// 로그인 성공 or 실패 
			
			System.out.println("로그인");
			
			
			System.out.print("아이디>");
			mb_id = sc.next();
			
			System.out.print("비밀번호>");
			mb_passwd = sc.next();
			
			
			
			
			if(mb.userID.equals(mb_id) && mb.passwd.equals(mb_passwd)) {
				
				System.out.printf("%s(%d)님 환영합니다.", mb.userName, mb.userAge);
				break;
				
			} else {
				
				System.out.println("로그인 실패");
				continue;
				
			}
		
		}
		

	}

}

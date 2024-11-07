package d1107.pm;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("admin","1234");
		map.put("test","1q2w3e4r");
		map.put("user","qlalfqjsgh");
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("아이디 > ");
			String id = sc.next();
			
			System.out.print("비밀번호 > ");
			String passwd = sc.next();
			
			if(map.containsKey(id)) {
				
				if(map.get(id).equals(passwd)) {
					
					System.out.println("로그인 성공");
					break;
					
				} else {
					
					System.out.println("로그인 실패 ");
					
				}
				
			} else {
				
				System.out.println("존재하지 않는 아이디입니다");
				
			}
			
			
		}
		
		
		
		
		
		
		

	}

}


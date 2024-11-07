package d1107.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		
//		1. ArrayList에 점심메뉴 4개를 입력받아 저장한다.
//		저장한 점심메뉴를 모두 출력하고, 가장 이름이 긴 메뉴를 출력한다.
//		* 실행결과 *
//		점심메뉴 1입력 : 
//		김치찌개
//		점심메뉴 2입력 : 
//		된장
//		점심메뉴 3입력 : 
//		쌈밥
//		점심메뉴 4입력 : 
//		제육
//		점심 메뉴 : 김치찌개 된장 쌈밥 제육 
//		가장 긴 메뉴는 : 김치찌개
//		
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		
		while(count<=4) {

			System.out.println("점심메뉴 "+count+"입력 : ");
			String menu = sc.next();
			list.add(menu);
			count++;
			
		}
		
		
		String menuList = "";
		String longMenu = list.get(0);
		
		for(int i=0;i<list.size();i++) {
			
			menuList += list.get(i) + " ";
			
			if(longMenu.length() < list.get(i).length()) {
				
				longMenu = list.get(i);
				
			}
			
			
		}
		
		System.out.println("점심 메뉴 : " + menuList);
		System.out.println("가장 긴 메뉴 : " + longMenu);
		
		
	}

}


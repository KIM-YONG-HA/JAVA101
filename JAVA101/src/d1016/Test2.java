package d1016;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		// 사용자가 입력한 값이 배열에 있는지 검색
		
		// 있으면 ooo 치킨 배달 가능 출력
		
		// 없으면 ooo 은(는) 없는 메뉴 입니다.
		
		
		
		Scanner sc = new Scanner(System.in);
		String[] menuArr = {"양념", "후라이드", "간장"};
		
		System.out.print("주문할 메뉴 입력 : ");
		String orderMenu = sc.nextLine();


		int yesNo = 0;
		
		for(int i=0;i<menuArr.length;i++) {
			
			if(menuArr[i].equals(orderMenu)) {
				
				yesNo++;
				
			}
		}
		
		
		if(yesNo == 0) {
			
			System.out.println(orderMenu + "은(는) 없는 메뉴입니다.");
			
		} else {
			
			System.out.println(orderMenu + " 치킨 배달 가능");
			
		}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

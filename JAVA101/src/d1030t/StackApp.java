package d1030t;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size=s.nextInt();
		
		StringStack stst=new StringStack(size);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String st=s.next();
			if(st.equals("그만")) {
				break;
			}
			boolean res= stst.push(st);
			if(!res) {
				System.out.println("스택이 꽉 차서 푸시 불가!!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int index=stst.length();
		for (int i = 0; i < index; i++) {
			System.out.print( stst.pop()+" " );
		}
		s.close();
	}
}

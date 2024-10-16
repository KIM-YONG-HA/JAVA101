package d1016;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 문자열 입력 받아 배열에 저장
		// 검색한 문자가 문자가 몇개 인지?
		// 인덱스 위치는 어디인지?

		// ex) apple, p 검색
		// p 2개 존재, p => 1, 2

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		char[] strArr = new char[str.length()];

		for (int i = 0; i < strArr.length; i++) {

			strArr[i] = str.charAt(i);

		}

		System.out.print("검색할 문자 : ");
		String findWord = sc.next(); // char findWord = sc.nextLine().charAt(0);

		int cnt = 0;
		int[] strIDX = new int[str.length()];

		for (int i = 0; i < strArr.length; i++) {

			String tmpStr = String.valueOf(strArr[i]);

			if (tmpStr.equals(findWord)) {

				strIDX[cnt] = i;
				cnt++;

			}

		}

		System.out.println("검색된 문자 개수 : " + cnt);

		for (int i = 0; i < cnt; i++) {

			if (i == 0)
				System.out.print("인덱스의 위치는 : ");

			if (i < cnt - 1) {

				System.out.print(strIDX[i] + ", ");

			} else {

				System.out.print(strIDX[i]);

			}

		}

	}

}

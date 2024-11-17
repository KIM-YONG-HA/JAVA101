package J101.ScannerClass;

import java.util.Scanner;

public class J101_Scanner_nextLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터를 입력 > ");
		String a = sc.nextLine();
		System.out.println("데이터를 입력 > ");
		String b = sc.nextLine();
		System.out.println("데이터를 입력 > ");
		String c = sc.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
		
	}

}


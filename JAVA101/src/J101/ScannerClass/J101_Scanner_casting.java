package J101.ScannerClass;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class J101_Scanner_casting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터를 입력 : ");
		
		String a = sc.next();
		System.out.println(Integer.parseInt(a));

		
		int b = sc.nextInt();
		System.out.println(String.valueOf(b));
		
		
		
		
		sc.close();
		
	}

}


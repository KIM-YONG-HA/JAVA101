package J101.ScannerClass;

import java.util.Scanner;

public class J101_Scanner_has {

	public static void main(String[] args) {
		
		String data = "1 q 2 w 3 e 4 r";
        Scanner sc = new Scanner(data);

		while (sc.hasNext()) {
			
			if (sc.hasNextInt()) {
				
				System.out.println("숫자: " + sc.nextInt());
				
			} else {
				
				System.out.println("문자열: " + sc.next());
			}
			
		}

        sc.close(); 
	}

}

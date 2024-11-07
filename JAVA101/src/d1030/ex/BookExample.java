package ex1030;

import java.util.Scanner;

public class BookExample {

	public static void main(String[] args) {
		
		
//		Book b = new Book();
//		
//		b.showBook("홍길동전",10000,"허균");
//		b.showBook("혼자공부하는자바",28000,"???");
		
		// 책이 여러권이고 사용자에게 입력받아 출력하려면?
		
		// 객체 배열
		Book[] b = new Book[3];
		
//		 Book[] b = {new Book(a,b,c), new Book(d,e,f), new Book(g,h,i)};
		
		
		
		
		
//		
//		b[0].title = "홍길동전";
//		b[0].price = 10000;
//		b[0].writer = "허균";
//		
//		b[1].title = "채식주의자";
//		b[1].price = 22000;
//		b[1].writer = "한강";
//		
//		b[2].title = "운수 좋은 날";
//		b[2].price = 9000;
//		b[2].writer = "현진건";
//		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<b.length;i++) {
			
			b[i] = new Book();
			
			System.out.print("도서명 > ");
			b[i].title = sc.next();
			System.out.print("가격 > ");
			b[i].price = sc.nextInt();
			System.out.print("저자 > ");
			b[i].writer = sc.next();
			
		}

		for(int i=0;i<b.length;i++) {
			
			b[i].showBook();
			
		}
		
		

	}

}

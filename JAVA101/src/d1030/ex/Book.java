package d1030.ex;

public class Book {
	
	
	String title;
	int price;
	String writer;
	
	
	public Book() {
		
	}
	


	void showBook() {
		
		System.out.printf("%s의 가격은 %d원이고 저자는 %s입니다. %n",title, price, writer);
		
	}
	
	
	

}

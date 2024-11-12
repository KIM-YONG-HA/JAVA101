package d1112;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {

		
		Reader reader = new FileReader("C:/StreamEx/test7.txt");
		
		while(true) {
			int data = reader.read();
			
			if(data == -1) break;
			
			
			System.out.println((char)data);
			
		}
			
		
		
		
	}

}

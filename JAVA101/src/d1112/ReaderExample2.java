package d1112;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {

		
		Reader reader = new FileReader("C://StreamEx/test8.txt");
		
		char[] buffer = new char[100];
		
		
		while(true) {
			
			
			
			int readCharNum = reader.read(buffer,1,3);
			
			if(readCharNum == -1) break;
			
			
			for(int i=0;i<buffer.length;i++) {
				
				
				System.out.println(buffer[i]);
				
			}
			
			
			
		}
		
		

	}

}

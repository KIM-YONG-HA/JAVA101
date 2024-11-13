package d1112;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("C:/StreamEx/test9.txt");
		
		
		char[] buffer = new char[5];
		int readCharNum = reader.read(buffer,1,2);
		
		
		if(readCharNum != -1) {
			
			for(int i=0;i<buffer.length;i++) {
				
				System.out.println(buffer[i]);
				
			}
			
		}
		
		
		
		
	}

}

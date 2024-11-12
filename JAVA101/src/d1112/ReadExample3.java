package d1112;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {

		
		
		InputStream is = new FileInputStream("C:/StreamEx/test3.db");
		
		
		byte buffer[] = new byte[5];
		
		while(true) {
			
			int readByteNum = is.read(buffer,1,3);
			
			if(readByteNum == -1) break;
			for(int i=0;i<buffer.length;i++) {
				
				
				System.out.println(buffer[i]);
				
//				0
//				0
//				20
//				30
//				40
				
			}
		}
		
		is.close();
		
		System.out.println("---");
		
		System.out.println(buffer[0]);
		
		
		
	}

}

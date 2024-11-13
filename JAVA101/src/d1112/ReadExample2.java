package d1112;

import java.io.*;


public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		
		
		
		
		InputStream is = new FileInputStream("c:/StreamEx/test2.db");
		
		byte buffer[] = new byte[100];
		
		
		
		while(true) {
			
			int readByteNum = is.read(buffer);
//			int readByteNum = is.read(buffer,0,3);
			if(readByteNum == -1) break;
			
			
			
			for(int i=0;i<readByteNum;i++) {
				
				System.out.println(buffer[i]);
				
			}
			
		}
		
		

	}

}

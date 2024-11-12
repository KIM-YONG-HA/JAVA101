package d1112;

import java.io.*;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		
		
		
	OutputStream os = new FileOutputStream("C:/StreamEx/test3.db");
	
	byte[] array = {10,20,30,40,50};
	
	
	os.write(array,1,3);
		
	os.flush();
	os.close();
	
	
	
	}

}

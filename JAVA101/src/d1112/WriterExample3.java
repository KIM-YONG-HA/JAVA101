package d1112;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample3 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("C:/StreamEx/test9.txt");
		
		char array[] = {'A','B','C','D','E','F'};
		
		writer.write(array, 1,3);
		
		
		writer.flush();
		writer.close();
		

	}

}

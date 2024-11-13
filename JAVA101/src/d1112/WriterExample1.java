package d1112;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample1 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("C:/StreamEx/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		

	}

}

package d1112;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		write("문자 변환 스트림을 사용");
		String data = read();
		System.out.println(data);
		
		

	}
	
	
	public static void write(String str) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/StreamEx/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);
		writer.flush();
		writer.close();
			
		
		
	}

	
	public static String read() throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/StreamEx/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		
		int readCharNum = reader.read(buffer);
		
		reader.close();
		String data = new String(buffer, 0, readCharNum); // char 배열에서 읽은 수만큼 문자열로 변환
		
		
		
		return data;
		
	}
	
	

}

	
	






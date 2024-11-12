package d1112;

import java.io.*;

public class NonBufferVsBufferExample {
	

	public static void main(String[] args) throws Exception {
		
		// 기본 스트림 생성
		String originalFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/StreamEx/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 버퍼 보조스트림 연결
		
		String originalFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/StreamEx/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		
		long nonBufferTime = copy(fis, fos);
		
		System.out.println("버퍼를 사용하지 않았을 때 " + nonBufferTime);
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 " + bufferTime);
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
		
	}
	
	
	static int data = -1;
	
	public static long copy(InputStream is, OutputStream os) throws Exception {

		long start = System.nanoTime();

		while (true) {

			data = is.read();
			if (data == -1) break;

			os.write(data);
		
		}
		
		os.flush();

		long end = System.nanoTime();

		return (end - start);
	}
	
	
	

}

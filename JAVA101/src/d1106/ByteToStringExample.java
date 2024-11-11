package d1106;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,65};
		
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		
		byte b1 = 'A';
		System.out.println(b1);
		
		
		String str3 = "Hello";
		byte[] b2 = str3.getBytes();
		System.out.println(b2[0]);
		
		for(int i=0;i<b2.length;i++) {
			
			//System.out.println(b2[i]);
			
		}
		
		int a = 118;
		String str4 = new String();
		System.out.println(str4.valueOf(a));
		
		
		
		
		
		
	}

}

package d1107.am;

import java.text.*;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		
		Date now = new Date();
		
		
		String strNow1 = now.toString();
		
		System.out.println(strNow1);
		
		
		SimpleDateFormat sdf =  new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		
		System.out.println(sdf);
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}

package d1107.am;

import java.time.DayOfWeek;
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 
		int day = now.get(Calendar.DAY_OF_MONTH);		
		
		
		
		
		System.out.printf("%d-%d-%02d %n", year, month, day);
		
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		int weekOfMonth = now.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = now.get(Calendar.WEEK_OF_YEAR);
		
		
		System.out.println("dayOfWeek : " + dayOfWeek);
		System.out.println("weekOfMonth : " + weekOfMonth);
		System.out.println("weekOfYear : " +weekOfYear);
		
		
		System.out.println();
		
		
		
		String strWeek = null;
		
		
		switch(dayOfWeek) {
				
			case Calendar.SUNDAY : strWeek = "일"; break;
			case Calendar.MONDAY : strWeek = "월"; break;
			case Calendar.TUESDAY : strWeek = "화"; break;
			case Calendar.WEDNESDAY : strWeek = "수"; break;
			case Calendar.THURSDAY : strWeek = "목"; break;
			case Calendar.FRIDAY : strWeek = "금"; break;
			case Calendar.SATURDAY : strWeek = "토"; break;
			default :;
		
		}
		
		
		System.out.println(strWeek);
		
		
		String strAmPm = null;
		int amPm = now.get(Calendar.AM_PM);
		
		
		if(amPm == Calendar.AM) {
			
			strAmPm = "오전";
			
		} else {
			
			strAmPm = "오후";
			
		}
		
		System.out.println(strAmPm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

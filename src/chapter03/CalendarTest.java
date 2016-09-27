package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		
//		calendar.set(Calendar.YEAR, 2007);
//		calendar.set(Calendar.MONTH, 10);
//		calendar.set(Calendar.DATE, 18);
		
		calendar.set(2011,05,26);
		calendar.add(Calendar.DATE, 2000);
		printDate(calendar);
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
	}
	
	public static void printDate(Calendar calendar){
		String[] days = {"일","월","화","수","목","금","토"};
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"년"+(month+1)+"월"+date+"일"+day+"요일"+hour+":"+min+":"+sec);
		
		
	}

}

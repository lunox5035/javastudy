package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		
//		System.out.println(cal);
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		
		cal.set(2021, 6,8 );
		cal.add(Calendar.DATE,1000);

		printDate(cal);
		
	}
	
	private static void printDate(Calendar cal) {
		final String[] DAYS= {"일","월","화","수","목","금","토"};
		
		int yrar=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DATE);
		int day=cal.get(Calendar.DAY_OF_WEEK);
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		System.out.println(
				(yrar)+"-"+
				(month+1)+"-"+
				date+" "+
				DAYS[day-1]+"요일 "+
				hour+":"+
				minute+":"+
				second);
	}
		
}

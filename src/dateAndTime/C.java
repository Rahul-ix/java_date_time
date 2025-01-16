package dateAndTime;

import java.util.Calendar;

public class C {

	public static void main(String[] args) {


		// it calculates internally time in milliseconds
		

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());//Wed Dec 18 09:30:19 IST 2024
		System.out.println(cal.getTimeInMillis());//calculates from 1970 to till now internally 1734494452799
		
		int year=cal.get(Calendar.YEAR);//YEAR,MONTH these are enums
		int month=cal.get(Calendar.MONTH);
		int day=cal.get(Calendar.DAY_OF_MONTH);

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
	}

}

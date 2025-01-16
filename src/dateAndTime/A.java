package dateAndTime;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class A {

	public static void main(String[] args) throws ParseException  {
	
		   //java.util.Date 1.0 version
		
		
		
			Date d = new Date();//it prints current time and date
			System.out.println(d);//Wed Dec 18 09:04:43 IST 2024
			
			//.getTime()
			
			long time=d.getTime();//it print milliseconds of time from 1970 jan 1
			Date formated=new Date(time+86400000);//+1 day after
			System.out.println(formated);
			
			//you can perticular date month year
			Date d1 = new Date(124,1,1);//you can use but it is deprecated it is actually old
										//instead you use java.sql.Datte
			SimpleDateFormat s=new SimpleDateFormat("dd-MMMM-yyyy");//MMM-Feb :: MMMM-February
			System.out.println(s.format(d1));
			
			
			// you can pass string as date alse
			
			String stringDate="2100-1-1";
			SimpleDateFormat s2= new SimpleDateFormat("yyyy-MMM-dd");
			Date formatedDate=s2.parse(stringDate);
			System.out.println(formatedDate);
		
		
		
		
		
		
	}
}

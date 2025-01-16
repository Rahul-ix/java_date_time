package dateAndTime;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class B {

	public static void main(String[] args) {
		
		//java.sql.Date 1.2 version
		
//		Date d=new Date();//throws error if you don't pass arguements
		Date d1=new Date(System.currentTimeMillis());//it prints current system time
		System.out.println(d1);//here sql version you get only date and not time
		
		//or you ca pass perticular date it calculates from 1970 
		//ex 1970+124=2024
		Date d2 = new Date (124,1,1);
		System.out.println(d2);
		
		//you can formate as you want suppose i want this format day-month-year
		Date d3 = new Date(124,1,1);
		SimpleDateFormat s = new SimpleDateFormat("dd-MMMM-yyyy");
		System.out.println(s.format(d3));//01-February-2024
		

	}

}

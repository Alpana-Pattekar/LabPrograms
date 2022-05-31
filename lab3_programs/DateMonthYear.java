package lab3_programs;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;



public class DateMonthYear {
	
	
	public static void main(String args[]) {
		//creating a calender object
		Calendar cal = new GregorianCalendar(2020, 07, 18);
		
		//getting the values of day,month and year from calender object
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		//printing day month and year
		System.out.println("Day: "+day);
		System.out.println("Month: "+month);
		System.out.println("Year: "+year);
	}

}

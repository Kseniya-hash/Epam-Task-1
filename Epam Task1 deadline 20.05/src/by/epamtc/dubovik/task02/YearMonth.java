/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 2.
 */

package by.epamtc.dubovik.task02;

import by.epamtc.dubovik.for_all_tasks.Validation;

/**
 * class for finding leap years and number of days per month
 * @author Ксения
 */
public class YearMonth {
	/**check if year is leap*/
	public static boolean isLeapYear(int year) throws Exception{
		final int REGULARITYOFLEAP = 4; 
		final int EXCEPTIONYEAR = 100; 
		final int NOTEXCEPTIONYEAR = 400; 
		
		if (Validation.isNegative(year)) {
			throw new Exception("Invalid value for year");
		}
		if ((year % NOTEXCEPTIONYEAR) == 0) {
			return true;
		} else if ((year % EXCEPTIONYEAR) == 0){
			return false;
		}
		return (year % REGULARITYOFLEAP) == 0;
	}
	
	/**find number of days in month*/
	public static int calculateDaysInMonth(int year, int month) throws Exception {
		int days = 30;					//Default number of days in month
		final int DAYSINFEBRUARY = 28;
		final int FEBRUARY = 2;
		final int JULY = 7;
		
		if (!ValidationForMonth.isMonth(month)) {
			throw new Exception("Invalid value for month");
		}
		if(month == FEBRUARY) {
			days = DAYSINFEBRUARY;
			if (isLeapYear(year)) {
				days++;
			}
			return days;
		}
		if(month <= JULY) {
			days += month % 2;
		} else {
			days += 1 - month % 2;
		}
		return days;
	}
}

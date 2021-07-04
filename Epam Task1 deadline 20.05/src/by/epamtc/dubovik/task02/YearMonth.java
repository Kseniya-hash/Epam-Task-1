/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 */

package by.epamtc.dubovik.task02;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Validation;

public class YearMonth {
	
	public static boolean isLeapYear(int year) throws InvalidValueException{
		if (Validation.isNegative(year)) {
			throw new InvalidValueException("Invalid value for year");
		}
		
		final int REGULARITYOFLEAP = 4; 
		final int EXCEPTIONYEAR = 100; 
		final int NOTEXCEPTIONYEAR = 400; 
		boolean leap = ((year % REGULARITYOFLEAP) == 0);
		
		if ((year % EXCEPTIONYEAR) == 0 && (year % NOTEXCEPTIONYEAR) != 0){
			leap = false;
		}
		
		return leap;
	}
	
	public static int calculateDaysInMonth(int year, int month) throws InvalidValueException {
		if (!ValidationForMonth.isMonth(month)) {
			throw new InvalidValueException("Invalid value for month");
		}
		
		final int DAYSINFEBRUARYLEAP = 29;
		final int FEBRUARY = 2;
		int days;
		
		days = Month.values()[month - 1].getDays();
		if((month == FEBRUARY) && isLeapYear(year)) {
				days = DAYSINFEBRUARYLEAP;
		}
		
		return days;
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 2.
 */

package task2;
/**
 * class for finding leap years and number of days per month
 * @author Ксения
 */
public class YearMonth {
	/**check if year is leap*/
	public static boolean isLeapYear(int year) {
		final int REGULARITYOFLEAP = 4; 
		final int EXCEPTIONYEAR = 100; 
		final int NOTEXCEPTIONYEAR = 400; 
		
		if ((year % NOTEXCEPTIONYEAR) == 0) {
			return true;
		} else if ((year % EXCEPTIONYEAR) == 0){
			return false;
		}
		return (year % REGULARITYOFLEAP) == 0;
	}
	
	/**find number of days in month*/
	public static int getDaysInMonth(int year, int month) throws IllegalArgumentException {
		int days = 30;					//Default number of days in month
		final int DAYSINFEBRUARY = 28;
		final int FEBRUARY = 2;
		final int JULY = 7;
		
		if (!Validation.isMonth(month)) {
			throw new IllegalArgumentException("Invalid value for month");
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

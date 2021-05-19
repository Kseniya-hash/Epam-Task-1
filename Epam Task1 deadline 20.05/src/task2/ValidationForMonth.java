package task2;

public class ValidationForMonth {
	
	/** Check if n is valid number for a month */
	public static boolean isMonth(int n) {
		return ((n > 0) && (n <= 12)) ? true : false;
	}
}

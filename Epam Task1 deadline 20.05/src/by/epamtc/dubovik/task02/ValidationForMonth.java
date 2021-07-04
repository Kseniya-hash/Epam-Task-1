package by.epamtc.dubovik.task02;

public class ValidationForMonth {
	
	public static boolean isMonth(int n) {
		return ((n > 0) && (n <= 12)) ? true : false;
	}
}

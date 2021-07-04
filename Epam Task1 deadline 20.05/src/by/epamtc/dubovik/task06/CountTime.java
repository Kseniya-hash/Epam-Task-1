/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
 * моменту.
 */

package by.epamtc.dubovik.task06;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Validation;

public class CountTime {
	private final static int SECONDSINHOUR = 3600;
	private final static int SECONDSINMINUTE = 60;
	private final static String EXCEPTIONMESSAGE = "Invalid value for seconds";
	
	public static int calculateHours(int seconds) throws InvalidValueException {
		if (Validation.isNegative(seconds)) {
			throw new InvalidValueException(EXCEPTIONMESSAGE);
		}
		
		int hours = seconds / SECONDSINHOUR;
		return hours;
	}
	
	public static int calculateMinutes(int seconds) throws InvalidValueException {
		if (Validation.isNegative(seconds)) {
			throw new InvalidValueException(EXCEPTIONMESSAGE);
		}
		
		int minutes = (seconds % SECONDSINHOUR) / SECONDSINMINUTE;
		return minutes;
	}
	
	public static int calculateSeconds(int seconds) throws InvalidValueException {
		if (Validation.isNegative(seconds)) {
			throw new InvalidValueException(EXCEPTIONMESSAGE);
		}
		
		int secondsLessThanMinute = seconds % SECONDSINMINUTE;
		return secondsLessThanMinute;
	}
}

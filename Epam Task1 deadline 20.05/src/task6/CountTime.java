/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 6.
 */

package task6;

import for_all_tasks.Validation;

/**
 * Class for counting how many hours, minutes and seconds passed.
 * @author Ксения
 *
 */
public class CountTime {
	private final static int SECONDSINHOUR = 3600;		//hour is 3600 seconds
	private final static int SECONDSINMINUTE = 60;		//minute is 60 seconds
	
	/**
	 * @param seconds
	 * @return how many full hours has passed
	 */
	public static int getHours(int seconds) throws IllegalArgumentException {
		if (Validation.isNegative(seconds)) {
			throw new IllegalArgumentException("Invalid value for seconds");
		}
		return seconds / SECONDSINHOUR;
	}
	
	/**
	 * @param seconds
	 * @return how many full minutes has passed
	 */
	public static int getMinutes(int seconds) throws IllegalArgumentException {
		if (Validation.isNegative(seconds)) {
			throw new IllegalArgumentException("Invalid value for seconds");
		}
		return (seconds % SECONDSINHOUR) / SECONDSINMINUTE;
	}
	
	/**
	 * @param seconds
	 * @return how many full seconds has passed
	 */
	public static int getSeconds(int seconds) throws IllegalArgumentException {
		if (Validation.isNegative(seconds)) {
			throw new IllegalArgumentException("Invalid value for seconds");
		}
		return seconds % SECONDSINMINUTE;
	}
	

}

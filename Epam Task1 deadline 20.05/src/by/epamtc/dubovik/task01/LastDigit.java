/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 1.
 */

package by.epamtc.dubovik.task01;

import java.math.*;

/**
 * Class for working with last digit of number
 * @author Kseniya
 */
public class LastDigit {
	private final static int BASE = 10;		// Base of numeral system
	
	/** 
	 * @param n
	 * @return last digit of integer number
	 */
	public static int calculateLastDigit(int number) {
		return number%BASE;
	}
	
	/**
	 * @param n
	 * @return last digit of square of integer number  
	 */
	public static int calculateLastDigitOfsquare(int number) {
		int lastDigitOfsquare = calculateLastDigit((int)Math.pow(number,2));
		
		return lastDigitOfsquare;
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 1.
 */

package task1;

import java.math.*;

/**
 * Class for working with last digit of number
 * @author Ксения
 */
public class LastDigit {
	private final static int BASE = 10;		// Base of numeral system
	
	/** 
	 * @param n
	 * @return last digit of integer number
	 */
	public static int getLastDigit(int n) {
		return n%BASE;
	}
	
	/**
	 * @param n
	 * @return last digit of square of integer number  
	 */
	public static int getLastDigitOfsquare(int n) {
		return getLastDigit((int)Math.pow(n,2));
	}
}

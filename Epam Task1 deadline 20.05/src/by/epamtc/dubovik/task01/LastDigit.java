/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * 	Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
 *	квадрата.Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
 *	квадрата.
 */

package by.epamtc.dubovik.task01;

import java.math.*;

public class LastDigit {
	private final static int BASE = 10;		// Base of numeral system
	
	private static int calculateLastDigit(int number) {
		return Math.abs(number%BASE);
	}
	
	public static int calculateLastDigitOfSquare(int number) {
		int lastDigit = calculateLastDigit(number);
		int lastDigitOfsquare = calculateLastDigit((int)Math.pow(lastDigit,2));
		
		return lastDigitOfsquare;
	}
}

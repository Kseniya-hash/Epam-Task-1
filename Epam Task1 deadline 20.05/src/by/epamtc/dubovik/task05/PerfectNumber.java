/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 5.
 */

package by.epamtc.dubovik.task05;

import java.math.*;
import by.epamtc.dubovik.for_all_tasks.Validation;

/**
 * Class for checking if number is perfect
 * @author Ксения
 *
 */
public class PerfectNumber {
	
	/** Return summ of all dividers of n*/
	private static int summOfDividers(int n) throws Exception {
		if (Validation.isNegative(n)) {
			throw new Exception("Invalid value. Can not be below zero");
		}
		int summ = 1;
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if ((n % i) == 0) {
				summ += i;
				summ += n / i;
			}
		}
		return summ;
	}
	
	/** Return true if number is perfect
	 * @throws Exception */
	public static boolean isPerfect(int n) throws Exception {
		return summOfDividers(n) == n;
	}

}

/*
 * Kseniya Dubovik 
 * 
 * 16.05.2021
 * 
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
 * числу).
 */

package by.epamtc.dubovik.task05;

import java.math.*;

public class PerfectNumber {
	
	private static int summOfDividers(int number) {
		number = Math.abs(number);
		int summ = 1;
		
		for (int i = 2; i < Math.sqrt(number); i++) {
			if ((number % i) == 0) {
				summ += i;
				summ += number / i;
			}
		}
		return summ;
	}
	
	public static boolean isPerfect(int number) {
		boolean isPerfectNumber = (summOfDividers(number) == number);
		
		return isPerfectNumber;
	}

}

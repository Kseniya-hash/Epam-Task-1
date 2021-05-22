/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 4.
 */

package by.epamtc.dubovik.task04;
/**
 * Class for checking if number is even.
 * Counting number of even in an array.
 * @author Ксения
 */
public class EvenNumbers {
	
	/** check if n - even number */
	public static boolean isEven(int number) {
		return ((number % 2) == 0) ? true : false;
	}
	
	/**return number of even numbers in an array */
	public static int countEvenNumbers(int[] array) {
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (isEven(array[i])) {
				count++;
			}
		}
		return count;
	}
	/**
	 * 
	 * @param array - array of integer numbers
	 * @param n - integer number
	 * @return true, if array contains at  least n even numbers
	 * 		   false, if less
	 */
	public static boolean containsNEven(int[] array,  int number) {
		boolean morethanNEven = countEvenNumbers(array) >= number;
		
		return morethanNEven;
	}
}

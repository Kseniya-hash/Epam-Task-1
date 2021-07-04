/*
 * Kseniya Dubovik
 *  
 * 16.05.2021
 * 
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.dubovik.task04;
public class EvenNumbers {
	
	private static boolean isEven(int number) {
		return ((number % 2) == 0) ? true : false;
	}
	private static int countEvenNumbers(int[] array) {
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (isEven(array[i])) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean containsNEven(int[] array,  int number) {
		boolean hasNEven = countEvenNumbers(array) >= number;
		
		return hasNEven;
	}
}

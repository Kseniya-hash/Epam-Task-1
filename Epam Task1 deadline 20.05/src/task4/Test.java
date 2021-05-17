/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 4.
 */

package task4;

import for_all_tasks.Reader;

public class Test {

	public static void main(String args[]) {
		int countOfEven = 2;	//
		int length = 4;			//length of array
		int[] array;			//array of numbers
		
		System.out.println("¬ведите 4 числа");
		array = Reader.readArray(length);
		System.out.println(EvenNumbers.containsNEven(array, countOfEven));
	}
}

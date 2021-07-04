/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 */

package by.epamtc.dubovik.task04;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {

	public static void main(String args[]) {
		int countOfEven = 2;	
		int length = 4;			
		int[] array;			
		
		System.out.println("Введите 4 числа");
		array = Reader.readArray(length);
		System.out.println(EvenNumbers.containsNEven(array, countOfEven));
	}
}

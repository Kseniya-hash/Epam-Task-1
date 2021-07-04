/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 5.
 */
package by.epamtc.dubovik.task05;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		int number;
		
		System.out.println("Введите число:");
		number = Reader.readInt();
		System.out.println(PerfectNumber.isPerfect(number));
	}
}

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

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		int number;
		
		System.out.println("Введите число:");
		number = Reader.readInt();
		System.out.println(PerfectNumber.isPerfect(number));
	}
}

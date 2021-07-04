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

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	public static void main(String args[]) {
		int number;
		System.out.println("Введите число:");
		number = Reader.readInt();
		System.out.println("Последняя цифра квадрата: "
						   + LastDigit.calculateLastDigitOfSquare(number));
	}
}

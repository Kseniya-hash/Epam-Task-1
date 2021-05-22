/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 1.
 */
package by.epamtc.dubovik.task01;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int number;
		
		System.out.println("Введите целое число");
		number = Reader.readInt();
		int lastDigitOfN = LastDigit.calculateLastDigit(number);
		System.out.println("Последняя цифра квадрата: "
						   + LastDigit.calculateLastDigitOfsquare(lastDigitOfN));
	}

}

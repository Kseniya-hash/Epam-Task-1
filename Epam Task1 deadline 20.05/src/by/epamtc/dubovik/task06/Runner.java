/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 6.
 */

package by.epamtc.dubovik.task06;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		int seconds;
		
		System.out.println("Введите число секунд:");
		seconds = Reader.readInt();
		try {
			System.out.println("Прошло " + CountTime.calculateHours(seconds) + " часов "
							  + CountTime.calculateMinutes(seconds) + " минут "
							  + CountTime.calculateSeconds(seconds)+ " секунд.");
		} catch (InvalidValueException e) {
			System.out.println("Число секунд не может быть отрицательным");
		}
	}

}

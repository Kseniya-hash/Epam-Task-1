/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 6.
 */

package task6;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int seconds;
		
		System.out.println("Введите число секунд:");
		seconds = Reader.readInt();
		try {
			System.out.println("Прошло " + CountTime.getHours(seconds) + " часов "
							  + CountTime.getMinutes(seconds) + " минут "
							  + CountTime.getSeconds(seconds)+ " секунд.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}

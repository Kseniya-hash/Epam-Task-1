/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 2.
 */

package task2;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int year;
		int month;
		
		System.out.println("Введите год:");
		year = Reader.readInt();
		System.out.println("Введите месяц:");
		month = Reader.readInt();
		if(YearMonth.isLeapYear(year)) {
			System.out.println("Год високосный");
		} else {
			System.out.println("Год не високосный");
		}
		try {
		System.out.println("В " + month + " месяце "
						  + YearMonth.getDaysInMonth(year, month) + " дней");	
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 2.
 */

package by.epamtc.dubovik.task02;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int year;
		int month;
		
		System.out.println("Введите год:");
		year = Reader.readInt();
		System.out.println("Введите месяц:");
		month = Reader.readInt();
		try {
		if(YearMonth.isLeapYear(year)) {
			System.out.println("Год високосный");
		} else {
			System.out.println("Год не високосный");
		}
		System.out.println("В " + month + " месяце "
						  + YearMonth.calculateDaysInMonth(year, month) + " дней");	
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

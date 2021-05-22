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
		
		System.out.println("������� ���:");
		year = Reader.readInt();
		System.out.println("������� �����:");
		month = Reader.readInt();
		try {
		if(YearMonth.isLeapYear(year)) {
			System.out.println("��� ����������");
		} else {
			System.out.println("��� �� ����������");
		}
		System.out.println("� " + month + " ������ "
						  + YearMonth.calculateDaysInMonth(year, month) + " ����");	
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

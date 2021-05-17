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
		
		System.out.println("������� ���:");
		year = Reader.readInt();
		System.out.println("������� �����:");
		month = Reader.readInt();
		if(YearMonth.isLeapYear(year)) {
			System.out.println("��� ����������");
		} else {
			System.out.println("��� �� ����������");
		}
		try {
		System.out.println("� " + month + " ������ "
						  + YearMonth.getDaysInMonth(year, month) + " ����");	
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 6.
 */

package by.epamtc.dubovik.task06;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int seconds;
		
		System.out.println("������� ����� ������:");
		seconds = Reader.readInt();
		try {
			System.out.println("������ " + CountTime.calculateHours(seconds) + " ����� "
							  + CountTime.calculateMinutes(seconds) + " ����� "
							  + CountTime.calculateSeconds(seconds)+ " ������.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

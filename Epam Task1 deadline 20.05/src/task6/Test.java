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
		
		System.out.println("������� ����� ������:");
		seconds = Reader.readInt();
		try {
			System.out.println("������ " + CountTime.getHours(seconds) + " ����� "
							  + CountTime.getMinutes(seconds) + " ����� "
							  + CountTime.getSeconds(seconds)+ " ������.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}

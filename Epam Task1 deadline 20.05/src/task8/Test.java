/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 8.
 */

package task8;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double x;
		
		System.out.println("������� �:");
		x = Reader.readDouble();
		System.out.println("�������� � ���� �����: " + Function.function(x));
	}
}

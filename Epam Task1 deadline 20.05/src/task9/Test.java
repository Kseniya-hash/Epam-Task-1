/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 9.
 */

package task9;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double radius;
		
		System.out.println("������� ������ �����:");
		radius = Reader.readDouble();
		System.out.println("������� �����: " + Circle.getArea(radius) + "\n"
						  + "����� ��� ����������: " + Circle.getCircumference(radius));
	}

}

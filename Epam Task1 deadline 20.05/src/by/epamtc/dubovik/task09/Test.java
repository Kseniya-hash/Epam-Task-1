/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 9.
 */

package by.epamtc.dubovik.task09;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double radius;
		
		System.out.println("������� ������:");
		radius = Reader.readDouble();
		try {
		System.out.println("������� �����: " + Circle.calculateArea(radius) + "\n"
						  + "����� ����������: " + Circle.calculateCircumference(radius));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
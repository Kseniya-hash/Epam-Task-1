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
		
		System.out.println("Введите радиус:");
		radius = Reader.readDouble();
		try {
		System.out.println("Площадь круга: " + Circle.calculateArea(radius) + "\n"
						  + "Длина окружности: " + Circle.calculateCircumference(radius));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
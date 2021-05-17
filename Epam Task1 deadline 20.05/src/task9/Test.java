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
		
		System.out.println("Введите радиус круга:");
		radius = Reader.readDouble();
		System.out.println("Площадь круга: " + Circle.getArea(radius) + "\n"
						  + "Длина его окружности: " + Circle.getCircumference(radius));
	}

}

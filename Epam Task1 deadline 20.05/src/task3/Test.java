/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 3.
 */

package task3;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double area;			//area of the square
		double diameter;		//diameter of the circle inscribed in a square
		double smallerArea;		//area of the square inscribed in a circle
	
		System.out.println("Введите площадь квадрата:");
		area = Reader.readDouble();
		diameter = Area.getSideOfSquare(area);
		smallerArea = Area.getAreafromDiagonal(diameter);
		System.out.println("Диаметр круга, вписанного в квадрат:" + diameter + "\n"
						  + "Площадь квадрата, вписанного в окружность " + smallerArea + "\n"
						  + "Площадь вписанного квадрада меньше площади заданного в "
						  + Area.getRatio(area, smallerArea ) + " раза");
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 3.
 */

package by.epamtc.dubovik.task03;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double area;			//area of the square
		double diameter;		//diameter of the circle inscribed in a square
		double smallerArea;		//area of the square inscribed in a circle
	
		System.out.println("Введите площадь квадрата:");
		try {
		area = Reader.readDouble();
		diameter = Area.calculateSideOfSquare(area);
		smallerArea = Area.calculateAreafromDiagonal(diameter);
		System.out.println("Диаметр круга, вписанного в квадрат:" + diameter + "\n"
						  + "Площадь квадрата, вписанного в окружность " + smallerArea + "\n"
						  + "Площадь вписанного квадрада меньше площади заданного в "
						  + Area.calculateRatio(area, smallerArea ) + " раза");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.dubovik.task03;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		double area;			
		double diameter;		
		double smallerArea;		
	
		System.out.println("Введите площадь квадрата:");
		try {
		area = Reader.readDouble();
		diameter = Area.calculateSideOfSquare(area);
		smallerArea = Area.calculateAreafromDiagonal(diameter);
		System.out.println("Диаметр круга, вписанного в квадрат:" + diameter + "\n"
						  + "Площадь квадрата, вписанного в круг " + smallerArea + "\n"
						  + "Площадь первого квадрата больше площади второго в "
						  + Area.calculateRatio(area, smallerArea ) + " раза");
		} catch (InvalidValueException e){
			System.out.println("Площадь квадрате не может быть меньше нуля.");
		}
	}
}

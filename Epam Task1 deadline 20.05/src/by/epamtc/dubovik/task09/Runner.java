/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

package by.epamtc.dubovik.task09;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		double radius;
		
		System.out.println("Введите радиус:");
		radius = Reader.readDouble();
		try {
		System.out.println("Площадь круга: " + Circle.calculateArea(radius) + "\n"
						  + "Длина окружности: " + Circle.calculateCircumference(radius));
		} catch (InvalidValueException e){
			System.out.println(e.getMessage());
		}
	}

}
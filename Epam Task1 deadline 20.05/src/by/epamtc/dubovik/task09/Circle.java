/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

package by.epamtc.dubovik.task09;

import java.math.*;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Validation;

public class Circle {
	private static final String EXCEPTIONMESSAGE = "Invalid value. Radius can not be below zero";
	
	public static double calculateArea(double radius) throws InvalidValueException{
		if (Validation.isNegative(radius)) {
			throw new InvalidValueException(EXCEPTIONMESSAGE);
		}
		
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public static double calculateCircumference(double radius) throws InvalidValueException{
		if (Validation.isNegative(radius)) {
			throw new InvalidValueException(EXCEPTIONMESSAGE);
		}
		
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
}

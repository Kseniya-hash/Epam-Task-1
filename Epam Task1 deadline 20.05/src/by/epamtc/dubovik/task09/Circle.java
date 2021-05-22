/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 9.
 */

package by.epamtc.dubovik.task09;

import java.math.*;
import by.epamtc.dubovik.for_all_tasks.Validation;

/**
 * class for calculating area and circumference of a circle
 * @author Kseniya
 *
 */
public class Circle {
	/** return area of the circle of the given radius*/
	public static double calculateArea(double radius) throws Exception{
		double area;
		
		if (Validation.isNegative(radius)) {
			throw new Exception("Invalid value. Can not be below zero");
		}
		area = Math.PI * radius * radius;
		return area;
	}
	
	/**return circumference of the circle of the given radius*/
	public static double calculateCircumference(double radius) throws Exception{
		double circumferenceToRadiusRatio = 2 * Math.PI;
		double circumference;
		
		if (Validation.isNegative(radius)) {
			throw new Exception("Invalid value. Can not be below zero");
		}
		circumference = circumferenceToRadiusRatio * radius;
		return circumference;
	}
}

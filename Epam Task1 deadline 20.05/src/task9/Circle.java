/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 9.
 */

package task9;

import java.math.*;
import for_all_tasks.Validation;

/**
 * class for calculating area and circumference of a circle
 * @author Ксения
 *
 */
public class Circle {
	/** return area of the circle of the given radius*/
	public static double getArea(double radius) {
		if (Validation.isNegative(radius)) {
			throw new IllegalArgumentException("Invalid value. Can not be below zero");
		}
		return Math.PI * radius * radius;
	}
	
	/**return circumference of the circle of the given radius*/
	public static double getCircumference(double radius) {
		if (Validation.isNegative(radius)) {
			throw new IllegalArgumentException("Invalid value. Can not be below zero");
		}
		return 2 * Math.PI * radius;
	}
}

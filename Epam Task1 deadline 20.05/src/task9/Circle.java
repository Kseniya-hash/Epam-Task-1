/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 9.
 */

package task9;

import java.math.*;

/**
 * class for calculating area and circumference of a circle
 * @author Ксения
 *
 */
public class Circle {
	/** return area of the circle of the given radius*/
	public static double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	/**return circumference of the circle of the given radius*/
	public static double getCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
}

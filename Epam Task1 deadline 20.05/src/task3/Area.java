/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 3.
 */

package task3;

import java.math.*;
import for_all_tasks.Validation;

/**
 * Class for working with area of the square
 * @author Ксения
 */
public class Area {
	
	/** 
	 * @param area - area of the square
	 * @return side of the square
	 */
	public static double getSideOfSquare(double area) {
		if (Validation.isNegative(area)) {
			throw new IllegalArgumentException("Invalid value for area. "
											  + "Can not be below zero");
		}
		return Math.sqrt(area);
	}
	
	/**
	 * @param diagonal - diagonal of the square
	 * @return area of the square
	 */
	public static double getAreafromDiagonal(double diagonal) {
		final double RATIO = 1 / Math.sqrt(2);		// Side to diagonal ratio
		double side = diagonal * RATIO;
		
		if (Validation.isNegative(diagonal)) {
			throw new IllegalArgumentException("Invalid value for diagonal. "
											  + "Can not be below zero");
		}
		return Math.pow(side, 2);
	}
	
	/**
	 * @param area1
	 * @param area2
	 * @return area1 to area2 ratio
	 */
	public static double getRatio(double area1, double area2) {
		if (Validation.isNegative(area1) || Validation.isNegative(area2)
										 || (area2 == 0)) {
			throw new IllegalArgumentException("Invalid value for area."
											  + "Can not be below zero");
		}
		return area1/area2;
	}

}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 3.
 */

package by.epamtc.dubovik.task03;

import java.math.*;
import by.epamtc.dubovik.for_all_tasks.Validation;

/**
 * Class for working with area of the square
 * @author Kseniya
 */
public class Area {
	
	/** 
	 * @param area - area of the square
	 * @return side of the square
	 */
	public static double calculateSideOfSquare(double area) throws Exception {
		double side;
		
		if (Validation.isNegative(area)) {
			throw new Exception("Invalid value for area. Can not be below zero");
		}
		side = Math.sqrt(area);
		return side;
	}
	
	/**
	 * @param diagonal - diagonal of the square
	 * @return area of the square
	 */
	public static double calculateAreafromDiagonal(double diagonal) throws Exception {
		final double RATIO = 1 / Math.sqrt(2);		// Side to diagonal ratio
		double side = diagonal * RATIO;
		double area;
		
		if (Validation.isNegative(diagonal)) {
			throw new Exception("Invalid value for diagonal. Can not be below zero");
		}
		area = Math.pow(side, 2);
		return area;
	}
	
	/**
	 * @param area1
	 * @param area2
	 * @return area1 to area2 ratio
	 */
	public static double calculateRatio(double area1, double area2) throws Exception {
		double ratio;
		
		if (Validation.isNegative(area1) || Validation.isNegative(area2)
										 || (area2 == 0)) {
			throw new Exception("Invalid value for area. Can not be below zero");
		}
		ratio = area1/area2;
		return ratio;
	}

}

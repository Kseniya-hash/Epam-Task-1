/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 3.
 */

package task3;

import java.math.*;

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
		return Math.sqrt(area);
	}
	
	/**
	 * @param diagonal - diagonal of the square
	 * @return area of the square
	 */
	public static double getAreafromDiagonal(double diagonal) {
		final double RATIO = 1 / Math.sqrt(2);		// Side to diagonal ratio
		double side = diagonal * RATIO;
		
		return Math.pow(side, 2);
	}
	
	/**
	 * @param area1
	 * @param area2
	 * @return area1 to area2 ratio
	 */
	public static double getRatio(double area1, double area2) {
		return area1/area2;
	}

}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 7.
 */

package by.epamtc.dubovik.task07;

import java.math.*;

import by.epamtc.dubovik.for_all_tasks.Reader;

/**
 * Class for checking which point is closer to the origin
 * @author Ксения
 *
 */
public class PointLogic {
	/**
	 * @param p - point in two-dimensional coordinate system
	 * @return distance from point p to the origin
	 */
	public static double calculatedistance(Point p) {
		double distance = Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
		
		return distance;
	}
	
	/**
	 * 
	 * @param p1
	 * @param p2
	 * @return Point closer to the origin.
	 */
	public static Point closerToOrigin(Point p1, Point p2) {
		if(calculatedistance(p1) > calculatedistance(p2)) {
			return p2;
		}
		return p1;
	}
	
	/** read point from console*/
	public static Point readPoint() {
		Point p;
		double x = Reader.readDouble();
		double y = Reader.readDouble();
		
		p = new  Point(x,y);
		return p;
	}
}

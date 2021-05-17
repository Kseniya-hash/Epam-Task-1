/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 7.
 */

package task7;

import java.math.*;

/**
 * Class for checking which point is closer to the origin
 * @author Ксения
 *
 */
public class PointComparison {
	/**
	 * @param p - point in two-dimensional coordinate system
	 * @return distance from point p to the origin
	 */
	public static double distance(Point p) {
		return Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
	}
	
	/**
	 * 
	 * @param p1
	 * @param p2
	 * @return -1 if p1 is closer to the origin.
	 * 		    0 if distance is equal.
	 * 		    1 if p2 is closer. 
	 */
	public static int compareTo(Point p1, Point p2) {
		return (int)Math.signum(distance(p1) - distance(p2));
	}
}

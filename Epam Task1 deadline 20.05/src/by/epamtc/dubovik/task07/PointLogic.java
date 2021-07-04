/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат. x y.
 */

package by.epamtc.dubovik.task07;

import java.math.*;

public class PointLogic {
	private static double calculateDistance(Point p) {
		double distance = Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
		
		return distance;
	}
	
	public static Point findCloser(Point p1, Point p2) {
		Point result;
		
		if((p1 != null) && (p2 != null)) {
			result = (calculateDistance(p1) > calculateDistance(p2)) ? p2 : p1;
		} else {
			result = (p1 == null) ? p2 : p1;
		}
		
		return result;
	}
}

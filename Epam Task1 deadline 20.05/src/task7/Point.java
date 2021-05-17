/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 7.
 */

package task7;
/**
 * Describe a point in two-dimensional coordinate system
 * @author Ксения
 *
 */
public class Point {
	private double x;
	private double y;
	
	Point(){
		x = 0;
		y = 0;
	}
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + " ; " + y + ")";
	}
}

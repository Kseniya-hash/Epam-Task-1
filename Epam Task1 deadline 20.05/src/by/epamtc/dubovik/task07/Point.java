/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 7.
 */

package by.epamtc.dubovik.task07;

public class Point {
	private double x;
	private double y;
	
	public Point(){
		x = 0;
		y = 0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean equals(Object point) {
		if(this == point) {
			return true;
		}
		if(point == null) {
			return false;
		}
		if(getClass() != point.getClass()) {
			return false;
		}
		Point p = (Point)point;
		if((this.x == p.x) && (this.y == p.y)) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = (int)(prime * x + y);
		
		return result;
	}
	
	public String toString() {
		return this.getClass().toString()+ "@" + x + ";" + y;
	}
}

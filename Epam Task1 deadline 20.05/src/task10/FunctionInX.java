/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 10.
 */

package task10;

import java.math.*;

public class FunctionInX {
	private double x;		//point at which the function is calculated
	private double value;	//value of the function at this point
	
	public FunctionInX() {
		x = 0;
		value = Math.tan(x);
	}
	
	public FunctionInX(double x) {
		this.x = x;
		value = Math.tan(x);
	}
	
	public void setX(double x) {
		this.x = x;
		value = Math.tan(x);
	}
	
	public double getX() {
		return x;
	}
	
	public double getValue() {
		return value;
	}
	
	public String toString() {
		return String.format("%1.7f	%2.7f", x, value);
	}

}

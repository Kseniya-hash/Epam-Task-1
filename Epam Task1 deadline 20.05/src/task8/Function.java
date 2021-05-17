/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 8.
 */

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 8.
 */

package task8;

import java.math.*;

public class Function {
	private static double function1(double x) {
		return - x * x + 3 * x + 9;
	}
	
	private static double function2(double x) {
		return 1 / (Math.pow(x, 3) - 6);
	}
	
	public static double function(double x) {
		return ( x >= 3) ? function1(x) : function2(x);
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 *  
 * Вычислить значение функции:
 * F(x) = -x^2 + 3x +9, x >= 3
 * F(x) = 1 / (x^3 - 6 ), x < 3
 */

package by.epamtc.dubovik.task08;

import java.math.*;

public class Function {
	private static double function1(double x) {
		int param1 = 3;		
		int param2 = 9;
		double result = - x * x + param1 * x + param2;
		
		return result;
	}
	
	private static double function2(double x) {
		int param1 = 3;		
		int param2 = 6;
		double result = 1 / (Math.pow(x, param1) - param2);
		
		return result;
	}
	
	public static double function(double x) {
		int condition = 3;
		double result = ( x >= condition) ? function1(x) : function2(x);
		
		return result;
	}
}

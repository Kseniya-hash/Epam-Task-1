/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 8.
 */

package by.epamtc.dubovik.task08;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double x;
		
		System.out.println("¬ведите х:");
		x = Reader.readDouble();
		System.out.println("«начение в этой точке: " + Function.function(x));
	}
}

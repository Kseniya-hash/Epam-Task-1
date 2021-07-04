/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 7.
 */

package by.epamtc.dubovik.task07;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		Point p1;
		Point p2;
		
		System.out.println("Введите точку:");
		p1 = Reader.readPoint();
		System.out.println("Введите точку:");
		p2 = Reader.readPoint();
		
		System.out.println("Точка" + PointLogic.findCloser(p1, p2).toString()
						  + " ближе к началу ккоординат.");
	}
}

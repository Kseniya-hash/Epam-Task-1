/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 5.
 */
package by.epamtc.dubovik.task05;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int n;
		
		System.out.println("Введите число:");
		n = Reader.readInt();
		try {
		System.out.println(PerfectNumber.isPerfect(n));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

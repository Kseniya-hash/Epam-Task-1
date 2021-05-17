/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 5.
 */
package task5;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int n;
		
		System.out.println("¬ведите число:");
		n = Reader.readInt();
		try {
		System.out.println(PerfectNumber.isPerfect(n));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}

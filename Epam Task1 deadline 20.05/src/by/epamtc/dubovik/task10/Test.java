/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 10.
 */

package by.epamtc.dubovik.task10;

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double start;
		double finish;
		double step;
		
		System.out.println("¬ведите начало интервала");
		start = Reader.readDouble();
		System.out.println("¬ведите конец интервала");
		finish = Reader.readDouble();
		System.out.println("¬ведите шаг функции");
		step = Reader.readDouble();
		FunctionArray array = new FunctionArray(start, finish, step);
		System.out.println("–езультат:");
		System.out.println(array.toString());
	}

}

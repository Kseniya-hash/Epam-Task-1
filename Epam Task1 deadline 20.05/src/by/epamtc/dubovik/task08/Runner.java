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

import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		double x;
		
		System.out.println("Введите х:");
		x = Reader.readDouble();
		System.out.println("Значение в точке х: " + Function.function(x));
	}
}

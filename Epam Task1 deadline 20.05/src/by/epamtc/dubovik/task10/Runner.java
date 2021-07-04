/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции.
 * F(x) = tg(x);
 */

package by.epamtc.dubovik.task10;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Reader;

public class Runner {
	
	public static void main(String args[]) {
		double start;
		double finish;
		double step;
		
		System.out.println("Введите начало отрезка");
		start = Reader.readDouble();
		System.out.println("Введите конец отрезка");
		finish = Reader.readDouble();
		System.out.println("Введите шаг функции");
		step = Reader.readDouble();
		try {
		double[][] array = FunctionArray.tanArray(start, finish, step);
		System.out.println("Таблица значений:");
		for(int i = 0; i < array[0].length; i++) {
				System.out.printf("%1.8f \t%2.8f\n", array[0][i], array[1][i]);
		}
		} catch  (InvalidValueException e){
			System.out.println("Введены неверные данные");
		}
	}

}

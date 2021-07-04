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

public class FunctionArray {
	
	public static double[][] tanArray(double start, double end, double step) throws InvalidValueException {
		if(end < start) {
			throw new InvalidValueException("Invalid border");
		}
		if(step <= 0) {
			throw new InvalidValueException("Invalid step");
		}
		
		double currentStep = start;
		int countRows = 2;
		int lengthOfArray = (int)((end - start) / step + 1);
		double[][] arrayOfValue = new double[countRows][];
		
		for (int i = 0; i < countRows; i++) {
			arrayOfValue[i] = new double[lengthOfArray];
		}
		
		for (int i = 0; i < lengthOfArray; i++) {
			arrayOfValue[0][i] = currentStep;
			arrayOfValue[1][i] = Math.tan(currentStep);
			currentStep += step;
		}
		
		return arrayOfValue;
	}
}

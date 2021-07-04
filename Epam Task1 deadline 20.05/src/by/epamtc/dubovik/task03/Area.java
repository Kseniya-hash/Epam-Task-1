/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 */

package by.epamtc.dubovik.task03;

import java.math.*;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.for_all_tasks.Validation;

public class Area {
	
	public static double calculateSideOfSquare(double area) throws InvalidValueException {
		if (Validation.isNegative(area)) {
			throw new InvalidValueException("Invalid value for area. Can not be below zero");
		}
		
		double side;
		side = Math.sqrt(area);
		return side;
	}
	
	public static double calculateAreafromDiagonal(double diagonal) throws InvalidValueException {
		if (Validation.isNegative(diagonal)) {
			throw new InvalidValueException("Invalid value for diagonal. Can not be below zero");
		}
		
		final double RATIO = 1 / Math.sqrt(2);		// Side to diagonal ratio
		double side = diagonal * RATIO;
		double area;
		
		area = Math.pow(side, 2);
		return area;
	}
	
	public static double calculateRatio(double area1, double area2) throws InvalidValueException {
		if (Validation.isNegative(area1) || Validation.isNegative(area2)) {
			throw new InvalidValueException("Invalid value for area. Can not be below zero");
		}
		if(area2 == 0) {
			throw new InvalidValueException("Invalid value for area. Can not be zero");
		}
		
		double ratio = area1/area2;
		return ratio;
	}

}

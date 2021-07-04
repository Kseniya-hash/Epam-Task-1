package by.epamtc.dubovik.task03;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.task03.Area;

public class TestArea {
	private static final double DELTA = 0.000001;
	
	@Test
	public void calculateSideOfSquareTestPositive() throws InvalidValueException {
		double area = 9;
		double expected = 3;
		double actual = Area.calculateSideOfSquare(area);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void calculateSideOfSquareTestZero() throws InvalidValueException {
		double area = 0;
		double expected = 0;
		double actual = Area.calculateSideOfSquare(area);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateSideOfSquareTestNegative() throws InvalidValueException {
		double area = -3;
		double actual = Area.calculateSideOfSquare(area);
	}
	
	
	@Test
	public void calculateAreafromDiagonalTestPositive() throws InvalidValueException {
		double diagonal = 9;
		double expected = 40.5;
		double actual = Area.calculateAreafromDiagonal(diagonal);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void calculateAreafromDiagonalTestZero() throws InvalidValueException {
		double diagonal = 0;
		double expected = 0;
		double actual = Area.calculateAreafromDiagonal(diagonal);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateAreafromDiagonalTestNegative() throws InvalidValueException {
		double diagonal = -4;
		double actual = Area.calculateAreafromDiagonal(diagonal);
	}
	
	@Test
	public void calculateRatioTestPositive() throws InvalidValueException {
		double area1 = 9;
		double area2 = 18;
		double expected = 0.5;
		double actual = Area.calculateRatio(area1, area2);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void calculateRatioTestFirstAreaZero() throws InvalidValueException {
		double area1 = 0;
		double area2 = 18;
		double expected = 0;
		double actual = Area.calculateRatio(area1, area2);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateRatioTestSecondAreaZero() throws InvalidValueException {
		double area1 = 12;
		double area2 = 0;
		double actual = Area.calculateRatio(area1, area2);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateRatioTestFirstAreaNegative() throws InvalidValueException {
		double area1 = -12;
		double area2 = 3;
		double actual = Area.calculateRatio(area1, area2);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateRatioTestSecondAreaNegative() throws InvalidValueException {
		double area1 = 12;
		double area2 = -3;
		double actual = Area.calculateRatio(area1, area2);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateRatioTestBothAreasNegative() throws InvalidValueException {
		double area1 = -12;
		double area2 = -3;
		double actual = Area.calculateRatio(area1, area2);
	}

}

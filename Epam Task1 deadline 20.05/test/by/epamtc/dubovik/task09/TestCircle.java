package by.epamtc.dubovik.task09;

import org.junit.*;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.task09.Circle;

public class TestCircle {
	private static final double DELTA = 0.000001;
	
	@Test
	public void calculateAreaTestPositive() throws InvalidValueException {
		double radius = 3;
		double expected = 28.27433339;
		double actual = Circle.calculateArea(radius);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void calculateAreaTestZero() throws InvalidValueException {
		double radius = 0;
		double expected = 0;
		double actual = Circle.calculateArea(radius);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateAreaTestNegative() throws InvalidValueException {
		double radius = -1;
		double actual = Circle.calculateArea(radius);
	}

	@Test
	public void calculateCircumferenceTestPositive() throws InvalidValueException {
		double radius = 4;
		double actual = Circle.calculateCircumference(radius);
	}
	
	@Test
	public void calculateCircumferenceTestZero() throws InvalidValueException {
		double radius = 0;
		double expected = 0;
		double actual = Circle.calculateCircumference(radius);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateCircumferenceTestNegative() throws InvalidValueException {
		double radius = -2;
		double actual = Circle.calculateCircumference(radius);
	}
}

package by.epamtc.dubovik.task08;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.task08.Function;

public class TestFunction {
	private static final double DELTA = 0.000001;
	
	@Test
	public void functionTestAboveCondition() {
		double x = 4;
		double expected = 5;
		double actual = Function.function(x);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void functionTestEqualCondition() {
		double x = 3;
		double expected = 9;
		double actual = Function.function(x);
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void functionTestBellowCondition() {
		double x = 2;
		double expected = 0.5;
		double actual = Function.function(x);
		Assert.assertEquals(expected, actual, DELTA);
	}
}

package by.epamtc.dubovik.for_all_tasks;
 
import org.junit.*;

import by.epamtc.dubovik.for_all_tasks.Validation;

public class TestValidation {
	
	@Test
	public void isNegativeTestPositive() {
		double number = 5;
		boolean expected = false;
		boolean actual = Validation.isNegative(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isNegativeTestZero() {
		double number = 0;
		boolean expected = false;
		boolean actual = Validation.isNegative(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isNegativeTestNegative() {
		double number = -5;
		boolean expected = true;
		boolean actual = Validation.isNegative(number);
		Assert.assertEquals(expected, actual);
	}
}

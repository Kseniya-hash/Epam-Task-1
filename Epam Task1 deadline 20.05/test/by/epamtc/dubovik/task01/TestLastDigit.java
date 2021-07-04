package by.epamtc.dubovik.task01;

import org.junit.Test;
import org.junit.Assert;
import by.epamtc.dubovik.task01.LastDigit;

public class TestLastDigit {
	
	@Test
	public void calculateLastDigitOfSquareTestPositive() {
		int number = 47;
		int expected = 9;
		int actual = LastDigit.calculateLastDigitOfSquare(number);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateLastDigitOfSquareTestNegative() {
		int number = -4;
		int expected = 6;
		int actual = LastDigit.calculateLastDigitOfSquare(number);
		Assert.assertEquals(expected, actual);
	}
}

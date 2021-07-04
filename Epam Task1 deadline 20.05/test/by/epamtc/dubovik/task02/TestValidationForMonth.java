package by.epamtc.dubovik.task02;

import org.junit.Test;
import org.junit.Assert;
import by.epamtc.dubovik.task02.TestYearMonth;;

public class TestValidationForMonth {
	
	@Test
	public void isMonthTestMonthInBorder() {
		int month = 5;
		boolean expected = true;
		boolean actual = ValidationForMonth.isMonth(month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isMonthTestBellowBorder() {
		int month = 0;
		boolean expected = false;
		boolean actual = ValidationForMonth.isMonth(month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isMonthTestAboveBorder() {
		int month = 13;
		boolean expected = false;
		boolean actual = ValidationForMonth.isMonth(month);
		Assert.assertEquals(expected, actual);
	}
}

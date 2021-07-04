package by.epamtc.dubovik.task02;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.task02.YearMonth;

public class TestYearMonth {
	
	@Test
	public void isLeapYearTestNotLeap() throws InvalidValueException {
		int year = 2021;
		boolean expected = false;
		boolean actual = YearMonth.isLeapYear(year);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYearTestLeap() throws InvalidValueException {
		int year = 2020;
		boolean expected = true;
		boolean actual = YearMonth.isLeapYear(year);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYearTest100Year() throws InvalidValueException {
		int year = 1900;
		boolean expected = false;
		boolean actual = YearMonth.isLeapYear(year);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYearTest400Year() throws InvalidValueException {
		int year = 2000;
		boolean expected = true;
		boolean actual = YearMonth.isLeapYear(year);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYearTestZeroYear() throws InvalidValueException {
		int year = 0;
		boolean expected = true;
		boolean actual = YearMonth.isLeapYear(year);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidValueException.class)
	public void isLeapYearTestNegativeYear() throws InvalidValueException {
		int year = -2000;
		boolean actual = YearMonth.isLeapYear(year);
	}
	
	@Test
	public void calculateDaysInMonthTest31Days() throws InvalidValueException {
		int year = 2020;
		int month = 3;
		int expected = 31;
		int actual = YearMonth.calculateDaysInMonth(year, month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateDaysInMonthTest30Days() throws InvalidValueException {
		int year = 2020;
		int month = 6;
		int expected = 30;
		int actual = YearMonth.calculateDaysInMonth(year, month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateDaysInMonthTestFebraryNotLeap() throws InvalidValueException {
		int year = 2021;
		int month = 2;
		int expected = 28;
		int actual = YearMonth.calculateDaysInMonth(year, month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateDaysInMonthTestFebraryLeap() throws InvalidValueException {
		int year = 2020;
		int month = 2;
		int expected = 29;
		int actual = YearMonth.calculateDaysInMonth(year, month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateDaysInMonthTestZeroYear() throws InvalidValueException {
		int year = 0;
		int month = 5;
		int expected = 31;
		int actual = YearMonth.calculateDaysInMonth(year, month);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateDaysInMonthTestNegativeYear() throws InvalidValueException {
		int year = -6;
		int month = 2;
		int actual = YearMonth.calculateDaysInMonth(year, month);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateDaysInMonthTestNegativeMonth() throws InvalidValueException {
		int year = 2020;
		int month = -2;
		int actual = YearMonth.calculateDaysInMonth(year, month);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateDaysInMonthTestMonthAbove() throws InvalidValueException {
		int year = 2020;
		int month = 13;
		int actual = YearMonth.calculateDaysInMonth(year, month);
	}
}

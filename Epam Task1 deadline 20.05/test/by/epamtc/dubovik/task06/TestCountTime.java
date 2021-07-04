package by.epamtc.dubovik.task06;

import org.junit.*;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.task06.CountTime;;

public class TestCountTime {
	
	@Test
	public void calculateHoursTestMoreThanHour() throws InvalidValueException {
		int seconds = 4000;
		int expected = 1;
		int actual = CountTime.calculateHours(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateHoursTestLessThanHour() throws InvalidValueException {
		int seconds = 2000;
		int expected = 0;
		int actual = CountTime.calculateHours(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateHoursTestZeroSeconds() throws InvalidValueException {
		int seconds = 0;
		int expected = 0;
		int actual = CountTime.calculateHours(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateHoursTestNegativeSeconds() throws InvalidValueException {
		int seconds = -10;
		int actual = CountTime.calculateHours(seconds);
	}
	
	@Test
	public void calculateMinutesTestMoreThanHour() throws InvalidValueException {
		int seconds = 4000;
		int expected = 6;
		int actual = CountTime.calculateMinutes(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateMinutesTestMoreThanMinuteLessThanHour() throws InvalidValueException {
		int seconds = 2000;
		int expected = 33;
		int actual = CountTime.calculateMinutes(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateMinutesTestLessThanMinute() throws InvalidValueException {
		int seconds = 50;
		int expected = 0;
		int actual = CountTime.calculateMinutes(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateMinutesTestZero() throws InvalidValueException {
		int seconds = 0;
		int expected = 0;
		int actual = CountTime.calculateMinutes(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateMinutesTestNegativeSeconds() throws InvalidValueException {
		int seconds = -5;
		int actual = CountTime.calculateMinutes(seconds);
	}
	
	@Test
	public void calculateSecondsTestMoreThanMinute() throws InvalidValueException {
		int seconds = 65;
		int expected = 5;
		int actual = CountTime.calculateSeconds(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateSecondsTestLessThanMinute() throws InvalidValueException {
		int seconds = 20;
		int expected = 20;
		int actual = CountTime.calculateSeconds(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateSecondsTestZero() throws InvalidValueException {
		int seconds = 0;
		int expected = 0;
		int actual = CountTime.calculateSeconds(seconds);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidValueException.class)
	public void calculateSecondsTestNegativeSeconds() throws InvalidValueException {
		int seconds = -4;
		int actual = CountTime.calculateSeconds(seconds);
	}
}

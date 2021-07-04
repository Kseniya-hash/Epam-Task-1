package by.epamtc.dubovik.task05;

import by.epamtc.dubovik.task05.PerfectNumber;
import org.junit.*;

public class TestPerfectNumber {
	
	@Test
	public void isPerfectTestPerfect(){
		int number = 6;
		boolean expected = true;
		boolean actual = PerfectNumber.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectTestNotPerfect(){
		int number = 5;
		boolean expected = false;
		boolean actual = PerfectNumber.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectTestZero(){
		int number = 0;
		boolean expected = false;
		boolean actual = PerfectNumber.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectTestNegative(){
		int number = -6;
		boolean expected = false;
		boolean actual = PerfectNumber.isPerfect(number);
		
		Assert.assertEquals(expected, actual);
	}

}

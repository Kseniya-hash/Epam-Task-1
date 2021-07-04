package by.epamtc.dubovik.task04;

import org.junit.*;
import by.epamtc.dubovik.task04.EvenNumbers;

public class TestEvenNumbers {
	
	@Test
	public void containsNEvenTestPositive() {
		int[] array = {1, 3, 4, 5, 6};
		int numberOfEven = 2;
		boolean expected = true;
		boolean actual = EvenNumbers.containsNEven(array, numberOfEven);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void containsNEvenTestHasNegative() {
		int[] array = {1, -8, 3, 4, 5, 6};
		int numberOfEven = 2;
		boolean expected = true;
		boolean actual = EvenNumbers.containsNEven(array, numberOfEven);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void containsNEvenTestNotEnoughEven() {
		int[] array = {1, -8, 3, 4, 5, 6};
		int numberOfEven = 5;
		boolean expected = false;
		boolean actual = EvenNumbers.containsNEven(array, numberOfEven);
		Assert.assertEquals(expected, actual);
	}
	
	public void containsNEvenTestEmptyArray() {
		int[] array = {};
		int numberOfEven = 1;
		boolean expected = false;
		boolean actual = EvenNumbers.containsNEven(array, numberOfEven);
		Assert.assertEquals(expected, actual);
	}
	
	public void containsNEvenTestEmptyArrayZeroEven() {
		int[] array = {};
		int numberOfEven = 0;
		boolean expected = true;
		boolean actual = EvenNumbers.containsNEven(array, numberOfEven);
		Assert.assertEquals(expected, actual);
	}
	
	public void containsNEvenTestNullArray() {
		int[] array = null;
		int numberOfEven = 1;
		boolean expected = false;
		boolean actual = EvenNumbers.containsNEven(array, numberOfEven);
		Assert.assertEquals(expected, actual);
	}

}

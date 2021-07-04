package by.epamtc.dubovik.task10;

import org.junit.*;

import by.epamtc.dubovik.for_all_tasks.InvalidValueException;
import by.epamtc.dubovik.task10.FunctionArray;;

public class TestFunctionArray {
	private static final double DELTA = 0.000001;
	
	@Test
	public void tanArrayTestPositive() throws InvalidValueException {
		double start = 0;
		double end = 5;
		double step = 2.5;
		double[][] expected = {{0, 2.5, 5},{0, -0.747022, - 3.380515}};
		double[][] actual = FunctionArray.tanArray(start, end, step);
		assertEqualsDoubleArrayOfArrays(expected, actual);
	}
	
	@Test
	public void tanArrayTestHasNegative() throws InvalidValueException {
		double start = -2.5;
		double end = 0.5;
		double step = 1;
		double[][] expected = {{-2.5, -1.5, -0.5, 0.5},{0.747022, -14.101419, -0.546302, 0.546302}};
		double[][] actual = FunctionArray.tanArray(start, end, step);
		assertEqualsDoubleArrayOfArrays(expected, actual);
	}
	
	@Test
	public void tanArrayTestStepDontEndAtBorder() throws InvalidValueException {
		double start = -2.5;
		double end = 0.1;
		double step = 1;
		double[][] expected = {{-2.5, -1.5, -0.5},{0.747022, -14.101419, -0.546302}};
		double[][] actual = FunctionArray.tanArray(start, end, step);
		assertEqualsDoubleArrayOfArrays(expected, actual);
	}
	
	@Test
	public void tanArrayTestStartEqualsEnd() throws InvalidValueException {
		double start = 1;
		double end = 1;
		double step = 1;
		double[][] expected = {{1},{1.557407}};
		double[][] actual = FunctionArray.tanArray(start, end, step);
		assertEqualsDoubleArrayOfArrays(expected, actual);
	}
	
	@Test(expected = InvalidValueException.class)
	public void tanArrayTestZeroStep() throws InvalidValueException {
		double start = 1;
		double end = 2;
		double step = 0;
		double[][] actual = FunctionArray.tanArray(start, end, step);
	}
	
	@Test(expected = InvalidValueException.class)
	public void tanArrayTestEndBeforStart() throws InvalidValueException {
		double start = 1;
		double end = -3;
		double step = 1;
		double[][] actual = FunctionArray.tanArray(start, end, step);
	}
	
	private void assertEqualsDoubleArrayOfArrays(double[][] expected, double[][] actual) {
		Assert.assertEquals(expected.length, actual.length);
		for(int i = 0; i < expected.length; i ++) {
			Assert.assertArrayEquals(expected[i], actual[i], DELTA);
		}
	}

}

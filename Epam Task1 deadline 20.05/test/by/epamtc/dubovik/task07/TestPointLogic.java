package by.epamtc.dubovik.task07;

import org.junit.*;

import by.epamtc.dubovik.task07.PointLogic;

public class TestPointLogic {

	@Test
	public void findCloserTestPositive(){
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 2);
		Point expected = p1;
		Point actual = PointLogic.findCloser(p1, p2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findCloserTestNegative(){
		Point p1 = new Point(-1, 1);
		Point p2 = new Point(1, 2);
		Point expected = p1;
		Point actual = PointLogic.findCloser(p1, p2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findCloserTestEqualDistance(){
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, -1);
		Point expected = p1;
		Point actual = PointLogic.findCloser(p1, p2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findCloserTestFirstNullPoint(){
		Point p1 = null;
		Point p2 = new Point(1, -1);
		Point expected = p2;
		Point actual = PointLogic.findCloser(p1, p2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findCloserTestSecondNullPoint(){
		Point p1 = new Point(1, -1);
		Point p2 = null;
		Point expected = p1;
		Point actual = PointLogic.findCloser(p1, p2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findCloserTestBothNullPoint(){
		Point p1 = null;
		Point p2 = null;
		Point actual = PointLogic.findCloser(p1, p2);
		Assert.assertNull(actual);
	}
}

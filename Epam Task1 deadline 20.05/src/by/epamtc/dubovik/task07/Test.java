/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 7.
 */

package by.epamtc.dubovik.task07;

public class Test {
	
	public static void main(String args[]) {
		Point p1;		//first point
		Point p2;		//second point
		
		System.out.println("������� �����:");
		p1 = PointLogic.readPoint();
		System.out.println("������� �����:");
		p2 = PointLogic.readPoint();
		
		System.out.println("����� " + PointLogic.closerToOrigin(p1, p2).toString() + " ����� � ������ ���������.");
	}
}

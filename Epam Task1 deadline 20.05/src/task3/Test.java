/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 3.
 */

package task3;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		double area;			//area of the square
		double diameter;		//diameter of the circle inscribed in a square
		double smallerArea;		//area of the square inscribed in a circle
	
		System.out.println("������� ������� ��������:");
		area = Reader.readDouble();
		diameter = Area.getSideOfSquare(area);
		smallerArea = Area.getAreafromDiagonal(diameter);
		System.out.println("������� �����, ���������� � �������:" + diameter + "\n"
						  + "������� ��������, ���������� � ���������� " + smallerArea + "\n"
						  + "������� ���������� �������� ������ ������� ��������� � "
						  + Area.getRatio(area, smallerArea ) + " ����");
	}
}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 7.
 */

package task7;

public class Test {
	
	public static void main(String args[]) {
		Point p1;		//first point
		Point p2;		//second point
		int compare;	//result of comparison
		
		System.out.println("Введите точку:");
		p1 = PointReader.readPoint();
		System.out.println("Введите точку:");
		p2 = PointReader.readPoint();
		compare = PointComparison.compareTo(p1, p2);
		
		if (compare == 0) {
			System.out.println("Точки равноудалены от начала координат");
		} else if (compare < 0) {
			System.out.println("Точка " + p1.toString() + " ближе к началу координат.");
		} else {
			System.out.println("Точка " + p2.toString() + " ближе к началу координат.");
		}
	}
}

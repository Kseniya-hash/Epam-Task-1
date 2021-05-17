/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * The solution for task 7.
 */

package task7;

import for_all_tasks.Reader;

/**
 * Class for reading point from console
 * @author Ксения
 *
 */
public class PointReader {
	
	/** read point from console*/
	public static Point readPoint() {
		Point p = new  Point();
		
		p.setX(Reader.readDouble());
		p.setY(Reader.readDouble());
		return p;
	}

}

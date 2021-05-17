package for_all_tasks;

import java.util.Scanner;

/**
 * Contains methods for reading from console
 * @author Ксения
 *
 */
public class Reader {
	
	/** read integer number from console*/
	static public int readInt() {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextInt()) {
			in.next();
		}
		return in.nextInt();
	}
	
	/**
	 * @param length - length of array
	 * @return read array of integer numbers from console
	 */
	static public int[] readArray(int length) {
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = readInt();
		}
		return array;
	}
	
	/** read double number from console*/
	static public double readDouble() {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextDouble()) {
			in.next();
		}
		return in.nextDouble();
	}

}

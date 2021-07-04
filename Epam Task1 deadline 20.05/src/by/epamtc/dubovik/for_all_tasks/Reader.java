package by.epamtc.dubovik.for_all_tasks;

import java.util.Scanner;

import by.epamtc.dubovik.task07.Point;

public class Reader {
	
	static public int readInt() {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextInt()) {
			in.next();
		}
		return in.nextInt();
	}
	
	static public int[] readArray(int length) {
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = readInt();
		}
		return array;
	}
	
	static public double readDouble() {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextDouble()) {
			in.next();
		}
		return in.nextDouble();
	}
	
	public static Point readPoint() {
		Point p;
		
		double x = Reader.readDouble();
		double y = Reader.readDouble();
		
		p = new Point(x,y);
		return p;
	}

}

/*
 * Kseniya Dubovik
 * 
 * 16.05.2021
 * 
 * Testing the solution for task 1.
 */
package task1;

import for_all_tasks.Reader;

public class Test {
	
	public static void main(String args[]) {
		int n;
		
		System.out.println("������� ����� �����");
		n = Reader.readInt();
		int lastDigitOfN = LastDigit.getLastDigit(n);
		System.out.println("��������� ����� ��������: "
						   + LastDigit.getLastDigitOfsquare(lastDigitOfN));
	}

}

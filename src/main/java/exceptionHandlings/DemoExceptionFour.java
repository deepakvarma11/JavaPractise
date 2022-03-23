package exceptionHandlings;

import java.util.Scanner;

public class DemoExceptionFour {
	
	/*
	 * Throw keyword is used to throwing our own exceptions
	 */

	public static void main(String[] args) {
		int i = 4, j = 0, k = 0;

		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the number:");
			j = s.nextInt();
			k = i + j;
			if (k < 10) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException e) {
			System.out.println("The output should be greater than 10");
		} finally {
			s.close();
		}

	}
}

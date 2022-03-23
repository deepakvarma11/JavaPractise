package exceptionHandlings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoExceptionThree {
	
	/*
	 * This throws keyword will only suppress the errors and it will not handle the errors
	 * for handling we need use try catch only
	 */

	public static void main(String[] args) throws NumberFormatException, IOException, ArithmeticException {

		int i = 8, j = 1, k = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value");

		j = Integer.parseInt(br.readLine());
		k = i / j;
		System.out.println(k);
		System.out.println("ABV");
	}

}

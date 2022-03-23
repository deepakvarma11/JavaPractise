package exceptionHandlings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException {
	
	/*
	 * We can have multiple Catch blocks for different exception type, and it will catch the specific exceptions when occured
	 */

	public static void main(String[] args) {

		int i = 8, j = 1, k = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the value");
		
		try {
			j = Integer.parseInt(br.readLine());  // Checked exception
			
			k = i / j;   // Unchecked exception 
			System.out.println(k);
			
			int[] a = new int[3];
//			System.out.println(a[8]);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic excp");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
			
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Completed");
		}
	}

}

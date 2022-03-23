package exceptionHandlings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoExceptionTwo {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * Try with resource, whenever we use scanner or anyother like bufferreaders, we need
		 * to close it that means we need to close the resource
		 * For that, we can do it like this below
		 */
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String str = br.readLine();
			System.out.println(str);
		}  // When we using try catch and finally just for closing the resource then we dont need to give catch/finally
			// it will be taken care
	}

}

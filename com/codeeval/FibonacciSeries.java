package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FibonacciSeries {

	private static BufferedReader in;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
		in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			
			int n = Integer.parseInt(line);
			System.out.println(fibonacci(n));

		}
    
	}
	
	public static int fibonacci (int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
		
	}
}
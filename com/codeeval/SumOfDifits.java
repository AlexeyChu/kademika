package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SumOfDifits {
	
	private static BufferedReader in;

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
	    in = new BufferedReader(new FileReader(file));
	    
	    String line;	    
	    while ((line = in.readLine()) != null) {
	    	char[] array = line.toCharArray();
	    	int sum = 0;
	    	for (char c : array) {
	    		sum += Character.digit(c, 10);
	    	}
	    	System.out.println(sum);
	    }
	}

}

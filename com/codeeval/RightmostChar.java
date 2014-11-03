package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightmostChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    String subLine;
	    while ((line = in.readLine()) != null) {
	    	char character = line.charAt(line.length() - 1);
	    	subLine = line.substring(0, line.length() - 2);
	    	System.out.println(subLine.lastIndexOf(character));
	    }
	    in.close();
	   
	}

}

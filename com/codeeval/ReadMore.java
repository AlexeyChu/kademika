package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class ReadMore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    
	    while ((line = in.readLine()) != null) {
	    	if (line.length() <= 55)
	    		System.out.println(line);
	    	else if (line.length() > 55) {
	    		String subLine = line.substring(0, 37).trim() + "... <Read More>";
	    		System.out.println(subLine);
	    		
	    	}
	    }
	    in.close();
	}

}

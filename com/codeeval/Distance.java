package com.codeeval;

import java.io.*;
import java.util.*;

public class Distance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    double x1 = 0,
	    	x2 = 0,
	    	y1 = 0,
	    	y2 = 0,
	    	distance = 0;
	  	
	
	    while ((line = in.readLine()) != null) {
	     
	    		if (line.isEmpty()) continue;
	    	    line = line.replaceAll("[^0-9|-]+", " ");
	    		String[] numArray = line.trim().split(" ");
	    		x1 = Double.parseDouble(numArray[0]);
	    		x2 = Double.parseDouble(numArray[2]);
	    		y1 = Double.parseDouble(numArray[1]);
	    		y2 = Double.parseDouble(numArray[3]);
	    		distance = Math.hypot(x2 - x1, y2 - y1);
	    		System.out.println((int)distance); 
	   	}
    }

}



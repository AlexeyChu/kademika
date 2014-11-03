package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class SetIntersection {
	
	private static BufferedReader in;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
	    in = new BufferedReader(new FileReader(file));
	    
	    String line, strHour, strMinute, strSec;
	    String subLine1;
	    
	    while ((line = in.readLine()) != null) {
	    	
	    	String[] strArray = line.trim().split(";");
	    
	    	String[] numArr1 = strArray[0].trim().split(",");
	    	String[] numArr2 = strArray[1].trim().split(",");
	    
	    	int n = 0;
	    	for (String s : numArr1) {
	    		for (String t : numArr2) {
	    			if (s.equals(t)) {
	    				if (n > 0)
	    					System.out.print(",");
	    				n++;
	    				System.out.print(s);
	    			}
	    				
	    			
	    		}
	    	}
	    	System.out.println();
	    }
	    	
	}

}

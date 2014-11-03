package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RemoveCharacters {
	
	private static BufferedReader in;

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/1.txt");
		in = new BufferedReader(new FileReader(file));
		String line; 
		StringBuffer result;
		String[] splitLine;
				
		while ((line = in.readLine()) != null) {
			splitLine = line.split(", ");
			//System.out.println(Arrays.toString(splitLine));
			result = new StringBuffer(splitLine[0]);				
							
			for (int j = 0; j < splitLine[1].length(); j++) {
				for (int i = 0; i < result.length(); i++) {
					
					if (result.charAt(i) == splitLine[1].charAt(j)) {
						result.deleteCharAt(i);
						i--;
						//System.out.println(result);
					}
					
				}
				
			}
			
			System.out.println(result);
		}
			
			
	}

}

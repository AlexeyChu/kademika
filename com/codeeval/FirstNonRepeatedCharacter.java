package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FirstNonRepeatedCharacter {
	private static BufferedReader in;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
		in = new BufferedReader(new FileReader(file));
		String line;
		int n = 0;
		
label:	while ((line = in.readLine()) != null) {
			
			for (int i = 0; i < line.length(); i++) {
				boolean b = false;
				for (int j = 0; j < line.length(); j++) {
					if (i == j) continue;
					if (line.charAt(i) == line.charAt(j)) {
						b = true;
					}
				}
				if (!b) {
					System.out.println(line.charAt(i));
					continue label;
				}
			}
			
		}
			
	}

}

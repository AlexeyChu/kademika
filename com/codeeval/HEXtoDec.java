package com.codeeval;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;;

public class HEXtoDec {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//try {
		ArrayList <String> hexNumbers = new ArrayList<String>();
		Scanner diskScanner = new Scanner(new File("E:/1.txt"));
		char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		
		while (diskScanner.hasNext()) {
			hexNumbers.add(diskScanner.nextLine());
		}
		
			
		for (String hex : hexNumbers) {
			char[] charArray = hex.toCharArray();
			int sum = 0;
			int capacity = 0;
			for (int i = 0; i < charArray.length; i++) {
				for (int j = 0; j < hexArray.length; j++) {
					if (charArray[i] == hexArray[j]) {
						
						sum += j * Math.pow(16, charArray.length - capacity - 1);
						capacity++;
					}
					
				}
			}
			System.out.println(sum);
		}
	/*	}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
	}
	
}

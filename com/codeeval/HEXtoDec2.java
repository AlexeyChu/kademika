package com.codeeval;
import java.io.*;

public class HEXtoDec2 {
    public static void main (String[] args) throws IOException{
    char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
 //   args[0] = "E:/1.txt";
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("\n");
        if (lineArray.length > 0) {
        	char[] charArray = line.toCharArray();
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
    }
  }
}

package com.codeeval;
import java.io.*;
public class SumOfIntegers {


    public static void main (String[] args) throws IOException {
    
    File file = new File("C:/1.txt");
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    int sum = 0;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("\n");
        if (lineArray.length > 0) {
            //Process line of input Here
            sum += Integer.parseInt(line);
        }
    }
    System.out.println(sum);
  }
}



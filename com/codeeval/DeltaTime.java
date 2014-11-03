package com.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeltaTime {

	private static BufferedReader in;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:/1.txt");
	    in = new BufferedReader(new FileReader(file));
	    
	    String line, strHour, strMinute, strSec;
	    String subLine1;
	    String subLine2;
	    while ((line = in.readLine()) != null) {
	    	subLine1 = line.substring(0, line.indexOf(' '));
	    	subLine2 = line.substring(line.indexOf(' ') + 1, line.length());
	    	SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	    	Date date1 = format.parse(subLine1);
	    	Date date2 = format.parse(subLine2);
	    	//System.out.println("Date1: " + date1.compareTo(date2));
	    	long ms1 = date1.getTime();
	    	long ms2 = date2.getTime();
	    	long msDelta = Math.abs(ms2 - ms1);
	    	long hour =(long) Math.floor((double)msDelta/ 3600000);
	    	long minute = (msDelta % 3600000)/60000;
	    	long sec = ((msDelta % 3600000) % 60000)/ 1000;
	    	if (hour < 10)
	    		strHour = "0" + hour;
	    	else
	    		strHour = "" + hour;
	    	if (minute < 10)
	    		strMinute = "0" + minute;
	    	else
	    		strMinute = "" + minute;
	    	if (sec < 10)
	    		strSec = "0" + sec;
	    	else
	    		strSec = "" + sec;
	    	System.out.println(strHour + ":" + strMinute + ":" + strSec);
	    	
	    	
	    }
	}

}

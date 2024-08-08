package com.crm.JavaUtility;

import java.time.LocalDate;
import java.util.Random;

public class JavaUtil {

	public static int generateRandomNumber(int limit)
	{
		Random r = new Random();
		return r.nextInt(limit);
	}
	public static String getCurrentdate() { 
		LocalDate date = LocalDate.now();
		return date.toString(); 
	}
	public static String getDesireddate() { 
		LocalDate date = LocalDate.now();
		return date.plusDays(25).toString();
		
	}
}

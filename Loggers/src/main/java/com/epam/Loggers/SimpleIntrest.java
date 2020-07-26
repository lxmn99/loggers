package com.epam.Loggers;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class SimpleIntrest 
{
 static Logger log=Logger.getLogger("anything");
			public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double amount,time,rate,si,ci;
		//PrintStream t = new PrintStream(new FileOutputStream(FileDescriptor.out));
		log.info("Enter the amount:\n");
		amount = sc.nextDouble();
		log.info("Enter Number of Years:\n");
		time = sc.nextDouble();
		log.info("Enter the Rate of intrest:\n");
		rate = sc.nextDouble();
		si = (amount * time * rate)/100;
		ci = amount * Math.pow(1.0+rate/100,time);
		log.info("Simple Intrest:\n"+si);
		log.info("\n");
		log.info("Compound Intrest:\n"+ci);
	}
	
	
	
}
package com.epam.Loggers;
import java.io.*;
import java.util.*;
import java.util.logging.Logger;
public class Construction 
{
	static Logger log=Logger.getLogger("anything");
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		log.info("Options:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material with Fully Automated Home\n");
		log.info("Choose one of the above option:\n");
		int material = sc.nextInt(),area;
		switch(material)
		{
			case 1:
				log.info("Enter the total area of house you want:\n");
				area = sc.nextInt();
				log.info("Cost of the house is:\n"+area*1200+"INR");
				break;

			case 2:
				log.info("Enter the total area of house you want:\n");
				area = sc.nextInt();
				log.info("Cost of the house is:\n"+area*1500+"INR");
				break;
				
			case 3:
				log.info("Enter the total area of house you want:\n");
				area = sc.nextInt();
				log.info("Cost of the house is:\n"+area*1800+"INR");
				break;
			
			case 4:
				log.info("Enter the total area of house you want:\n");
				area = sc.nextInt();
				log.info("Cost of the house is:\n"+area*2500+"INR");
				break;
				
			default:
				log.info("Select a valid option");
				
		}
		
	}
}
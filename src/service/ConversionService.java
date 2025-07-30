package service;

import java.util.Scanner;

import user.MytelUser;

public class ConversionService
{
	String MobileNumber;
	Scanner scan = new Scanner(System.in);
	public static void showConversionSummary(MytelUser user) {
	    System.out.println("--- SIM Conversion Summary ---");
	    System.out.println("Username: " + user.getUsername());
	    System.out.println("Mobile No: " + user.getUserMobileno());
	    System.out.println("New SIM Type: " + user.getUserSIMtype());
	    System.out.println("Delivery Address: " + user.getUserAddress());
	    System.out.println("------------------------------");
	}
	
	public void  prepaidToPostpaid(MytelUser myteluser)
	{
		if(myteluser.getUserSIMtype().equalsIgnoreCase("prepaid"))
		{
			myteluser.setUserSIMtype("postpaid");
			System.out.println("Congrats!!your request is received. You new SIM will be delivered within 2 days to your address ");
		}
		else
		{
				System.out.println("This Mobile number is already Postpaid.....");
		}
		showConversionSummary(myteluser);
	}
	
	public void postpaidToPrepaid(MytelUser myteluser) 
	{
		if(myteluser.getUserSIMtype().equalsIgnoreCase("postpaid"))
		{
			myteluser.setUserSIMtype("prepaid");
			System.out.println("Congrats!!your request is received. You new SIM will be delivered within 2 days to your address ");
		}
		else
		{
				System.out.println("This Mobile number is already Prepaid.....");
		}
		showConversionSummary(myteluser);
	}
	
	public void conversionService(MytelUser myteluser)
	{
		
			System.out.println("a. Prepaid to Postpaid");
			System.out.println("b. Postpaid to Prepaid");
			
			System.out.println("choose the service you want..(a or b)?");
			char option = scan.nextLine().charAt(0);
			switch(option)
			{
			case 'a':
				prepaidToPostpaid(myteluser);
				break;
			case 'b':
				postpaidToPrepaid(myteluser);
				break;
			default:
				System.out.println("Invalid service Please select the available services.....");
				break;
			}
		}
}

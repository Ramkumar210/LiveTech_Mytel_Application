package service;

import java.util.Scanner;

import user.MytelUser;

public class BalanceService
{
	Scanner scan = new Scanner(System.in);
	
	public void balanceService(MytelUser mytelUser)
	{
		
			if(mytelUser.getUserSIMtype().equalsIgnoreCase("prepaid"))
			{
				System.out.println("....Balance...");
				System.out.println("SMS : "+mytelUser.getSms());
				System.out.println("Talk Time : "+mytelUser.getTalktime());
				System.out.println("Data : "+mytelUser.getData()+"MB");
			}
			else
			{
				System.out.println("As a postpaid user, you enjoy unlimited SMS, calls, and data. Charges will reflect in your next billing cycle.");
			}
		}
}

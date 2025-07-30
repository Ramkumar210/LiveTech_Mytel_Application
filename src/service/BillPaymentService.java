package service;

import java.util.Scanner;

import user.MytelUser;

public class BillPaymentService
{
	Scanner scan = new Scanner(System.in);
	public void paymentDetails(MytelUser myteluser)
	{
		System.out.println("Enter Payment Details....");
		System.out.println("Enter debit card/credit card number :");
		myteluser.setCard(scan.nextLine());
		System.out.println("Enter Expiry date(dd-MM-yyyy)::");
		myteluser.setDate(scan.nextLine());
		System.out.println("Enter CVV number:");
		myteluser.setCVV(scan.nextInt());
		scan.nextLine();

	}
	public static void showBillPaymentSummary(MytelUser user) {
	    System.out.println("--- Bill Payment Summary ---");
	    System.out.println("Username: " + user.getUsername());
	    System.out.println("Mobile No: " + user.getUserMobileno());
	    System.out.println("Amount Paid: ₹" + user.getBillamount());
	    System.out.println("Card Used: " + user.getCard());
	    System.out.println("Transaction Date: " + user.getDate());
	    System.out.println("----------------------------");
	}
	public void billPaymentService(MytelUser myteluser)
	{
		
			if(myteluser.getUserSIMtype().equals("postpaid"))
			{
				System.out.println("Bill due amount is "+myteluser.getBillamount()+" INR");
				paymentDetails(myteluser);
				System.out.println("Congratulations..your bill amount is paid successful..");
				showBillPaymentSummary(myteluser);
			}
			else
			{
			System.out.println("This mobile number is prepaid Please go the Pay Recharge option...");
			}
	}
}
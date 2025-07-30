package service;
import java.util.Scanner;

import user.MytelUser;
import utils.PackageConstants;
public class RechargeService 
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
	
	public static void showRechargeDetails(MytelUser myteluser) {
        System.out.println("--- Recharge Summary ---");
        System.out.println("Username: " + myteluser.getUsername());
        System.out.println("Mobile No: " + myteluser.getUserMobileno());
        System.out.println("Recharge Amount: ₹" + myteluser.getPackage_amount());
        System.out.println("Validity: " + myteluser.getPackage_validity() + " days");
        System.out.println("Data/day: " + myteluser.getPackage_data_per_day() + "GB");
        System.out.println("------------------------");
    }

	public void rechargeService(MytelUser myteluser,PackageConstants packageConstants) 
	{
			if(myteluser.getUserSIMtype().equalsIgnoreCase("prepaid"))
			{
				packageConstants.displayPackageOptions();
				System.out.println("Enter the appropriate package number to proceed further...");
				int packageno = scan.nextInt();
				scan.nextLine();
				switch(packageno)
					{
						case 1:
							myteluser.setPackage_amount(packageConstants.PACKAGE1_AMOUNT);
							myteluser.setPackage_validity(packageConstants.PACKAGE1_VALIDITY);
							myteluser.setPackage_data_per_day(packageConstants.PACKAGE1_DATA_PER_DAY);
							paymentDetails( myteluser);
							System.out.println("Congratulations your Recharge(Package 1) is Successfull...");
						break;
						case 2:
							myteluser.setPackage_amount(packageConstants.PACKAGE2_AMOUNT);
							myteluser.setPackage_validity(packageConstants.PACKAGE2_VALIDITY);
							myteluser.setPackage_data_per_day(packageConstants.PACKAGE2_DATA_PER_DAY);
							paymentDetails( myteluser);
							System.out.println("Congratulations your Recharge(Package 2) is Successfull...");
						break;
					}
				showRechargeDetails(myteluser);
			}
			else
			{
				System.out.println("This mobile number is postpaid Please go the Pay Bill option...");
			}		
	}
}


	
	
	
	
	

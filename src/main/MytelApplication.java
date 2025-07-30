package main;

import java.util.ArrayList;
import java.util.Scanner;

import service.BalanceService;
import service.BillPaymentService;
import service.ConversionService;
import service.ProfileService;
import service.RechargeService;
import user.MytelUser;
import user.User;
import user.UserImpl;
import utils.PackageConstants;

public class MytelApplication
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		ArrayList<MytelUser> userlist = new ArrayList<>();
		User user = new UserImpl();
		Scanner scan = new Scanner(System.in);
		
		RechargeService rechargeServiceobject =  new RechargeService();
		BillPaymentService billPaymentServiceobject = new BillPaymentService();
		ConversionService conversionServiceobject = new ConversionService();
		BalanceService balanceServiceobject = new BalanceService();
		ProfileService profileServiceobject =  new ProfileService();
		
		PackageConstants packageConstantsobjects = new PackageConstants();
		while(true)
		{
			user.menu();
			System.out.println("Select the service...");
			int service = scan.nextInt();
			scan.nextLine();
			switch(service)
			{
			case 1:
				System.out.println("Enter Mobile Number :");
				String mobilenumber= scan.nextLine();
				boolean found = false;
				for(MytelUser mytel :userlist)
				{
					if(mytel.getUserMobileno().equals(mobilenumber))
					{
						
						MytelUser userobj = mytel;
						rechargeServiceobject.rechargeService(userobj, packageConstantsobjects);
						found = true;
						break;
					}
					
				}
				if(!found)
				{
					System.out.println("This Mobile Number is not from Mytel Network...Please Enter the Mytel registered number...Thank you !...");
				}
				break;
			case 2:
				System.out.println("Enter Post paid number:");
				String mobilenumebr = scan.nextLine();
				boolean postpaidfound = false;
				for(MytelUser mytel :userlist)
				{
					if(mytel.getUserMobileno().equals(mobilenumebr))
					{
						MytelUser userobj = mytel;
						billPaymentServiceobject.billPaymentService(userobj);
						postpaidfound = true;
						break;
					}
					
				}
				if(!postpaidfound)
				{
					System.out.println("This Mobile Number is not from Mytel Network...Please Enter the Mytel registered number...Thank you !...");
				}
				break;
			case 3:	
				System.out.println("Enter the Mobile Number :");
				String MobileNumber = scan.nextLine();
				boolean numberfound = false;
				for(MytelUser mytel :userlist)
				{
					if(mytel.getUserMobileno().equals(MobileNumber)) 
					{
						MytelUser userobj = mytel;
						conversionServiceobject.conversionService(userobj);
						numberfound = true;
						break;
					}
					
				}
				if(!numberfound)
				{
					System.out.println("This Mobile Number is not from Mytel Network...Please Enter the Mytel registered number...Thank you !...");
				}
				break;
			case 4:
				System.out.println("Enter Mobile Number : ");
				String mobileNumber = scan.nextLine();
				boolean isnumberfound = false;
				for(MytelUser mytel :userlist)
				{
					if(mytel.getUserMobileno().equals(mobileNumber))
					{
						MytelUser userobj = mytel;
						balanceServiceobject.balanceService(userobj);
						isnumberfound = true;
						break;
					}
				}
				if(!isnumberfound)
				{
					System.out.println("This Mobile Number is not from Mytel Network...Please Enter the Mytel registered number...Thank you !...");
				}
				break;
			case 5:
			    profileServiceobject.profileService();
			    userlist.add(new MytelUser(profileServiceobject.getNumber(),profileServiceobject.getName(),profileServiceobject.getAddress(),profileServiceobject.getSimtype()));	
			    break;
				
			case 6:
				System.out.println("Exit Successfully");
				System.exit(6);
				break;
			default:
				System.out.println("Please select the available service(1 - 5)");
				break;
			}
			
		}
		
	}

}

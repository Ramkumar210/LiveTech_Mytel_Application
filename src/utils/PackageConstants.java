package utils;

public class PackageConstants
{
	    public  final int PACKAGE1_AMOUNT = 200;
	    public  final int PACKAGE1_VALIDITY = 28;
	    public  final int PACKAGE1_DATA_PER_DAY = 1;

	    public  final int PACKAGE2_AMOUNT = 300;
	    public  final int PACKAGE2_VALIDITY = 30;
	    public  final int PACKAGE2_DATA_PER_DAY = 2;

	    public  void displayPackageOptions()
	    {
	        System.out.println(".....Available Packages.....");
	        System.out.println("Package 1");
	        System.out.println("   Amount      : ₹" + PACKAGE1_AMOUNT);
	        System.out.println("   Validity    : " + PACKAGE1_VALIDITY + " days");
	        System.out.println("   Data/Day    : " + PACKAGE1_DATA_PER_DAY + " GB");

	        System.out.println("Package 2");
	        System.out.println("   Amount      : ₹" + PACKAGE2_AMOUNT);
	        System.out.println("   Validity    : " + PACKAGE2_VALIDITY + " days");
	        System.out.println("   Data/Day    : " + PACKAGE2_DATA_PER_DAY + " GB");
	    
	    }
}

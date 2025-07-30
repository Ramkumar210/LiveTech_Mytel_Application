package service;
import java.util.*;

public class ProfileService 
{
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String number;
	private String address;
	private String simtype;
	
	
	public Scanner getScan() {
		return scan;
	}


	public void setScan(Scanner scan) {
		this.scan = scan;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSimtype() {
		return simtype;
	}


	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}


	public void profileService()
	{
		System.out.println(".....Profile Details.....");
		System.out.println("-------------------------");
		System.out.println("Enter your Name :");
		name = scan.nextLine();
		System.out.println("Enter Mobile Number :");
		number = scan.nextLine();
		System.out.println("Enter your Address :");
		address = scan.nextLine();
		System.out.println("Enter SIM type :");
		simtype = scan.nextLine();
	}
}

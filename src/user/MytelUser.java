package user;
public class MytelUser 
{

	//properties
	private String username;
	private String UserMobileno;
	private String UserSIMtype;
	private String UserAddress;
	private int package_amount;
	private int package_validity;
	private int package_data_per_day;
	private String card;
	private String date;
	private int CVV;
	
	private int sms = (int) (Math.random()*30);
	private String Talktime ="unlimited";
	private int data = (int) (Math.random()*1024);
	private int billamount = (int) (Math.random()*3000);
	//constructor
	public MytelUser(String userMobileNumber,String userName,String userAddress, String userSIMtype){
		this.UserMobileno=userMobileNumber;
		this.username = userName;
		this.UserAddress =userAddress;
		this.UserSIMtype =userSIMtype;
	}
	
	//setters
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserMobileno(String userMobileno) {
		UserMobileno = userMobileno;
	}
	public void setUserSIMtype(String userSIMtype) {
		UserSIMtype = userSIMtype;
	}
	
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public void setPackage_amount(int package_amount) {
		this.package_amount = package_amount;
	}
	public void setPackage_validity(int package_validity) {
		this.package_validity = package_validity;
	}
	public void setPackage_data_per_day(int package_data_per_day) {
		this.package_data_per_day = package_data_per_day;
	}
	
	public void setCard(String card) {
		this.card = card;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	//getters
	public String getUsername() {
		return username;
	}
	public String getUserMobileno() {
		return UserMobileno;
	}
	public String getUserSIMtype() {
		return UserSIMtype;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public int getPackage_amount() {
		return package_amount;
	}
	public int getPackage_validity() {
		return package_validity;
	}
	public int getPackage_data_per_day() {
		return package_data_per_day;
	}
	public String getCard() {
		return card;
	}
	public String getDate() {
		return date;
	}
	public int getCVV() {
		return CVV;
	}
	public int getBillamount() {
		return billamount;
	}
	public int getSms() {
		return sms;
	}
	public String getTalktime() {
		return Talktime;
	}
	public int getData() {
		return data;
	}
	public void setBillamount(int billamount) {
		this.billamount = billamount;
	}	
	
}

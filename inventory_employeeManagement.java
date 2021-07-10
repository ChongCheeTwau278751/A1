package A_1Final;

import java.util.Arrays;
import java.util.Scanner;
//1.2 pre-define class for import scanner class
	
	public class inventory_employeeManagement {//1.3 User define class
	//1.2 Pre-define class
	String enquiries;
	String employeeType;
	String citizenship;
	
	public inventory_employeeManagement() {//1.4 Constructor with no argument
		employeeManage();
	}
	
	public inventory_employeeManagement(String c) {//1.4 Constructor with one argument
		this.citizenship = c;
	}
	
	public inventory_employeeManagement(String eq, String et){//1.4 Constructor with two argument
		this.enquiries = eq;
		this.employeeType = et;
	}
	
	public void employeeManage() {
		System.out.println("\n\tOur restaurant accept employee from all around the world"
				+ "Any enquiry, please check more on our official page.");
	}
	
	public void setEnquiries(String enquiries) {
		this.enquiries = enquiries;
	}
	
	public void setEmloyeeType(String employeetype) {
		this.employeeType = employeetype;
	}
	//
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	//
	public String getEnquiries() {
		return enquiries;
	}
	
	public String getEmloyeeType() {
		return employeeType;
	}
	//
	public String getCitizenship() {
		return citizenship;
	}
	//
	
	//
	void insertEmployeeData() {
		Scanner in = new Scanner(System.in);
		System.out.println("\t##Employee's data##");
		System.out.print("Name \t\t\t:");
		String name=in.nextLine();
		System.out.print("Age \t\t\t:");
		String age=in.nextLine();
		System.out.print("Gender(Male/Female) \t:");
		String gender=in.nextLine();
		System.out.print("IC Number \t\t:");
		String IC =in.nextLine();
		System.out.print("Position \t\t:");
		String po =in.nextLine();
		
		System.out.println(	"\nName\t\t: " + name +
							"\nAge\t\t: " + age +
							"\nGender\t\t: " + gender +
							"\nIC Number\t: " + IC +
							"\nPosition\t: " + po);
	}
	//
	void reservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t##Reservation##");
		System.out.println("Reservation under name\t: ");
		String rn = sc.nextLine();
		System.out.println("Reservation under name\t: " + rn);
		int min = 1;  
		int max = 50;   
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("Reservation code\t: " + b);
		System.out.println("#Do snap this code and show it to the counter if reservation is made.");
	}
	
	public String RestaurantData() {//Overloading with no argument
		return "\nXymaxx Restaurant only accept 50 online reservations a day as the number of tables is limited! Be quick!";
	}
	
	public String RestaurantData(int tN) {//Overloading with one argument
		return 	"\nTotal number of tables\t\t\t: " + tN;
	}
	
	public String RestaurantData(int r, int a) {//Overloading with two argument
		return 	"\nTotal number of current employees\t: " + r + 
				"\nTotal number of employees needed\t: " + a;
	}
	
	public String toString1() {
		return "\nNo matter you are from " + citizenship + " , you are welcomed to Xymaxx restaurant.";
	}
	
	public String toString2() {
		return "";
	}
	
	public String toString() {
		return 	"\n\t<<Xymaxx Restaurant Inventory and Employee Management>>" + 
				"\nPlease contact us for works enquiry\t: " + enquiries +
				"\nXymaxx Restaurant do accept " + employeeType + " employee(s). " +
				RestaurantData() + 
				RestaurantData(100) +
				RestaurantData(10,30) +
				"\nWarm welcome from Xymaxx Restaurant in advance!";
	}
}
package A_1Final;

import java.util.Arrays;
import java.util.Scanner;

public class sales {//1.3 User define class
	//1.2 Pre-define class
	int price;
	int time;
	int person;
	String extrafee;

	public sales() {//1.4 Constructor with no argument
		sales_billing();
	}

	public sales(String ef) {//1.4 Constructor with one argument
		this.extrafee = ef;
	}
	
	public sales(int p, int t, int pe){//1.4 Constructor with three argument
		this.price = p;
		this.time = t;
		this.person = pe;
	}
	
	public void sales_billing() {
		System.out.println("\n\tXymaxx Restaurant is a buffet restaurant"
				+ "\n\tPrice List and Charging Standard are different from regular restaurant"
				+ "\n\tTax and Extra Fees Included!");
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public void setPerson(int person) {
		this.person = person;
	}
	
	//
	public void setextrafee(String extrafee) {
		this.extrafee = extrafee;
	}
	//
	
	public int getPrice() {
		return price;//150
	}
	
	public int getTime() {
		return time;//1 hour
	}
	
	public int getPerson() {
		return person;//per one person
	}
	
	public String getextrafee() {
		return extrafee;
	}
	
	public int total() {//Overloading with no argument
		return price*(time/60);
	}
	
	 public int total(int time){//Overloading with one argument
	 	return price*(time/60);
	}
	     
	public int total(int price, int time){//Overloading with two argument
	    return price*(time/60);
	}
	
	void insertCustomerData() {
		Scanner s = new Scanner(System.in);
		System.out.println("\t##Customer's data##");
		System.out.println("Enter the number of customer(s):");
		int length = s.nextInt();
		String [] array = new String[length];
		System.out.println("Enter the names of the customer(briefly):");

		for(int i=0; i<length; i++ ) {
		   array[i] = s.next();
		}
		  System.out.print("Customer(s)' namelist\t: " + Arrays.toString(array));
		System.out.println("\n");
		}
	
	void calcPrice() {
		Scanner in = new Scanner(System.in);
		System.out.println("\t##Price Calculation##");
		System.out.println("Enter the number of customer\t:");
		int n = in.nextInt();
		System.out.println("Enter the time spent in the restaurant(in minutes)\t:");
		int t = in.nextInt();
		System.out.println("Time spent\t: " + t + " mins or " + (t/60) + " hour(s) and " + (t%60) + " mins");
		if(t <= 60) {
			int p1 = 150*n;
			System.out.println("Total price\t: RM" + p1);
		}else if(t>60 && t<=120) {
			int p2 = 300*n;
			System.out.println("Total price\t: RM" + p2);
		}else if(t>120 && t<=180) {
			int p3 = 450*n;
			System.out.println("Total price\t: RM" + p3);
		}
	}
	
	public String toString1() {
		return "The extra fees included " + extrafee;
	}
	
	public String toString2() {
		return "";
	}
	
	public String toString() {
		return "RM" + price + " per "
				+ person + " person(s) for " +
				+ time + " mins or " + (time/60) + " hour(s) and " + (time%60) + " mins" +
				"\nTotal price for one person for one hour\t\t: RM" + total() +
				"\nTotal price for one person for two hour\t\t: RM" + total(120) +
				"\nTotal price for one person for three hour\t: RM" + total(150, 180);
	}
}

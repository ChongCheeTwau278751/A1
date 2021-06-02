package A_1;

import java.util.Arrays;
import java.util.Scanner;

public class sales {//1.3 User define class
	//1.2 Pre-define class
	int price;
	int time;
	int person;
	
	sales(int p, int t, int pe){
		this.price = p;
		this.time = t;
		this.person = pe;
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
	
	public int getPrice() {
		return price;//150
	}
	
	public int getTime() {
		return time;//1 hour
	}
	
	public int getPerson() {
		return person;//per one person
	}
	
	public int total() {//1.4 Constructor with no argument
		return price*(time/60);
	}
	
	 public int total(int time){//1.4 Constructor with one argument
	 	return price*(time/60);
	}
	     
	public int total(int price, int time){//1.4 Constructor with two argument
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
	
	public String toString() {
		return "RM" + price + " per "
				+ person + " person(s) for " +
				+ time + " mins or " + (time/60) + " hour(s) and " + (time%60) + " mins" +
				"\nTotal price for one person for one hour\t\t: RM" + total() +
				"\nTotal price for one person for two hour\t\t: RM" + total(120) +
				"\nTotal price for one person for three hour\t: RM" + total(150, 180);
	}
}

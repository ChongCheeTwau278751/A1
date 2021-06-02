package A_1;

import java.util.Scanner;

public class advertisement_marketing {//1.3 User define class
	//1.2 Pre-define class
	String mMethod;//online marketing
	String aMethod;//online advertisement
	
	advertisement_marketing(String m, String a){
		this.mMethod = m;
		this.aMethod = a;
	}
	
	public void setMMethod(String mMethod) {
		this.mMethod = mMethod;	
	}
	
	public void setAMethod(String aMethod) {
		this.aMethod = aMethod;	
	}
	
	public String getMMethod() {
		return mMethod;
	}
	
	public String getAMethod() {
		return aMethod;
	}
	
	
	public String Uniqueness() {//1.4 Constructor with no argument
		return "\nKnown as restaurant with buffet service where all the food provided is Malaysian Tradisional Dishes!";
	}
	
	public String Uniqueness(int u) {//1.4 Constructor with one argument
		return "\nWelcome to taste Malaysia at only RM " + u + "per person(1 hour)!";//RM150
	}
	
	public String Uniqueness(String cn, String web) {//1.4 Constructor with two argument
		return "\nPlease call " + cn + " or visit our official website " + web + " for reservation(only 50 table is reserved a day!)";//0123456789, website
	}
	
	void rankDishes() {
		Scanner in = new Scanner(System.in);
		System.out.println("\t##Dishes Ranking##");
		System.out.println("Please enter the best dishes(in your opinion):");
		String d = in.next();
		System.out.println("I think the best Malaysian Traditional dishes is\t:" + d);
	}
	
	public String toString() {
		return 	"\n\t<<Xymaxx Restaurant's Advertisement and Marketing Method>>" +
				"\nXymaxx Restaurant's marketing method: " + mMethod +
				"\nCheck more about Xymaxx Restaurant on: " + aMethod +
				Uniqueness() +
				Uniqueness(150) + 
				Uniqueness("0123456789", "www.xymaxxrestaurant.com");
	}
}

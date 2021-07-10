package A_1Final;

import java.util.Scanner;

	public class advertisement_marketing {//1.3 User define class
	//1.2 Pre-define class
	String mMethod;//online marketing
	String aMethod;//online advertisement
	
	String hDishes;
	
	public advertisement_marketing(){//Constructor with no argument
		advertise();
	}
	
	public advertisement_marketing(String d){//Constructor with one argument
		this.hDishes = d;
	}
	
	public advertisement_marketing(String m, String a){//Constructor with two argument
		this.mMethod = m;
		this.aMethod = a;
	}
	
	public void advertise() {
		System.out.println("\n\tUser can get to know better about Xymaxx Restaurant from our: "
				+ "\n\t\tOfficial Instagram Account"
				+ "\n\t\tOfficial Facebook Account"
				+ "\n\t\tOfficial Twitter Account"
				+ "\n\t\tDo not forget our official website!");
	}

	public void setMMethod(String mMethod) {
		this.mMethod = mMethod;	
	}
	
	public void setAMethod(String aMethod) {
		this.aMethod = aMethod;	
	}
	//
	public void setHDishes(String hDishes) {
		this.hDishes = hDishes;	
	}
	//
	public String getMMethod() {
		return mMethod;
	}
	
	public String getAMethod() {
		return aMethod;
	}
	
	public String getHDishes() {
		return hDishes;
	}
	
	void rankDishes() {
		Scanner in = new Scanner(System.in);
		System.out.println("\t##Dishes Ranking##");
		System.out.println("Please enter the best dishes(in your opinion):");
		String d = in.next();
		System.out.println("I think the best Malaysian Traditional dishes is\t:" + d);
	}
	
	public String Uniqueness() {//Overloading with no argument
		return "\nKnown as restaurant with buffet service where all the food provided is Malaysian Tradisional Dishes!";
	}
	
	public String Uniqueness(int u) {//Overloading with one argument
		return "\nWelcome to taste Malaysia at only RM " + u + "per person(1 hour)!";//RM150
	}
	
	public String Uniqueness(String cn, String web) {//Overloading with two argument
		return "\nPlease call " + cn + " or visit our official website " + web + " for reservation(only 50 table is reserved a day!)";//0123456789, website
	}
	
	public String toString1() {
		return "\nUser can also rate their best dishes!" +
				"\nRecommended highlight dishes: " + hDishes;
	}
	
	public String toString2() {
		return "";
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

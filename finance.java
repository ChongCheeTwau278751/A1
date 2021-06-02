package A_1;

import java.util.Scanner;

public class finance {//1.3 User define class
	//1.2 Pre-define class
	int income;
	int spending;
	int profit;
	int price;
	
	finance(int i, int spend, int prf, int p){
		this.income = i;
		this.spending = spend;
		this.profit = prf;
		this.price = p;
	}
	
	public void setIncome(int income) {
		this.income = income;
	}
	
	public void setSpending(int spending) {
		this.spending = spending;
	}
	
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getIncome() {
		return income;
	}
	
	public int getSpending() {
		return spending;
	}
	
	public int getProfit() {
		return profit;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public int TotalIncome(int customerN) {//a month
		return price*30*customerN;
	}
	
	public int TotalSpending() {//a month
		return spending;
	}
	
	public int TotalProfit() {//1.4 Constructor with no argument
		return (price*1/5);//one customer
	}
	
	public int TotalProfit(int customerN) {//1.4 Constructor with one argument
		return (price*customerN)-((price*4/5)*customerN);//a day
	}
	
	public int TotalProfit(int customerN, int day) {//1.4 Constructor with two arguments
		return (price*day*customerN)-((price*4/5)*day*customerN);//1 month
	}
	
	void calcProfit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\t##Profit Calculations##");
		System.out.println("Insert total income for the month\t: RM");
		int tI = scan.nextInt();
		System.out.println("Insert total spending for the month\t: RM");
		int tS = scan.nextInt();
		int tP = tI - tS;
		System.out.println(	"\nTotal Income(a month)\t: RM" + tI +
							"\nTotal Spending(a month)\t: RM" + tS +
							"\nTotal Profit(a month)\t: RM" + tP );
	}
	
	public String toString() {
		return 	"\n\t<<Xymaxx Restaurant's financial status>>" +
				"\nTotal income for a month(estimated)\t: RM" + income +
				"\nTotal income for a month\t\t: RM" + TotalIncome(1000) +
				"\nTotal spending for a month(estimated)\t: RM" + TotalSpending() + 
				"\nTotal spending for a month\t\t: RM" + spending + 
				"\nProfit(one customer)\t\t\t: RM" + TotalProfit() +
				"\nProfit(a day-estimated)\t\t\t: RM" + TotalProfit(100) + 
				"\nProfit(a month-estimated)\t\t: RM" + profit +
				"\nProfit for a month\t\t\t: RM" + TotalProfit(1000, 25);
	}
}

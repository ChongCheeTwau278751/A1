package A_1Final;

public class Restaurant {//1.3 User define class
	//1.2 Pre-define class
	String name;
	String operation;
	String location;
	String menu;
	String food;
	String beverage;
	String desserts;
	String phoneNumber;
	String founder;
	
	public Restaurant(){//1.4 Constructor with no argument
		description();
	}
	
	public Restaurant(String fo){//1.4 Constructor with one argument
		this.founder = fo;
	}
	
	public Restaurant(String name, String opr, String loc, String mn, String food, String bvrg, String dsrt, String hp){//1.4 Constructor with eight argument
		this.name = name;
		this.operation = opr;
		this.location = loc;
		this.menu = mn;
		this.food = food;
		this.beverage = bvrg;
		this.desserts = dsrt;
		this.phoneNumber = hp;
	}
	
	public void description() {
		System.out.println("\n\tXymaxx Restaurant is one of the top buffet restaurants in Malaysia."
				+ "\n\tXymaxx Restaurant only focus on Malaysian Tradisional Dishes.");
	}
	
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	
	public void setDesserts(String desserts) {
		this.desserts = desserts;
	}
	
	public void setPhonenumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getFounder() {
		return founder;//
	}
	
	public String getName() {
		return name;//Xymaxx Restaurant
	}
	
	public String getOperation() {
		return operation;//Buffet Restaurant
	}
	
	public String getLocation() {
		return location;//Pulau Langkawi
	}
	
	public String getMenu() {
		return menu;//Malaysian Tradisional Dishes
	}
	
	public String getFood() {
		return food;//Nasi lemak
	}
	
	public String getBeverage() {
		return beverage;//Teh tarik
	}
	
	public String getDesserts() {
		return desserts;//Apam balik
	}
	
	public String getPhonenumber() {
		return phoneNumber;//0123456789
	}
	
	public String restaurants() {//Overloading with no argument
    	return "\nXymaxx Restaurant provides Malaysian Tradisional dishes such as:"
    			+ "\n\t Rendang from the Malay"
    			+ "\n\t Char Kway Teow from the Chinese"
    			+ "\n\t Roti Canai from the Indian"
    			+ "\n#Menu change according to theme everyday, let's taste Malaysia!";
    }
	
	public String restaurants(String f) {//Overloading with one argument
    	return "\nXymaxx Restaurant only serves Malaysian traditional dishes and foods such as " + f + " which is wellknown all around the world!";
    }
    
    public String restaurants(String b, String d) {//Overloading with two argument
    	return "\nXymaxx Restaurant also serves Malaysian traditional drinks and desserts such as " + "\n\t" +
    			b + " which known as Malaysia's national drinks and " + "\n\t" + 
    			d + " which is one of the classic street food snack in Malaysia!";
    }
    
    public String toString1() {
    	return "\nFounder \t\t: " + founder;
    }
    
    public String toString2() {
    	return "";
    }
    
	public String toString() {
		return "\t<<" + name + ">> is welcoming you to Malaysia!" +
	"\nType of operation \t: " + operation +
	"\nLocation \t\t: " + location +
	"\nContact number \t\t: " + phoneNumber +
	"\nMenu provided \t\t: " + menu +
	"\nMust try food \t\t: " + food +
	"\nMust try beverage \t: " + beverage + 
	"\nMust try desserts \t: " + desserts +
	"\nAbout our restaurant:" + restaurants() + 
	restaurants("NASI LEMAK") + 
	restaurants("TEH TARIK","AIS KACANG");
	}
	
}

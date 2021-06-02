package A_1;

public class restaurantDescription {//1.3 User define class
	//1.2 Pre-define class
	String menu;
	String about;
	String features;
	String meals;
	
	restaurantDescription(String mn, String ab, String f, String ml){
		this.menu = mn;
		this.about = ab;
		this.features = f;
		this.meals = ml;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public void setFeatures(String features) {
		this.features = features;
	}
	
	public void setMeals(String meals) {
		this.meals = meals;
	}
	
	public String getMenu() {
		return menu;//Malaysian Tradisional dishes
	}
	
	public String getAbout() {
		return about;//locally and trusted suppliers
	}
	
	public String getFeatures() {
		return features;//American Express, Mastercard, Visa, credit card and mobile payment
	}
	
	public String getMeals() {
		return meals;//brunch, food, desserts and drinks 
	}
	
	public String description() {//1.4 Constructor with no argument
		return "\nXymaxx Restaurants have different themes everyday as shown below:"
				+ "\nMon/Wed/Fri \t:The Amazing Malaysia"
				+ "\nTue/Thur/Sat \t:The Uniqueness of Malaysia"
				+ "\nSun \t\t: The best out of the best in Malaysia";
	}

	public String description(String t) {//1.4 Constructor with one argument
		return "\n#Xymaxx Restaurants will have the top ranked Malaysian Tradisional Dishes of the week on every " + t ;//Sunday
	}
	
	public String description(String m1, String m2) {//1.4 Constructor with two argument
		return "\nHighlight dishes in Menu '" + m1 + "' \t:"
				+ "\nNasi Lemak"
				+ "\nRendang"
				+ "\nRoti Canai"
				+ "\nSatay"
				+ "\nCurry Laksa"
				+ "\nChar Kuey Teow"
				+ "\n\nHighlight dishes in Menu '" + m2 +"' \t:"
				+ "\nNasi Kerabu"
				+ "\nHainanese Chicken Rice"
				+ "\nBak Kut Teh"
				+ "\nNasi Briyani"
				+ "\nRoti Tisu"
				+ "\nAis Kacang";
	}
	
	public String toString() {
		return 	"\n\t##Xymaxx Restaurants' details and descriptions!##" +
				"\n1.\t Xymaxx Restaurant serves " + menu + " without occasional excursions into other countries' ingredients and style!" +
				"\n2.\t Xymaxx Restaurant mainly use the ingredients sourced from " + about + " to the extent possible!" +
				"\n3.\t Xymaxx Restaurant brings a brilliant taste of Malaysian traditional culinary and beverage to offer a quality " + meals +"to the customers!" +
				"\n4.\t Xymaxx Restaurants accepts " + features + "." +
				"\n\n\t<<Menu description>>" + description() +
				description("Sunday") +
				description("The Amazing Malaysia", "The Uniqueness of Malaysia") +"";
	}
}
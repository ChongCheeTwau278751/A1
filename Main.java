package A_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant r = new Restaurant("Xymaxx Restaurant", "Buffet", "Pulau Langkawi", "Malaysian Tradisional Dishes", "Nasi Lemak", "Teh Tarik", "Ais Kacang", "0123456789");
	
		restaurantDescription rd = new restaurantDescription("Malaysian Tradisional dishes", "locally and trusted suppliers", "American Express, Mastercard, Visa, credit card and mobile payment", "brunch, food, desserts and drinks ");
		
		sales s = new sales(150, 60, 1);
		
		inventory_employeeManagement m = new inventory_employeeManagement("xymaxx123@gmail.com/0123456789/www.xymaxxrestaurant.com","full time, part time or contract");
		
		advertisement_marketing am = new advertisement_marketing("Buffet Restaurant", "\n\tFacebook\t(Xymaxx Restaurant) \n\tInstagram\t(Xymaxx_Restaurant) \n\tTwitter\t\t(XymaxxRestaurant)");
		
		finance f = new finance(2500000, 1500000, 2700000, 150);
		
		
		
		System.out.println(r);
		System.out.println();
		System.out.println(rd);
		System.out.println();
		System.out.println(s);
		System.out.println();
		s.insertCustomerData();
		System.out.println();
		s.calcPrice();
		System.out.println();
		System.out.println(m);
		System.out.println();
		m.insertEmployeeData();
		System.out.println();
		m.reservation();
		System.out.println();
		System.out.println(am);
		System.out.println();
		am.rankDishes();
		System.out.println();
		System.out.println(f);
		System.out.println();
		f.calcProfit();
	}
	

}

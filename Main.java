package A_1Final;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("About Xymaxx Restaurant");
		
		Restaurant r = new Restaurant("Xymaxx Restaurant", "Buffet", "Pulau Langkawi", "Malaysian Tradisional Dishes", "Nasi Lemak", "Teh Tarik", "Ais Kacang", "0123456789");
		Restaurant r1 = new Restaurant("Max Lucien");
		Restaurant r2 = new Restaurant();
		
		restaurantDescription rd = new restaurantDescription("Malaysian Tradisional dishes", "locally and trusted suppliers", "American Express, Mastercard, Visa, credit card and mobile payment", "brunch, food, desserts and drinks ");
		restaurantDescription rd1 = new restaurantDescription("week/month");
		restaurantDescription rd2 = new restaurantDescription();
		
		sales s = new sales(150, 60, 1);
		sales s1 = new sales("Tax and Services Charge");
		sales s2 = new sales();
		
		inventory_employeeManagement m = new inventory_employeeManagement("xymaxx123@gmail.com/0123456789/www.xymaxxrestaurant.com","full time, part time or contract");
		inventory_employeeManagement m1 = new inventory_employeeManagement("local or foreign");
		inventory_employeeManagement m2 = new inventory_employeeManagement();
		
		advertisement_marketing am = new advertisement_marketing("Buffet Restaurant", "\n\tFacebook\t(Xymaxx Restaurant) \n\tInstagram\t(Xymaxx_Restaurant) \n\tTwitter\t\t(XymaxxRestaurant)");
		advertisement_marketing am1 = new advertisement_marketing("All Malaysian Tradisional Dishes");
		advertisement_marketing am2 = new advertisement_marketing();
		
		finance f = new finance(2500000, 1500000, 2700000, 150);
		finance f1 = new finance(1500000);
		finance f2 = new finance();
		
		
		System.out.println(r);
		System.out.println(r1.toString1());
		System.out.println(r2.toString2());
		System.out.println();
		
		System.out.println(rd);
		System.out.println(rd1.toString1());
		System.out.println(rd2.toString2());
		System.out.println();
		
		System.out.println(s);
		System.out.println(s1.toString1());
		System.out.println(s2.toString2());
		System.out.println();
		s.insertCustomerData();
		System.out.println();
		s.calcPrice();
		System.out.println();
		
		System.out.println(m);
		System.out.println(m1.toString1());
		System.out.println(m2.toString2());
		System.out.println();
		m.insertEmployeeData();
		System.out.println();
		m.reservation();
		System.out.println();
		
		System.out.println(am);
		System.out.println(am1.toString1());
		System.out.println(am2.toString2());
		am.rankDishes();
		System.out.println();
		
		System.out.println(f);
		System.out.println(f1.toString1());
		System.out.println(f2.toString2());
		System.out.println();
		f.calcProfit();
	}
	

}

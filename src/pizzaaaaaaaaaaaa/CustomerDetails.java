package pizzaaaaaaaaaaaa;



//import java.util.Iterator;

public class  CustomerDetails  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateBill bill=new GenerateBill("Shane Pereira",100);
		PizzaDetails ButterChickenpizza=new PizzaDetails("ButterChickenpizza", 170);
		PizzaDetails Salamipiza=new PizzaDetails("Salamipiza", 100);
		PizzaDetails Fishpizza = new PizzaDetails("Fishpizza", 120);
		PizzaDetails Paneerpizza= new PizzaDetails("Paneerpizza", 130);
		
		bill.add(new Order(ButterChickenpizza, 2));
		bill.add(new Order(Salamipiza, 2));
		bill.add(new Order(Fishpizza, 5));
		bill.add(new Order(Paneerpizza, 2));
		
		bill.printBill();
		
		/*
		 OrderedDishes o1 = new OrderedDishes(ButterChicken,2);
		OrderedDishes o2 = new OrderedDishes(ChickenLollipop,3);
		OrderedDishes o3 = new OrderedDishes(FishTali,5);
		OrderedDishes o4 = new OrderedDishes(PaneerTikka,1);

		dishes.add(o1);	
		dishes.add(o2);	
		dishes.add(o3);	
		dishes.add(o4);	

		Iterator<OrderedDishes> iterator = dishes.iterator(); // 
		while (iterator.hasNext()) { 
			OrderedDishes value = iterator.next(); 
		
		System.out.println("object"+iterator.hashCode());
		value.printBill(); 
		}
	    */
	}
}

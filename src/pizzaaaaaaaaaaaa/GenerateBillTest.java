package pizzaaaaaaaaaaaa;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class GenerateBillTest {
	GenerateBill bill;
	PizzaDetails Chicken=new PizzaDetails("Chicken", 170);
	PizzaDetails BBQ=new PizzaDetails("BBQ", 100);
	PizzaDetails Veg = new PizzaDetails("Veg", 120);
	PizzaDetails Paneer= new PizzaDetails("Paneer", 130);
	
	ArrayList<Order> Pizzas;

	@Before
	public void setUp() throws Exception {
		bill=new GenerateBill("Shane Pereira",100);
		Pizzas = new ArrayList<Order>();
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		bill.add(new Order(Chicken, 2));
		bill.add(new Order(BBQ, 2));
		bill.add(new Order(Veg, 2));
		bill.add(new Order(Paneer, 2));

		bill.printBill();
		
	}

	@Test
	public void testPrintBill() {
		//fail("Not yet implemented");
		
	}

	

}

package pizzaaaaaaaaaaaa;



public class Order {
	public PizzaDetails dish;
	public int quantity;
	
	public Order(PizzaDetails dish, int quantity){
		try{
			this.dish=dish;
			this.quantity=quantity;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

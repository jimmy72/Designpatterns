package be.vdab.pizzafactory;

public class Main {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza;
		
		try {
			pizza = store.orderPizza("pepperoni");
			System.out.println(pizza);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Dit type pizza bestaat helaas niet!");
			//e.printStackTrace();
		}
		
		
		
	}
}

package be.vdab.pizzafactory;

public class Main {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza;
		
		pizza = store.orderPizza("pepperoni");
		System.out.println(pizza);
		
		
	}
}

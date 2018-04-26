package be.vdab.pizzafactory;

public class PepperoniPizza implements Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Pepperonipizza prepared");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Pepperonipizza baked");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Pepperonipizza cut");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Pepperonipizza boxed");
	}
}

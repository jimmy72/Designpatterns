package be.vdab.pizzafactory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Cheesepizza prepared");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Cheesepizza baked");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cheesepizza cut");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Cheesepizza boxed");
	}
	
}

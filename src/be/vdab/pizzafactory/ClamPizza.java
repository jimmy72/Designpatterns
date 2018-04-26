package be.vdab.pizzafactory;

public class ClamPizza implements Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Clampizza prepared");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Clampizza baked");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Clampizza cut");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Clampizza boxed");
	}
}

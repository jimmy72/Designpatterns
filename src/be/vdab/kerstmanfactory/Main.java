package be.vdab.kerstmanfactory;

public class Main {

	public static void main(String[] args) {

		Speelgoed speelgoed = Kerstman.INSTANCE.getCadeau(5);
		
		System.out.println(speelgoed.getPrijs());
		

	}

}

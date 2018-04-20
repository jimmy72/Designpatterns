package be.vdab.coordinaatwiskunde;

public class Main {

	public static void main(String[] args) {
		Coordinaat.CoordinaatBuilder builder = new Coordinaat.CoordinaatBuilder();
		
		Coordinaat c = builder
				.metXCoordinaat(13)
				.metYCoordinaat(25)
				.metZCoordinaat(56)
				.maakCoordinaat();
		
		System.out.println(c);

	}

}

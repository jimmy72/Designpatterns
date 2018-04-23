package be.vdab.composite;

public class Grondstofkost implements Kost {

	private double eenheidsPrijs;
	private double hoeveelheid;
	
	public Grondstofkost(double eenheidsPrijs, double hoeveelheid) {
		this.eenheidsPrijs = eenheidsPrijs;
		this.hoeveelheid = hoeveelheid;
	}
	
	@Override
	public double berekenKost() {
		return eenheidsPrijs * hoeveelheid;
	}
	
}

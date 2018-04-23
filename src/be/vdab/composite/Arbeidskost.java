package be.vdab.composite;

public class Arbeidskost implements Kost {

	private double uurloon;
	private double aantalUren;
	
	public Arbeidskost(double uurloon, double aantalUren) {
		this.uurloon = uurloon;
		this.aantalUren = aantalUren;
	}
	@Override
	public double berekenKost() {
		return uurloon * aantalUren;
	}

	
}

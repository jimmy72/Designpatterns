package be.vdab.decorator;

public abstract class KoffieDecorator implements Koffie {
	protected final Koffie gedecoreerdeKoffie;
	
	public KoffieDecorator(Koffie koffie) {
		this.gedecoreerdeKoffie = koffie;
	}
}

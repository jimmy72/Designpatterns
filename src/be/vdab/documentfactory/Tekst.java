package be.vdab.documentfactory;

public class Tekst extends Document{
	public Tekst(String bestandsnaam) {
		super(bestandsnaam);
		}
		@Override
		public void print() {
		System.out.println("een afdruk van een tekst");
		}
		@Override
		public void printPreview() {
		System.out.println("een afdrukvoorbeeld van een tekst");
		}
}

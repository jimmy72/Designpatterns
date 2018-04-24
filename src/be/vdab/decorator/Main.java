package be.vdab.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Koffie eenvoudig = new EenvoudigeKoffie();
		System.out.println(eenvoudig.getKost());
		System.out.println(eenvoudig.getBereidingswijze());
		System.out.println();
		
		Koffie metMelk = new MetMelk(new EenvoudigeKoffie());
		System.out.println(metMelk.getKost());
		System.out.println(metMelk.getBereidingswijze());
		System.out.println();
		
		Koffie metMelkEnChocolade = new MetMelk(new MetChocolade(new EenvoudigeKoffie()));
		System.out.println(metMelkEnChocolade.getKost());
		System.out.println(metMelkEnChocolade.getBereidingswijze());
		
		
		

	}

}

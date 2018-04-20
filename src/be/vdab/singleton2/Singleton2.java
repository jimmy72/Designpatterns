package be.vdab.singleton2;

import java.util.Random;

public enum Singleton2 {
	INSTANCE;
	
	private String[] antwoorden = new String[] {
		"Zoals ik het zie, ja.",
		"Het is zeker.",
		"Hoogst waarschijnlijk.",
		"Ziet er goed uit",
		"Ja.",
		"Zeker.",
		"Je mag er op rekenen.",
		"Vraag dit later nog eens.",
		"Dit wil je niet weten.",
		"Ik kan dit nu niet voorspellen.",
		"Concentreer je en stel je vraag opnieuw.",
		"Je moet er niet op rekenen.",
		"Nee.",
		"Ziet er niet goed uit.",
		"Zeer twijfelachtig."
	};
	private int vorigeIndex = -1;
	
	public void antwoord() {
		Random random = new Random();
		int antwoordIndex = random.nextInt(antwoorden.length);
		while(antwoordIndex == vorigeIndex) {
			antwoordIndex = (int) (Math.random() * antwoorden.length);
		}
		vorigeIndex = antwoordIndex;
		//System.out.println("vorige index: " + vorigeIndex);
		System.out.println("Antwoord: " + antwoorden[antwoordIndex]);
	}
			
}

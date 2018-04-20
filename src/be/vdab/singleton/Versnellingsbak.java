package be.vdab.singleton;

public enum Versnellingsbak {
	INSTANCE;
	private int versnelling = 0;
	
	public void schakelOmhoog() {
		if (versnelling == 5 ) {
			throw new RuntimeException("Je zit al in de hoogste versnelling!");
		}
		versnelling++;
		System.out.println("Versnelling: " + versnelling);
	}
	
	public void schakelOmlaag() {
		if (versnelling == -1) {
			throw new RuntimeException("Je zit al in de laagste versnelling!");
		}
		versnelling--;
		System.out.println("Versnelling: " + versnelling);
	}
	
	
}

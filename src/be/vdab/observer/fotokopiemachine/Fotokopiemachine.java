package be.vdab.observer.fotokopiemachine;

import java.util.Observable;

public class Fotokopiemachine extends Observable {
	
	private final String serieNummer;
	private int aantalKopies = 998;
	
	public Fotokopiemachine(String serieNummer) {
		this.serieNummer = serieNummer;
	}
	
	public void maakKopie() {
		aantalKopies++;
		if(aantalKopies % 1000 == 0) {
			setChanged();
			notifyObservers();
		}
	}

	public int getAantalKopies() {
		return aantalKopies;
	}

	public String getSerieNummer() {
		return serieNummer;
	}
	
	
}

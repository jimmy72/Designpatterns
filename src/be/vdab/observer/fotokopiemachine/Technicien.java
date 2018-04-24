package be.vdab.observer.fotokopiemachine;

import java.util.Observable;
import java.util.Observer;

public class Technicien implements Observer {

	private final int personeelsnummer;
	
	public Technicien(int personeelsnummer) {
		this.personeelsnummer = personeelsnummer;
	}
	@Override
	public void update(Observable o, Object arg) {
		if(!(o instanceof Fotokopiemachine)) {
			throw new IllegalArgumentException();
		}
		Fotokopiemachine machine = (Fotokopiemachine) o;
		
		System.out.println("Technicien met personeelsnummer " + personeelsnummer
				+ " reageert op tellerstand (" + machine.getAantalKopies()
				+ ") van de fotokopiemachine met serienummer " 
				+ machine.getSerieNummer() + "."
		);
		
	}
	
}

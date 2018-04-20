package be.vdab.facade.stereoketen;

public class Stereoketen {

	private Versterker versterker;
	private Equalizer equalizer;
	private Radio radio;
	private CDSpeler cdspeler;
	
	public Stereoketen(Versterker versterker, Equalizer equalizer, Radio radio, CDSpeler cdspeler) {
		this.versterker = versterker;
		this.equalizer = equalizer;
		this.radio = radio;
		this.cdspeler = cdspeler;
	}
	
	public void start() {
		
	}
}

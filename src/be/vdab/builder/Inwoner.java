package be.vdab.builder;

public class Inwoner {
	
	private String voornaam;
	private String familienaam;
	private int aantalKinderen;
	private int aantalKeerVerhuisd;
	private boolean gehuwd;
	private boolean gescheiden;
	private Inwoner(String voornaam, String familienaam, int aantalKinderen,
	int aantalKeerVerhuisd, boolean gehuwd, boolean gescheiden) {
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
		this.aantalKeerVerhuisd = aantalKeerVerhuisd;
		this.gehuwd = gehuwd;
		this.gescheiden = gescheiden;
	}
	@Override
	public String toString() {
		return voornaam + ' ' + familienaam;
	}
	
	public static class InwonerBuilder {
		private String voornaam;
		private String familienaam;
		private int aantalKinderen;
		private int aantalKerenVerhuisd;
		private boolean gehuwd;
		private boolean gescheiden;
		
		public InwonerBuilder metVoornaam(String voornaam) { 
		this.voornaam = voornaam;
		return this;
		}
		public InwonerBuilder metFamilienaam(String familienaam) {
		this.familienaam = familienaam;
		return this;
		}
		public InwonerBuilder metAantalKinderen(int aantalKinderen) {
		this.aantalKinderen = aantalKinderen;
		return this;
		}
		public InwonerBuilder metAantalKerenVerhuisd(int aantalKerenVerhuisd) {
		this.aantalKerenVerhuisd = aantalKerenVerhuisd;
		return this;
		}
		public InwonerBuilder metGehuwd(boolean gehuwd) {
		this.gehuwd = gehuwd;
		return this;
		}
		public InwonerBuilder metGescheiden(boolean gescheiden) {
		this.gescheiden = gescheiden;
		return this;
		}
		public Inwoner maakInwoner() {
		return new Inwoner(voornaam, familienaam, aantalKinderen,
		aantalKerenVerhuisd, gehuwd, gescheiden);
		}
	}
}

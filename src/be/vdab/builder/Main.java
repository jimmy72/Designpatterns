package be.vdab.builder;

public class Main {

	public static void main(String[] args) {
		Inwoner.InwonerBuilder builder = new Inwoner.InwonerBuilder();
		
		Inwoner inwoner = builder
				.metVoornaam("Jimmy")
				.metFamilienaam("Godin")
				.metAantalKinderen(0)
				.metAantalKerenVerhuisd(2)
				.metGehuwd(true)
				.metGescheiden(false)
				.maakInwoner();
				
		System.out.println(inwoner);
		

	}

}

package be.vdab.facade.stereoketen;

public class Main {

	public static void main(String[] args) {
		Stereoketen stereo = new Stereoketen();
		stereo.start();
		stereo.startCDSpeler();
		stereo.stop();
		stereo.start();
		stereo.startRadio();
	}

}

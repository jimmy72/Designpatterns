package be.vdab.observer.fotokopiemachine;

public class Main {

	public static void main(String[] args) {
		Fotokopiemachine machine = new Fotokopiemachine("A456614");
		
		Technicien jimmy = new Technicien(16);
		Technicien sonja = new Technicien(12);
		
		machine.addObserver(sonja);
		machine.addObserver(jimmy);
		machine.maakKopie();
		machine.maakKopie();

	}

}

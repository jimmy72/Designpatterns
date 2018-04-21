package be.vdab.facade.stereoketen;

public class CDSpeler implements Geluidsbron {

	@Override
	public void start() {
		System.out.println("CD-speler is gestart");
		
	}

	@Override
	public void stop() {
		System.out.println("CD-speler is gestopt");
		
	}
		
}

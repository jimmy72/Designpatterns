package be.vdab.facade.stereoketen;

public class Radio implements Geluidsbron{

	@Override
	public void start() {
		System.out.println("Radio is gestart");
	}

	@Override
	public void stop() {
		System.out.println("Radio is gestopt");
	}
	
}

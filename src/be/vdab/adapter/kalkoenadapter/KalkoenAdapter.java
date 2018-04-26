package be.vdab.adapter.kalkoenadapter;

public class KalkoenAdapter implements Eend {

	private Kalkoen kalkoen;
	
	public KalkoenAdapter(Kalkoen kalkoen) {
		this.kalkoen = kalkoen;
	}
	
	@Override
	public void kwaak() {
		kalkoen.klok();
		
	}

	@Override
	public void vlieg() {
		
		kalkoen.vlieg();
				
	}
	
}

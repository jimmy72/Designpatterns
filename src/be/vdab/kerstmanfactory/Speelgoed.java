package be.vdab.kerstmanfactory;

import java.math.BigDecimal;

public abstract class Speelgoed {
	
	private BigDecimal prijs;
	
	public Speelgoed(BigDecimal prijs) {
		this.prijs = prijs;
	}

	public BigDecimal getPrijs() {
		return prijs;
	}
	
}

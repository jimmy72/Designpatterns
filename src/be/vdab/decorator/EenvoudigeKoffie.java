package be.vdab.decorator;

import java.math.BigDecimal;

public class EenvoudigeKoffie implements Koffie {

	@Override
	public BigDecimal getKost() {
		return BigDecimal.valueOf(3);
	}

	@Override
	public String getBereidingswijze() {
		return "maal de koffiebonen, laat kokend water over het poeder lopen";
	}

}

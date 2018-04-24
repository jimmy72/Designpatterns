package be.vdab.decorator;

import java.math.BigDecimal;

public class MetMelk extends KoffieDecorator {

	
	public MetMelk(Koffie koffie) {
		super(koffie);
	}
	
	@Override
	public BigDecimal getKost() {
		// TODO Auto-generated method stub
		return super.gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
	}

	@Override
	public String getBereidingswijze() {
		return super.gedecoreerdeKoffie.getBereidingswijze()
				+ ", warm de melk op, voeg de melk toe";
	}
	
}

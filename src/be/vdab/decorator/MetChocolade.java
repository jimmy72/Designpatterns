package be.vdab.decorator;

import java.math.BigDecimal;

public class MetChocolade extends KoffieDecorator  {
	
	public MetChocolade(Koffie koffie) {
		super(koffie);
	}
	
	@Override
	public BigDecimal getKost() {
		// TODO Auto-generated method stub
		return super.gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
	}

	@Override
	public String getBereidingswijze() {
		return super.gedecoreerdeKoffie.getBereidingswijze()
				+ ", schilfer de chocolade, voeg de schilfers toe";
	}
}

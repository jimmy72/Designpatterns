package be.vdab.kerstmanfactory;

import java.math.BigDecimal;

public enum Kerstman {
	INSTANCE;
	
	public Speelgoed getCadeau(int leeftijd) {
		if(leeftijd >= 0 && leeftijd <= 125) {
			if(leeftijd <= 5) {
				return new Pop(BigDecimal.valueOf(15));
			}else if(leeftijd < 12){
				return new Gezelschapsspel(BigDecimal.valueOf(40));
			}else {
				return new Boekenbon(BigDecimal.valueOf(60));
			}
		}else {
			throw new IllegalArgumentException();
		}
	}
}

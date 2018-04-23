package be.vdab.composite;

import java.util.ArrayList;
import java.util.List;

public class Project implements Kost {

	private final List<Kost> kosten = new ArrayList<>();
	
	@Override
	public double berekenKost() {
		double totaal = 0.0;
		for (Kost kost : kosten) {
			totaal += kost.berekenKost();
		}
		return totaal;
	}
	
	public void add(Kost kost) {
		kosten.add(kost);
	}

	
	
}

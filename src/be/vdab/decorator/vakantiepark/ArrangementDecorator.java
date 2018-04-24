package be.vdab.decorator.vakantiepark;

public abstract class ArrangementDecorator implements Arrangement {
	protected final Arrangement gedecoreerdArrangement;
	
	public ArrangementDecorator(Arrangement arrangement) {
		this.gedecoreerdArrangement = arrangement;
	}
}

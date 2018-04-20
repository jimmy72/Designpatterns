package be.vdab.coordinaatwiskunde;

public class Coordinaat {
	
	private int x;
	private int y;
	private int z;
	
	private Coordinaat(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	
	@Override
	public String toString() {
		return "Coordinaat [x=" + x + ", y=" + y + ", z=" + z + "]";
	}



	public static class CoordinaatBuilder {
		private int x;
		private int y;
		private int z;
		
		public CoordinaatBuilder metXCoordinaat(int x) {
			this.x = x;
			return this;
		}
		
		public CoordinaatBuilder metYCoordinaat(int y) {
			this.y = y;
			return this;
		}
		
		public CoordinaatBuilder metZCoordinaat(int z) {
			this.z = z;
			return this;
		}
		
		public Coordinaat maakCoordinaat() {
			return new Coordinaat(x, y, z);
		}
		
		
	}
}

package problem5;

public class Resistor extends Circuit {
	
	private double resistance;
	private double pottentialDiff;
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	public double getResistance() {
		return resistance;
	}
	
	public void applyPottentialDiff(double V) {
		pottentialDiff = V;
	}
	
	public double getPotentialDiff() {
		return pottentialDiff;
	}

}

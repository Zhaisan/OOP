package problem5;

public class Series extends Circuit {
	
	private Circuit resistor1;
	private Circuit resistor2;
	
	public Series (Circuit resistor1, Circuit resistor2) {
		this.resistor1 = resistor1;
		this.resistor2 = resistor2;
	}
	
	public double getResistance() {
		return resistor1.getResistance() + resistor2.getResistance();
	}
	
	public void applyPottentialDiff(double V) {
		
		double current = V / getResistance();
		resistor1.applyPottentialDiff(current * (resistor1.getResistance()/ getResistance()));
		resistor2.applyPottentialDiff(current * (resistor2.getResistance() / getResistance()));
	
	}
	
	public double getPotentialDiff() {
		return resistor1.getPotentialDiff() + resistor2.getPotentialDiff();
	}
}

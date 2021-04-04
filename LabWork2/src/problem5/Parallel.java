package problem5;

public class Parallel extends Circuit {
	
	private Circuit resistor1;
	private Circuit resistor2;

	public Parallel(Circuit resistor1, Circuit resistor2) {
		this.resistor1 = resistor1;
		this.resistor2 = resistor2;
	}
	
	public double getResistance() {
		return (resistor1.getResistance() * resistor2.getResistance()) / (resistor1.getResistance() + resistor2.getResistance());
	}
	
	public void applyPottentialDiff(double V) {
		resistor1.applyPottentialDiff(V);
		resistor2.applyPottentialDiff(V);
	}
	
	public double getPotentialDiff() {
		return resistor1.getPotentialDiff();
	}

}

package problem1;

public class Data {
	private double average;
	private double maximum;
	private int size;
	
	public Data() {
		average = 0;
		maximum = 0;
		size = 0;
	}
	public void addValue(double value) {
		if(size == 0) {
			average = value;
			maximum = value;
		}
		else {
			if(value > maximum) {
				maximum = value;
			}
			average = (average * size + value) / (size + 1);
		}
		size++;
	}
	
	public double getMaximum() {
		return maximum;
	}
	
	public double getAverage() {
		return average;
	}
	

}

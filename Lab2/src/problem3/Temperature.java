package problem3;

public class Temperature {
	private double temp;
	private char scale;
	
	Temperature(double temp, char scale){
		this.temp = temp;
		this.scale = scale;
	}
	Temperature(){
		this(0, 'C');
	}
	Temperature(double temp){
		this(temp, 'C');
	}
	Temperature(char scale){
		this(0, scale);
	}
	public double getTempC(){
		if(scale == 'C') return temp;
		return 5 * (temp - 32) / 9;
	}
	public double getTempF(){
		if(scale == 'F') return temp;
		return (9 * (temp / 5)) + 32;
	}
	public void setTemp(double temp){
		this.temp = temp;
	}
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void setBoth(double temp, char scale){
		this.setTemp(temp);
		this.setScale(scale);
	}
	public char getScale() {
		return scale;
	}
	
}

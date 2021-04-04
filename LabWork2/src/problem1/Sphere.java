package problem1;

public class Sphere extends Shape{
	
	private Double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public double volume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 2);
	}

	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	public String toString() {
		return ("Volume of sphere is " + volume() + ", Surface area of sphere is " + surfaceArea());
	}

}

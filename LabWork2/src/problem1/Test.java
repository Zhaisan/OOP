package problem1;

public class Test {

	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(3.0, 7.0);
		Sphere sphere = new Sphere(4.0);
		Cube cube = new Cube(5.0);
		
		System.out.println(cylinder.toString());
		System.out.println(sphere.toString());
		System.out.println(cube.toString());

	}

}

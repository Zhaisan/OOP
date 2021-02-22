package problem3;


public class Main {

	public static void main(String[] args) {
		Temperature temperature1 = new Temperature(23, 'C');
		System.out.println(temperature1.getTempF());
		Temperature temperature2 = new Temperature(-5, 'F');
		System.out.println(temperature2.getTempC());
		
	}

}

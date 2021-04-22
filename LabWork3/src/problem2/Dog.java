package problem2;

public class Dog implements Runnable{
	
	public void move() {
		System.out.println("Dog is moving");
	}
	
	public void run() {
		System.out.println("Dog is running");
	}

}

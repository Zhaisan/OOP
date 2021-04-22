package problem1;

public class Dog extends Animal implements Common {
	
	Dog(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println("Ok");
		
	}

	public void sleep() {
		System.out.println("Good night!");
		
	}

	public void sound() {
		System.out.println("gav-gav");
	}

	public String toString() {
		return super.toString();
	}

}

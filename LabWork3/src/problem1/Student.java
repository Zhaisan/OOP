package problem1;

public class Student extends Person implements Common{
	
	int id;

	Student(String name, String surname, int id) {
		super(name, surname);
		this.id = id;
	}

	public void eat() {
		System.out.println("I am going to canteen");
		
	}

	public void sleep() {
		System.out.println("Bye");
		
	}
	public String toString() {
		return super.toString() + " id: " + this.id;
	}

}

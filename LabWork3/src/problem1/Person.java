package problem1;

public abstract class Person implements Common {
	
	String name;
	String surname;
	
	Person(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public String toString() {
		return "First Name: " + this.name + " Last name: " + this.surname;
	}

}

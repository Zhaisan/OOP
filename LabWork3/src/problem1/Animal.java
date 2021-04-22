package problem1;

public abstract class Animal {
	
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age;
	}
	
	abstract void sound();

}

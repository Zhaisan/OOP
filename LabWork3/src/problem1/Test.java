package problem1;

public class Test {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Graf", 5);
		dog.sound();
		System.out.println(dog.toString());
		dog.eat();
		dog.sleep();
		
		Student student = new Student("Zhaisan", "Sarsengaliyev", 19030552);
		student.eat();
		System.out.println(student.toString());
		student.sleep();

	}

}

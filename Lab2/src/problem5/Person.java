package problem5;

public class Person {
	Gender gender;
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
	public String toString() {
		return gender.toString();
	}
}
enum Gender{ Boy, Girl }


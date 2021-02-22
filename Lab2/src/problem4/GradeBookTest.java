package problem4;
import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		Course c = new Course("Object-oriented Programming and Design", "CSCI2601");
		Student s1 = new Student("Zhaisan", 52);
		Student s2 = new Student("Ali", 81 );
		Student s3 = new Student("Zhansaya", 33);
		Student s4 = new Student("Askar", 66);
		Student s5 = new Student("Vadim", 12);
		
		GradeBook gb = new GradeBook();
		
		gb.addStudent(s1);
		gb.addStudent(s2);
		gb.addStudent(s3);
		gb.addStudent(s4);
		gb.addStudent(s5);
		
		System.out.println(gb.displayMessage(c));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, input grades for students:");
		for(int i = 0;i < gb.students.size();i++) {
			System.out.print(gb.students.get(i).toString());
			int points = input.nextInt();
			gb.students.get(i).setGrade(points);
		}
		
		System.out.println(gb.displayGradeReport());
		System.out.println("Grades distribution:");
		gb.gradeTotal();

	}

}

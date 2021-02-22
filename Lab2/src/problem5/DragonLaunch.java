package problem5;
import java.util.Vector;

public class DragonLaunch {
	
	public Vector<Person> students = new Vector<Person>();
	
	public void kidnap(Person p) {
		students.add(p);	
	}
	boolean willDragonEatOrNot() {
		int cnt = 0;
		
		for(int i = 0; i < students.size() - 1; i++) {
			if(students.get(i).getGender() == Gender.Boy && students.get(i + 1).getGender() == Gender.Girl) cnt++;
		}
		
		if(cnt * 2 == students.size()) return true;
		else return false;
	}

	public static void main(String[] args) {
		
		DragonLaunch launch = new DragonLaunch();
		Person p1 = new Person();
		p1.setGender(Gender.Boy);
		Person p2 = new Person();
		p2.setGender(Gender.Girl);
		Person p3 = new Person();
		p3.setGender(Gender.Girl);
		Person p4 = new Person();
		p4.setGender(Gender.Boy);
		
		launch.kidnap(p1);
		launch.kidnap(p2);
		launch.kidnap(p3);
		launch.kidnap(p4);
		
		if(launch.willDragonEatOrNot()) System.out.println("No dragon launch");
		else System.out.println("Dragon launch");

	}

}

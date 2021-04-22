package problem4;
import java.util.Comparator;

public class HireComparator implements Comparator<Employee> {
	
	public int compare (Employee p1, Employee p2) {
		return p1.getHireDate().compareTo(p2.getHireDate());
	}

}

package problem4;
import java.util.Date;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		

		ArrayList<Employee> emps = new ArrayList<Employee>();

		Employee w1 = new Employee("Ali", 100, new Date(1200000), "id1");
		Employee w2 = new Employee("Batyrlan", 500, new Date(100000), "id2");
		Employee w3 = new Employee("Rauan", 300, new Date(30000000), "id3");
		Manager w4 = new Manager("Karina", 1000, new Date(2500000), "id4");
		w4.addBonus(500);
		Manager w5 = new Manager("Almas", 1000, new Date(2500001), "id4");
		w5.addBonus(2000);
		
		emps.add(w1);
		emps.add(w2);
		emps.add(w3);
		emps.add(w4);
		emps.add(w5);
		
		NameComparator myNameComparator = new NameComparator();
		emps.sort(myNameComparator);
		
		for (Person w: emps) {
            System.out.println(w);
        }
		
		System.out.println();
		HireComparator myDateComparator = new HireComparator();
		emps.sort(myDateComparator);
		
		for (Person w: emps) {
            System.out.println(w);
        }
		
		
	}

}

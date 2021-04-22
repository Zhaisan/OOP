package problem4;
import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Object>, Cloneable {
	
	private Vector<Employee> team = new Vector<Employee>();
	private double bonus;
	
	public Manager () {}
	public Manager (String name, double salary, Date hireDate, String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
	}
	
	public void addBonus(double bonus) {
		this.bonus += bonus; 
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void addEmployeeToTeam(Employee worker) {
		team.add(worker);
	}
	
	public void removeEmployeeFromTeam(Employee worker) {
		team.remove(worker);
	}
	
	public String toString() {
		return super.toString() + ". Bonus: " + this.getBonus();
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Manager other = (Manager)o; 
		return (bonus == other.bonus);
	}
	
	public int compareTo(Object object) {
		Employee other = (Employee) object;
        if (this.getSalary() > other.getSalary())
            return 1;
        else if (this.getSalary() < other.getSalary())
            return -1;
        else {
        	Manager manager = (Manager) object;
        	if (this.getBonus() > manager.getBonus())
        		return 1;
        	else if (this.getBonus() < manager.getBonus())
        		return -1;
        }
		return 0;
    }
	
	public Object clone() throws CloneNotSupportedException {
		
		Manager clone = (Manager) super.clone();
		clone.team = (Vector<Employee>) team.clone();
		return clone;
	}
	
}

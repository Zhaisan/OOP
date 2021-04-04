package problem4;

public class CheckingAccount extends Account {
	
	private int cnt = 0;
	private static final int FREE_TRANSACTIONS = 1; 
	private static final double TRANSACTION_COST = 0.02;
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	public int getCounter() {
		return cnt;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		cnt++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		cnt++;
	}
	
	public void deductFee() {
		double sum = 0.0;
		sum = (cnt - FREE_TRANSACTIONS) * TRANSACTION_COST;
		this.withdraw(sum);
	}
	
	public String toString() {
		return super.toString() + "\nNumber of Transactions: " + cnt;
	}
}

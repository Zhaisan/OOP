package problem4;

public class Test {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		Account a1 = new Account(12200);
		SavingsAccount a2 = new SavingsAccount(9500, 0.05);
		CheckingAccount a3 = new CheckingAccount(8320);
		
		b.openAccount(a1);
		b.openAccount(a2);
		b.openAccount(a3);
		
		for (Account a: b.getAccounts()) {
			a.deposit(10000);
		}
		
		a1.transfer(2000, a3);
		b.update();
		for (Account a: b.getAccounts()) {
			a.print();
		}
		

	}

}

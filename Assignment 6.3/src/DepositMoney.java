
public class DepositMoney implements Runnable {
	double balance;
	BankAccount ba = new BankAccount();
	int i = 0;

	public DepositMoney(double balance2) {
		// TODO Auto-generated constructor stub
		balance = balance2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		deposit();
	}

	public void deposit() {

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Balance before deposit: Rs"+balance);
		balance += 1000;
		//System.out.println("*** Balance after deposit is: Rs" + balance + " ***");
		System.out.println("Balance after deposit: Rs"+balance);
		System.out.println("--------------------------------------");
		ba.setBalance(balance);
	}

}


public class WithdrawMoney extends Thread {
	double balance;
	BankAccount ba = new BankAccount();

	public WithdrawMoney(double balance2) {
		// TODO Auto-generated constructor stub
		balance = balance2;
	}

	@Override
	public void run() {
		withdraw();
		
	}

	public void withdraw() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (balance == 0) {
			System.out.println("Operation cannnot be performed ");
		} else {
			
			System.out.println("--------------------------------------");
			System.out.println("Balance before withdraw: Rs"+balance);
			balance -= 200;
			//System.out.println("***Balance after withdraw is: Rs" + balance + " ***");
			System.out.println("Balance after withdraw: Rs"+balance);
			System.out.println("--------------------------------------");
			ba.setBalance(balance);
		}
	}
}

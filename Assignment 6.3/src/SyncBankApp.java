import java.util.Scanner;

public class SyncBankApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dec = 1;
		BankAccount ba = new BankAccount();
		Thread t;
		while (dec != 0) {
			System.out.println("Enter your choice:");
			System.out.println("Press 1 to Deposit  Rs 1000");
			System.out.println("Press 2 to Withdraw Rs 200");
			System.out.println("Press 3 to Check Balance");
			int choice;
			// choice= sc.nextInt();
			System.out.print("Your Choice: " + (choice = sc.nextInt()));
			System.out.println();
			switch (choice) {
			case 1:
				SyncDepositMoney sdm = new SyncDepositMoney(ba.getBalance());
				t = new Thread(sdm);
				t.start();
				break;
			case 2:
				SyncWithdrawMoney swm = new SyncWithdrawMoney(ba.getBalance());
				swm.start();
				break;

			case 3:
				System.out.println("--------------------------------------");
				System.out.println("Final Balance is : Rs" + ba.getBalance());
				System.out.println("--------------------------------------");
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			// Thread.sleep(10000);
			System.out.println();
			System.out.println("Do you wish to again Withdraw/Deposit");
			System.out.println("Press 0 to exit and any other number to continue");
			dec = sc.nextInt();
			System.out.println("Your Decision: " + dec);
			System.out.println();
		}
		sc.close();
	}

}

/*
 ******************************************************************************
Output:
Enter your choice:
Press 1 to Deposit  Rs 1000
Press 2 to Withdraw Rs 200
Press 3 to Check Balance
1									//Deposit 1
Your Choice: 1

Do you wish to again Withdraw/Deposit
Press 0 to exit and any other number to continue
--------------------------------------
Balance before deposit: Rs10000.0
Balance after deposit: Rs11000.0
--------------------------------------
1
Your Decision: 1

Enter your choice:
Press 1 to Deposit  Rs 1000
Press 2 to Withdraw Rs 200
Press 3 to Check Balance
1										//Deposit 2
Your Choice: 1

Do you wish to again Withdraw/Deposit
Press 0 to exit and any other number to continue
1
Your Decision: 1

Enter your choice:
Press 1 to Deposit  Rs 1000
Press 2 to Withdraw Rs 200
Press 3 to Check Balance
--------------------------------------
Balance before deposit: Rs11000.0
Balance after deposit: Rs12000.0
--------------------------------------
2											//Withdraw 1
Your Choice: 2

Do you wish to again Withdraw/Deposit
Press 0 to exit and any other number to continue
1
Your Decision: 1

Enter your choice:
Press 1 to Deposit  Rs 1000
Press 2 to Withdraw Rs 200
Press 3 to Check Balance
--------------------------------------
Balance before withdraw: Rs12000.0
Balance after withdraw: Rs11800.0
--------------------------------------
1												//Deposit 3
Your Choice: 1

Do you wish to again Withdraw/Deposit
Press 0 to exit and any other number to continue
--------------------------------------
Balance before deposit: Rs11800.0
Balance after deposit: Rs12800.0
--------------------------------------
1
Your Decision: 1

Enter your choice:
Press 1 to Deposit  Rs 1000
Press 2 to Withdraw Rs 200
Press 3 to Check Balance
3
Your Choice: 3
--------------------------------------
Final Balance is : Rs12800.0
--------------------------------------

Do you wish to again Withdraw/Deposit
Press 0 to exit and any other number to continue
0
Your Decision: 0


***************************************************************************** 
*/

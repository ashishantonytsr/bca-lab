// Bank Account : Deposit & Withdrawal

import java.util.Scanner;

public class BankAccount {
	private float bankBalance;

	float getBankBalance(){
		return this.bankBalance;
	}

	void deposit(float amt){
		this.bankBalance += amt;
		System.out.println("Amount succesfully deposited.");
	}

	void withdraw(float amt){
		if(amt < bankBalance)
			this.bankBalance -= amt;
		else
			System.out.println("Not Enough Balance");
	}

	// main method
	public static void main(String[] args) {
		
		char proceed; float amt;
		Scanner s = new Scanner(System.in);
		BankAccount SavingsAccount = new BankAccount();

		do{
			System.out.println("\n\t1. Deposit\n\t2. Withdraw\n\t3. View Account Balance\n\t4. Exit...");
			int choice = s.nextInt();

			switch(choice){
				case 1: 
					System.out.print("Deposit Amount : ");
					amt = s.nextFloat();
					SavingsAccount.deposit(amt);
					break;
				case 2: 
					System.out.print("Enter the Amount : ");
					amt = s.nextFloat();
					SavingsAccount.withdraw(amt);
					break;
				case 3:
					System.out.println("Your account balance is "+ SavingsAccount.getBankBalance());
					break;
				case 4:
					System.out.println("\nThanks for using our service ... ");
					break;
				default:
					System.out.println("Invalid Option");
			}

			System.out.print("Do you wish to continue? (Y/N) : ");
			proceed = s.next().charAt(0);
		}while (proceed == 'y' || proceed == 'Y');
	}
}

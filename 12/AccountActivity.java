// Bank account : deposit & withdrawal

import java.util.Scanner;

// main class
public class AccountActivity
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		short accPin;	float amt; char proceed;

		System.out.print("Your Name : ");
		String name = s.nextLine();
		System.out.print("Create your PIN : ");
		accPin = s.nextShort();

		BankAccount SavingsAccount = new BankAccount(name, accPin);
		double accNo = SavingsAccount.getAccountNumber(accPin);

		do{
			System.out.println("\n\t0. User Info\n\t1. Deposit\n\t2. Withdraw\n\t3. View Account Balance\n\t4. Exit...");
			int choice = s.nextInt();
			if (choice < 3){
				System.out.print("Account PIN : ");
				accPin = s.nextShort();
			}

			switch(choice){
				case 0:
					SavingsAccount.getUserInfo(accNo, accPin);
					break;
				case 1: 
					System.out.print("Deposit Amount : ");
					amt = s.nextFloat();
					SavingsAccount.deposit(accNo, accPin, amt);
					break;
				case 2: 
					System.out.print("Enter the Amount : ");
					amt = s.nextFloat();
					SavingsAccount.withdraw(accNo, accPin, amt);
					break;
				case 3:
					System.out.println("Your account balance is "+ SavingsAccount.getBankBalance(accNo, accPin));
					break;
				case 4:
					System.out.println("\nThanks for using our service ... ");
					break;
				default:
					System.out.println("Invalid Option");
			}
			System.out.print("Press 'Y' to continue : ");
			proceed = s.next().charAt(0);

		}while (proceed == 'y' || proceed == 'Y');
	}
}
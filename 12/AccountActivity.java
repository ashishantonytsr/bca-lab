// Bank account : deposit & withdrawal

import java.io.*;
import java.lang.Math;
import java.util.Scanner;

final class BankAccount
{
	// class attributes
	private float bankBalance;
	private double accountNumber;
	private short accountPin;
	String accountHolder;

	// constructor
	BankAccount(String accountHolder, short accountPin){
		this.accountHolder = accountHolder;
		this.accountPin = accountPin;
		this.accountNumber = Math.random() * Math.pow(10,12);
		System.out.println("Account created succesfully\nYour account number is "+
		 String.format("%12.0f",this.accountNumber));
	}

	// class methods
	protected double getAccountNumber(short accountPin){
		if (!authenticate(accountPin))
			System.exit(0);
		return this.accountNumber;
	}

	private boolean authenticate(double accountNumber, short accountPin){
		if (accountNumber == this.accountNumber && accountPin == this.accountPin){
			return true;
		}
		System.out.println("Please check your Account number and PIN ");	
		return false;
	}

	// method overloading
	private boolean authenticate(short accountPin){
		if (accountPin == this.accountPin){
			return true;
		}
		System.out.println("Please check your PIN ");
		return false;
	}

	float getBankBalance(double accountNumber, short accountPin){
		if (authenticate(accountNumber, accountPin)){
			return this.bankBalance;
		}
		return 0;
	}

	void deposit(double accountNumber, short accountPin, float depositAmount){
		if (authenticate(accountNumber, accountPin)){
				this.bankBalance += depositAmount;
				System.out.println("Amount successfully deposited.");
		}
	}

	void withdraw(double accountNumber, short accountPin, float withdrawAmount){
		if (authenticate(accountNumber, accountPin)){
			if (withdrawAmount < bankBalance)
				this.bankBalance -= withdrawAmount;
			else
				System.out.println("Not Enough Balance");
		}
	}

	void getUserInfo(double accountNumber, short accountPin){
		if (authenticate(accountPin)){
			System.out.println("---\nAccount Number : " + String.format("%12.0f",this.accountNumber));
			System.out.println("Account Holder Name : " + this.accountHolder + "\n---");
		}
	}
}


// main class
public class AccountActivity
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		int choice;	short accPin;	float amt; char cont;

		System.out.print("Your Name : ");
		String name = s.nextLine();
		System.out.print("Create your PIN : ");
		accPin = s.nextShort();

		BankAccount SavingsAccount = new BankAccount(name, accPin);
		double accNo = SavingsAccount.getAccountNumber(accPin);

		do{
			System.out.println("\n\t0. User Info\n\t1. Deposit\n\t2. Withdraw\n\t3. View Account Balance\n\t4. Exit...");
			choice = s.nextInt();
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
			cont = s.next().charAt(0);

		}while (cont == 'y' || cont == 'Y');
	}
}
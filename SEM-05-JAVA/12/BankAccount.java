import java.lang.Math;

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

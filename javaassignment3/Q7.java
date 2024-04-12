
/*
 7. Create a simple bank management system.
Below is a brief explanation of each class and its functionality:
Account Class: Represents a bank account with attributes such as account
number and balance. It provides methods to withdraw, deposit, and get the
balance of the account.
Customer Class: Represents a bank customer with attributes like name, address,
mobile number, and an associated account. It provides methods for withdrawing,
depositing, getting account details, transferring money to another account, and
displaying customer details.
Bank Class: Represents a bank entity with a fixed maximum size of accounts and
customers,interest,size,MAX_SIZE. It provides methods to add an account,
remove an account, display account details, and update customer details.
Additionally, it has a method to apply interest to an account.
BankTester Class: This class serves as a test class where the main method is
implemented to simulate interactions with the bank system. It allows customers
to perform actions like displaying details, withdrawing money, depositing money,
and transferring funds between accounts.*/

package javaassignment3;

public class Q7 {  //Q7=Account
	

		protected String accNumber;
		protected double balance;

		public Q7(String accNumber, double balance) {
			this.accNumber = accNumber;
			this.balance = balance;
		}

		public void withdraw(double amount) {
			if (amount > balance) {
				System.out.println("Insufficient balance.");
			} else {
				balance -= amount;
				System.out.println("Withdrawn " + amount + " successfully. New balance: " + balance);
			}
		}

		public void deposit(double amount) {
			balance += amount;
			System.out.println("Deposited " + amount + " successfully. New balance: " + balance);
		}

		public double getBalance() {
			return balance;
		}
	}

	class SavingsAccount extends Q7 {
		private static final double INTEREST_RATE = 0.05;

		public SavingsAccount(String accNumber, double balance) {
			super(accNumber, balance);
		}

		public void applyInterest() {
			double interestAmount = balance * INTEREST_RATE;
			deposit(interestAmount);
			System.out.println("Interest applied. New balance: " + balance);
		}
	}

	class Customer {
		private String name;
		private String address;
		private String mobileNumber;
		private Q7 account;

		public Customer(String name, String address, String mobileNumber, Q7 account) {
			this.name = name;
			this.address = address;
			this.mobileNumber = mobileNumber;
			this.account = account;
		}

		public void withdraw(double amount) {
			account.withdraw(amount);
		}

		public void deposit(double amount) {
			account.deposit(amount);
		}

		public String getAccountDetails() {
			return "Account Number: " + account.accNumber + ", Balance: " + account.getBalance();
		}

		public void transfer(double amount, Q7 recipientAccount) {
			if (amount > account.getBalance()) {
				System.out.println("Insufficient balance.");
			} else {
				account.withdraw(amount);
				recipientAccount.deposit(amount);
				System.out.println("Transferred " + amount + " successfully to " + recipientAccount.accNumber);
			}
		}

		public String displayDetails() {
			return "Name: " + name + ", Address: " + address + ", Mobile Number: " + mobileNumber + ", "
					+ getAccountDetails();
		}
	}

	class Bank {
		private static final int MAX_SIZE = 100;

		protected Q7[] accounts;
		protected int size;

		public Bank() {
			accounts = new Q7[MAX_SIZE];
			size = 0;
		}

		public void addAccount(Q7 account) {
			if (size < MAX_SIZE) {
				accounts[size++] = account;
				System.out.println("Account added successfully.");
			} else {
				System.out.println("Cannot add more accounts. Bank capacity reached.");
			}
		}

		public void removeAccount(String accNumber) {
			for (int i = 0; i < size; i++) {
				if (accounts[i].accNumber.equals(accNumber)) {
					accounts[i] = accounts[size - 1];
					size--;
					System.out.println("Account removed successfully.");
					return;
				}
			}
			System.out.println("Account not found.");
		}

		public void displayAccountDetails() {
			for (int i = 0; i < size; i++) {
				System.out.println("Account Number: " + accounts[i].accNumber + ", Balance: " + accounts[i].getBalance());
			}
		}
	}
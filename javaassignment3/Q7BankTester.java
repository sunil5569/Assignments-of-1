package javaassignment3;

public class Q7BankTester {
		public static void main(String[] args) {
			Bank bank = new Bank();

			// Creating accounts and customers
			Q7 acc1 = new SavingsAccount("125", 1000);
			Q7 acc2 = new Q7("453", 500);
			Customer cust1 = new Customer("SUNIL", "Nashik", "54765474", acc1);
			Customer cust2 = new Customer("SUSHANT", "Pune", "798687576", acc2);

			bank.addAccount(acc1);
			bank.addAccount(acc2);

			System.out.println("Initial Customer Details:");
			System.out.println(cust1.displayDetails());
			System.out.println(cust2.displayDetails());

			cust1.deposit(400);
			cust1.withdraw(200);

			cust1.transfer(300, acc2);

			if (acc1 instanceof SavingsAccount) {
				((SavingsAccount) acc1).applyInterest();
			}

			System.out.println("Updated Customer Details:");
			System.out.println(cust1.displayDetails());
			System.out.println(cust2.displayDetails());

			System.out.println("All Account Details:");
			bank.displayAccountDetails();
		}
	}

/*
Output:
Account added successfully.
Account added successfully.
Initial Customer Details:
Name: SUNIL, Address: Nashik, Mobile Number: 54765474, Account Number: 125, Balance: 1000.0
Name: SUSHANT, Address: Pune, Mobile Number: 798687576, Account Number: 453, Balance: 500.0
Deposited 400.0 successfully. New balance: 1400.0
Withdrawn 200.0 successfully. New balance: 1200.0
Withdrawn 300.0 successfully. New balance: 900.0
Deposited 300.0 successfully. New balance: 800.0
Transferred 300.0 successfully to 453
Deposited 45.0 successfully. New balance: 945.0
Interest applied. New balance: 945.0
Updated Customer Details:
Name: SUNIL, Address: Nashik, Mobile Number: 54765474, Account Number: 125, Balance: 945.0
Name: SUSHANT, Address: Pune, Mobile Number: 798687576, Account Number: 453, Balance: 800.0
All Account Details:
Account Number: 125, Balance: 945.0
Account Number: 453, Balance: 800.0
*/

package assignment2;

public class MainQ9
{
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(101, 0.05);
		savingsAccount.deposit(1000);
		savingsAccount.addInterest();
		savingsAccount.printAccountDetails();

		HousingLoan housingLoan = new HousingLoan(201, 0.08, 20);
		housingLoan.deposit(200000);
		housingLoan.withdraw(50000);
		housingLoan.addInterest();
		housingLoan.printAccountDetails();
		housingLoan.printLoanTerms();
	}
}
/*
Output:
Deposited 1000.0 into Account 101
Interest added to Account 101
Account Number: 101
Balance: 1050.0
Deposited 200000.0 into Account 201
Withdrawn 50000.0 from Account 201
Interest added to Loan Account 201
Account Number: 201
Balance: 162000.0
Loan Account Number: 201
Loan Term: 20 years*/
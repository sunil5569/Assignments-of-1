/*6. Create a SavingsAccount class. Use a static data member annual Interest Rate to store the annual interest rate for each of the savers. Each member of the class contains a private data member savingsBalance indicating the amount
the saver currently has on deposit. Provide member function calculateMonthlyInterest() that calculates the monthlyinterest by multiplying the balance by annualInterestRate divided by 12; this interest should be added to savingsBalance. Provide a static member functionmodifyInterestRate() that sets the static annualInterestRate to a new value. Write a driver program to
test class SavingsAccount. Instantiate two different objects of classSavingsAccount, saver1 and saver2, with balances of
2000.00 and 3000.00,respectively. Set the annualInterestRate to 3 percent. Then calculate the monthlyinterest and print the new balances for each of the savers. Then set
theannualInterestRate to 4 percent, calculate the next months interest and print the new balances for each of the savers.
*/
package javaassignment3;

public class Q6 { //Q6=SavingsAccount

    private double savingsBalance;
    private static double annualInterestRate;

    public Q6(double initialBalance) {
        savingsBalance = initialBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
    	Q6 saver1 = new Q6(2000.00);
    	Q6 saver2 = new Q6(3000.00);

        modifyInterestRate(0.03);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New balance for saver1: " + saver1.getSavingsBalance());
        System.out.println("New balance for saver2: " + saver2.getSavingsBalance());

        modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("New balance for saver1: " + saver1.getSavingsBalance());
        System.out.println("New balance for saver2: " + saver2.getSavingsBalance());
    }
}

/*
 OUTPUT:
New balance for saver1: 2005.0
New balance for saver2: 3007.5
New balance for saver1: 2011.6833333333334
New balance for saver2: 3017.525
*/

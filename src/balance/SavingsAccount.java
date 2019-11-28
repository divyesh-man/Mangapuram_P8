package savings;

public class SavingsAccount {

    // private instance variable savingsBalance indicating the amount the saver currently has on deposit.
    private double savingsBalance;

    // Use a static variable annualInterestRate to store the annual
    // interest rate for all account holders.
    private static int annualInterestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // method calculateMonthlyInterest to calculate the monthly interest by multiplying the
    // savingsBalance by annualInterestRate divided by 12 � this interest should be added to savingsBalance.
    public double calculateMonthlyInterest() {
        return ((savingsBalance * annualInterestRate ) / 12);
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

}

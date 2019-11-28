package balance;

public class SavingsAccountTest {


    public static void main(String[] args) {

        int rate = 4;
        // Instantiate two savingsAccount objects, saver1 and saver2,
        // with balances of $2000.00 and $3000.00, respectively.
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        modifyInterestRate(rate);
        for(int i = 0; i <= 1; i++) {
            // Set annualInterestRate
            System.out.printf("Annual Interest Rate at %d%%\n", rate);
            //then calculate the monthly interest for each of 12 months
            System.out.println("-----------------------------------------------");
            System.out.println("| Month | Saver 01 Balance | Saver 02 Balance |");
            System.out.println("-----------------------------------------------");
            String c = "|";
            for(int month = 1; month < 13; month++) {
                double balance1 = (saver1.calculateMonthlyInterest() + saver1.getSavingsBalance());
                double balance2 = (saver2.calculateMonthlyInterest() + saver2.getSavingsBalance());
                System.out.printf("%s   %02d  %s   %13.2f  %s   %13.2f  %s\n", c,
                        month, c, balance1, c, balance2, c );
                saver1.setSavingsBalance(balance1);
                saver2.setSavingsBalance(balance2);
            }
            System.out.println("-----------------------------------------------");
            rate++;
            modifyInterestRate(rate);
        }

    }

    // Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
    public static void modifyInterestRate(int newRate){
        SavingsAccount.setAnnualInterestRate(newRate);
    }

}

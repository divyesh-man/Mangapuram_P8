package balance;

import java.util.*;

import java.io.IOException;

import java.text.DecimalFormat;

class AccountSavings {

    public static double annualInterestRate;

    double savingsBalance;

    AccountSavings(double balance) throws IOException{

        if(balance>0.0)

            savingsBalance = balance;

        else

            throw new IOException("Balance must be greater than zero");

    }

    public void calculateMonthlyInterest(){

        savingsBalance += savingsBalance*annualInterestRate/12.0;

    }

    public static void modifyInterestRate(double interestRate) throws IOException{

        if(interestRate>0.0)

            annualInterestRate = (interestRate/100.0);

        else

            throw new IOException("Interest Rate must be greater than zero");

    }

    public String toString(){

        DecimalFormat formatter = new DecimalFormat("$#0.00");

        return formatter.format(savingsBalance);

    }

}

public class AccountSavingsTest{

    public static void main(String[] args) throws IOException{

        AccountSavings as1 = new AccountSavings(2000);

        AccountSavings as2 = new AccountSavings(3000);

        AccountSavings.modifyInterestRate(4);

        System.out.println("Monthly balances for one year at "+AccountSavings.annualInterestRate);

        System.out.println("Balances");

        System.out.printf("%-10s %10s %10s\n", " ", "Saver 1", "Saver 2");

        System.out.printf("%-10s %10s %10s\n", "Base", as1, as2);

        for(int i=1; i<=12; i++){

            as1.calculateMonthlyInterest();

            as2.calculateMonthlyInterest();

            System.out.printf("Month-%d: %10s %10s\n", i, as1, as2);

        }

    }

}
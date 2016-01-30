// CURRENT ACCOUNT SUBCLASS
// This class calculates the details, withdrawals, deposits for current accounts
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 04/12/2015

import java.math.*;

public class CurrentAccount extends BankAccount{

// CLASS VARIABLES

    protected boolean debit;
    protected double overdraftLimit;
    protected double fee;

// CONSTRUCTOR METHOD

    public CurrentAccount(boolean inputDebit, double inputOverdraftLimit, double inputFee, String inputHolderName, int inputAccountNumber, double inputBalance, double inputDeposit, double inputWithdraw){

      super(inputHolderName, inputAccountNumber, inputBalance, inputDeposit, inputWithdraw);
      debit = inputDebit;
      overdraftLimit = inputOverdraftLimit;
      fee = inputFee;

    }

 // METHODS

    public void printDetails(){

      System.out.print(" Type of account: Current \n");
      System.out.print(" Debit card allowed? "+ debit +" \n");
      System.out.printf(" Overdraft limit: %.2f \n", overdraftLimit);
      System.out.printf(" The fee: %.2f \n", fee);

    }
    public void withdrawMoney(){

        double temp = balance-withdraw;
        System.out.print("\n Withdrawing the money... \n ");
        if(Math.abs(temp) > overdraftLimit && temp < 0){

          System.out.println("   ERROR: The amount of money exceeds the overdraft limit. Can't withdraw money.");
          System.out.printf("\n The balance for %s is %.2f \n ", holderName, balance);

        } else{

          balance = temp;
          System.out.printf("\n The balance for %s is %.2f \n ", holderName, balance);
          applyFee();

        }

    }
    private void applyFee(){

        double temp = balance-fee;

        System.out.print("\n Applying the fee... \n ");

        if(Math.abs(temp) > overdraftLimit && temp < 0){

          System.out.println("  WARNING: The balance exceeded the overdraft limit.");

        }

        balance = temp;
        System.out.printf("\n The balance for %s is %.2f \n ", holderName, balance);

    }

}

// DEPOSIT ACCOUNT SUBCLASS
// This class calculates the details, withdrawals, deposits for deposit accounts
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 04/12/2015

import java.math.*;

public class DepositAccount extends BankAccount{

// CLASS VARIABLES

    public double interestRate;

// CONSTRUCTOR METHOD

    public DepositAccount(double inputInterestRate, String inputHolderName, int inputAccountNumber, double inputBalance, double inputDeposit, double inputWithdraw){

      super(inputHolderName, inputAccountNumber, inputBalance, inputDeposit, inputWithdraw);
      interestRate = inputInterestRate;

    }

 // METHODS

    public void printDetails(){

      System.out.print(" Type of account: Deposit \n");
      System.out.printf(" Interest rate: %.2f \n", interestRate);

    }

}

// ADVANTAGE ACCOUNT SUBCLASS
// This class calculates the details, withdrawals, deposits for advantage accounts
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 04/12/2015

import java.math.*;

public class AdvantageAccount extends CurrentAccount{

// CONSTANTS

    private static final boolean DEBIT = true;
    private static final double OVERDRAFT = 500.00;
    private static final double FEE = 50.00;

// CONSTRUCTOR METHOD

    public AdvantageAccount(String inputHolderName, int inputAccountNumber, double inputBalance, double inputDeposit, double inputWithdraw){

      super(DEBIT, OVERDRAFT, FEE, inputHolderName, inputAccountNumber, inputBalance, inputDeposit, inputWithdraw);

    }

// METHODS

    // This method returns whether the travel insurance is free or not
    // Override the method of CurrentAccount class
    public boolean returnInsurance(){

      return true;

    }
    public void printDetails(){

      System.out.print(" Type of account: Advantage \n");
      System.out.print(" Debit card allowed? "+ DEBIT +" \n");
      System.out.printf(" Overdraft limit: %.2f \n", OVERDRAFT);
      System.out.printf(" The fee: %.2f \n", FEE);

    }

}

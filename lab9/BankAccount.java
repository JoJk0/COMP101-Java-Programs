// BANK ACCOUNT SUPERCLASS
// This class simulates basic bank account operations: calculates the deposit and withdrawal
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 04/12/2015

import java.math.*;

public class BankAccount{

// CLASS VARIABLES

    protected String holderName;
    protected int accountNumber;
    protected double balance;
    protected double deposit;
    protected double withdraw;
    protected boolean freeInsurance;

// CONSTRUCTOR METHOD

    public BankAccount(String inputHolderName, int inputAccountNumber, double inputBalance, double inputDeposit, double inputWithdraw){

        holderName = inputHolderName;
        accountNumber = inputAccountNumber;
        balance = inputBalance;
        deposit = inputDeposit;
        withdraw = inputWithdraw;
        freeInsurance = returnInsurance();

    }

 // METHODS

    public void printBasics(){

      System.out.printf("\n\n %s's account \n", holderName);
      System.out.printf(" ---------------------------------------\n");
      System.out.printf(" Account number: %d \n", accountNumber);
      System.out.printf(" Balance: %.2f \n", balance);
      System.out.print(" Free travel insurance? "+ freeInsurance +" \n");

    }
    public void depositMoney(){

        double temp = balance+deposit;
        System.out.print("\n Depositing the money... \n ");
        balance = temp;
        System.out.printf("\n The balance for %s is %.2f \n ", holderName, balance);

    }
    public void withdrawMoney(){

        double temp = balance-withdraw;
        System.out.print("\n Withdrawing the money... \n ");
        if(temp < 0){

          System.out.println("\n   ERROR: You don't have enough money to withdraw this amount.");

        } else{

          balance = temp;

        }
        System.out.printf("\n The balance for %s is %.2f \n ", holderName, balance);

    }
    // This method returns whether the travel insurance is free or not
    // It is to be overriden by AdvantageAccount one while it is called
    public boolean returnInsurance(){

      return false;

    }

}

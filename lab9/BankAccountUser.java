// BANK ACCOUNT USER CLASS
// This is user class for BankAccount class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 04/12/2015

import java.util.*;

public class BankAccountUser{

    // Constructor method
    public static void main(String[] args){

      // Hardcoded constants

      final double OVERDRAFT = 200.00;
      final double FEE = 15.00;
      final boolean DEBIT = false;
      final double INTERESTRATE = 0.3;
      final String NAME[] = {"John Smith", "Annie Smith", "David Jones"};
      final int ID[] = {201123451, 522531423, 201024628};
      final double BALANCE = 0;

      // NOTIFICATION CONSTANTS

        final String M_ERROR = "   ERROR: You entered incorrect data (out of range). Try again.\n";

        // Input data

        Scanner input = new Scanner(System.in);

        System.out.println(" ======= BANK ACCOUNT + EXTENDED =======");
        System.out.println(" This program simulates the basic bank account system. \n \n");

        // Deposit
        double deposit;
        int iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print(" Give me the amount of money to deposit: ");
          deposit = input.nextDouble();
          System.out.println();
          iterator++;
        } while(deposit <= 0);

        // Withdrawal
        double withdrawal;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print(" Give me the amount of money to withdraw: ");
          withdrawal = input.nextDouble();
          System.out.println();
          iterator++;
        } while(withdrawal <= 0);

        // Instantiate
        CurrentAccount firstName = new CurrentAccount(DEBIT, OVERDRAFT, FEE, NAME[0], ID[0], BALANCE, deposit, withdrawal);
        DepositAccount secondName = new DepositAccount(INTERESTRATE, NAME[1], ID[1], BALANCE, deposit, withdrawal);
        AdvantageAccount thirdName = new AdvantageAccount(NAME[2], ID[2], BALANCE, deposit, withdrawal);

        // Print

        firstName.printBasics();
        firstName.printDetails();
        firstName.depositMoney();
        firstName.withdrawMoney();

        secondName.printBasics();
        secondName.printDetails();
        secondName.depositMoney();
        secondName.withdrawMoney();

        thirdName.printBasics();
        thirdName.printDetails();
        thirdName.depositMoney();
        thirdName.withdrawMoney();

    }
}

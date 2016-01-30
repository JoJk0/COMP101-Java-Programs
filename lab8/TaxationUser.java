// TAXATION MAIN CLASS
// This is user class for Taxation class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 25/11/2015

import java.util.*;

public class TaxationUser{

    // Constructor method
    public static void main(String[] args){

      // NOTIFICATION CONSTANTS

        final String M_GROSS_SALARY = "The gross salary is %.2f pounds.\n";
        final String M_NET_SALARY = "The net salary is %.2f pounds.\n";
        final String M_TAX = "The tax is %.2f pounds to pay.\n";
        final String M_ERROR = "\n You entered incorrect data \n";
        final int YEARS_NUM = 5;

        // Input data

        Scanner input = new Scanner(System.in);

        System.out.println("======= TAXATION =======");
        System.out.println("This program calculates the gross pay, net pay and tax dependent on the amount of money. \n \n");

        // Starting Salary
        int startingSalary;
        int iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the starting salary (>0): ");
          startingSalary = input.nextInt();
          System.out.println();
          iterator++;
        } while(startingSalary <= 0);

        // Yearly percantage
        int yearlyPercentage;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the yearly percentage in % (0-100): ");
          yearlyPercentage = input.nextInt();
          System.out.println();
        } while(yearlyPercentage < 0 || yearlyPercentage > 100);

        // Instantiate
        Taxation tax = new Taxation(startingSalary, yearlyPercentage, YEARS_NUM, 20, 50, 30000);

        // Print gross salary, net salary and tax
        tax.printBasics();

    }
}

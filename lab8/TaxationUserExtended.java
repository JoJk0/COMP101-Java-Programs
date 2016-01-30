// TAXATION EXTENDED MAIN CLASS
// This is user class for Taxation class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 25/11/2015

import java.util.*;

public class TaxationUserExtended{

  // METHODS

    // Compares and prints the total gross salary, total net salary and total tax from two tax schemes
    private static void compareThings(Taxation instance1, Taxation instance2, int yearsNum){

      double grossDiff = instance1.calculateTotalGrossSalary() - instance2.calculateTotalGrossSalary();
      double netDiff = instance1.calculateTotalNetSalary() - instance2.calculateTotalNetSalary();
      double taxDiff = instance1.calculateTotalTax() - instance2.calculateTotalTax();

      System.out.printf("\nTotal gross salary difference between scheme 1 and 2 is %.2f.\n", grossDiff);
      System.out.printf("Total net salary difference between scheme 1 and 2 is %.2f.\n", netDiff);
      System.out.printf("Total tax difference between scheme 1 and 2 is %.2f.\n", taxDiff);

    }

    // Main method

    public static void main(String[] args){

      // NOTIFICATION CONSTANTS

        final String M_TOTAL_GROSS_SALARY = "\nThe total gross salary is %.2f pounds.\n";
        final String M_TOTAL_NET_SALARY = "The total net salary is %.2f pounds.\n";
        final String M_TOTAL_TAX = "The total tax is %.2f pounds.\n";
        final String M_ERROR = "\n You entered incorrect data \n";

        // Input data

        Scanner input = new Scanner(System.in);

        System.out.println("======= TAXATION EXTENDED =======");
        System.out.println("This program calculates the gross pay, net pay, tax and sums each of them from scheme 1 and scheme 2 dependent on the amount of money. \n \n");

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

        // Number of years
        int yearsNum;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the number of years (>1): ");
          yearsNum = input.nextInt();
          System.out.println();
        } while(yearsNum < 2);

        // Low tax rate for scheme 1
        double lowTaxRate1;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the first low tax rate in % (0-100): ");
          lowTaxRate1 = input.nextDouble();
          System.out.println();
        } while(lowTaxRate1 < 0 || lowTaxRate1 > 100);

        // High tax rate for scheme 1
        double highTaxRate1;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the first high tax rate in % (0-100): ");
          highTaxRate1 = input.nextDouble();
          System.out.println();
        } while(highTaxRate1 < 0 || highTaxRate1 > 100);

        // Boundary limit for scheme 1
        int boundaryLimit1;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the first boundary limit (>0): ");
          boundaryLimit1 = input.nextInt();
          System.out.println();
        } while(boundaryLimit1 < 0);

        // Low tax rate for scheme 2
        double lowTaxRate2;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the second low tax rate in % (0-100): ");
          lowTaxRate2 = input.nextDouble();
          System.out.println();
        } while(lowTaxRate2 < 0 || lowTaxRate2 > 100);

        // High tax rate for scheme 2
        double highTaxRate2;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the second high tax rate in % (0-100): ");
          highTaxRate2 = input.nextDouble();
          System.out.println();
        } while(highTaxRate2 < 0 || highTaxRate2 > 100);

        // Boundary limit for scheme 2
        int boundaryLimit2;
        iterator = 0;
        do{
          if(iterator != 0) System.out.println(M_ERROR);
          System.out.print("Give me the second boundary limit (>0): ");
          boundaryLimit2 = input.nextInt();
          System.out.println();
        } while(boundaryLimit2 < 0);

        // Instantiate 2 objects
        Taxation tax1 = new Taxation(startingSalary, yearlyPercentage, yearsNum, lowTaxRate1, highTaxRate1, boundaryLimit1);
        Taxation tax2 = new Taxation(startingSalary, yearlyPercentage, yearsNum, lowTaxRate2, highTaxRate2, boundaryLimit2);

        // Print gross salary, net salary, tax and totals from scheme 1
        System.out.println("\n--- Tax scheme 1 ---");
        tax1.printBasics();
        System.out.printf(M_TOTAL_GROSS_SALARY, tax1.calculateTotalGrossSalary());
        System.out.printf(M_TOTAL_NET_SALARY, tax1.calculateTotalNetSalary());
        System.out.printf(M_TOTAL_TAX, tax1.calculateTotalTax());

        // Print gross salary, net salary, tax and totals from scheme 2
        System.out.println("\n--- Tax scheme 2 ---");
        tax2.printBasics();
        System.out.printf(M_TOTAL_GROSS_SALARY, tax2.calculateTotalGrossSalary());
        System.out.printf(M_TOTAL_NET_SALARY, tax2.calculateTotalNetSalary());
        System.out.printf(M_TOTAL_TAX, tax2.calculateTotalTax());

        // Compare total gross salary, total net salary and total tax from two tax schemes
        compareThings(tax1, tax2, yearsNum);

    }
}

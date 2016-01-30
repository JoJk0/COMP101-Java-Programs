// TAXATION CLASS
// This class calculates the the net salary, gross salary and the tax amount deduced from the salary.
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 25/11/2015

import java.math.*;

public class Taxation{

// CONSTANTS

    private final double LOW_TAX;
    private final double HIGH_TAX;
    private final int THRESHOLD;

// CLASS VARIABLES

    private double[][] retArray;
    private int yearsNum;

// CONSTRUCTOR METHOD

    public Taxation(int theSalary, int theYear, int theYearsNum, double theLowTaxRate, double theHighTaxRate, int theBoundaryLimit){
      double tax;

      // Initialize the constants
      LOW_TAX = theLowTaxRate;
      HIGH_TAX = theHighTaxRate;
      THRESHOLD = theBoundaryLimit;

      // Initialize variables
      retArray = new double[theYearsNum][3];
      yearsNum = theYearsNum;

      // Fill the array with data
      for(int i=0; i < theYearsNum; i++){

          if(i == 0){

            retArray[i][0] = theSalary;

          } else{
            theSalary = theSalary+(theSalary*theYear/100);
            retArray[i][0] = theSalary;
          }
          if(theSalary <= THRESHOLD){

              tax = theSalary*LOW_TAX/100;
              retArray[i][2] = tax;

          } else{

              tax = (THRESHOLD*LOW_TAX/100) + ((theSalary - THRESHOLD)*HIGH_TAX/100);
              retArray[i][2] = tax;

          }
          retArray[i][1] = theSalary-tax;


      }
    }

 // METHODS

    public double displayGrossSalary(int tYear){

        return retArray[tYear][0];

    }
    public double displayNetSalary(int tYear){

        return retArray[tYear][1];

    }
    public double displayTax(int tYear){

        return retArray[tYear][2];

    }
    public double calculateTotalGrossSalary(){

      double totalGrossSalary = 0;
      for(int i = 0; i < yearsNum; i++){

        totalGrossSalary = totalGrossSalary + displayGrossSalary(i);

      }
      return totalGrossSalary;

    }
    public double calculateTotalNetSalary(){

      double totalNetSalary = 0;
      for(int i = 0; i < yearsNum; i++){

        totalNetSalary = totalNetSalary + displayNetSalary(i);

      }
      return totalNetSalary;

    }
    public double calculateTotalTax(){

      double totalTax = 0;
      for(int i = 0; i < yearsNum; i++){

        totalTax = totalTax + displayTax(i);

      }
      return totalTax;

    }
    // Prints the gross salary, net salary and the tax
    public void printBasics(){

        for(int i = 0; i < yearsNum; i++){

          System.out.printf("\nYear %d\n", i+1);
          System.out.printf("The gross salary is %.2f pounds.\n", displayGrossSalary(i));
          System.out.printf("The net salary is %.2f pounds.\n", displayNetSalary(i));
          System.out.printf("The tax is %.2f pounds to pay.\n", displayTax(i));

        }

    }

}

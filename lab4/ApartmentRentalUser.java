// APARTMENT RENTAL USER CLASS
// This is user class for ApartmentRental class.
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 27/10/2015

import java.util.*;
import java.math.*;

public class ApartmentRentalUser{
    
    // Main method
    
    public static void main(String[] args){
        
        // Input data
        
        System.out.println("======= APARTMENT RENTAL ======= \n");
        System.out.println("This class calculates and displays the area and cost of the floor, service charge, cost before VAT, VAT and total cost of apartment for each type (basic / smart / luxury) after giving a width and height of the apartment. \n \n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give me width of your apartment in metres: ");
        
        double width = input.nextDouble();
        width = Math.abs(width);
        
        System.out.println();
        System.out.println("Give me length of your apartment in metres: ");
        double height = input.nextDouble();
        height = Math.abs(height);
        System.out.println();
        
        // Values of cost per square meter for each type of apartment        
        
        double basic = 6.50;
        double smart = 9.00;
        double luxury = 13.50;
        
        // Create 3 instances of class ApartmentRental for each 
        
        ApartmentRental rent = new ApartmentRental(width, height, basic);
        ApartmentRental rentSmart = new ApartmentRental(width, height, smart);
        ApartmentRental rentLuxury = new ApartmentRental(width, height, luxury);
        
         // Main printing block
        
        System.out.println("You gave me dimensions so I would like to calculate the costs for you: \n \n");
        System.out.println("The floor area is: "+rent.calculateFloorArea()+"m2. \n \n");
        
        // Basic
        
        System.out.println("For BASIC apartment the costs are as follows:");
        System.out.println("========================================================================= \n");
        System.out.printf("The floor area cost is: %.2f pounds. \n", rent.calculateAreaCost());
        System.out.printf("The service charge is: %.2f pounds. \n", rent.calculateServiceCharge());
        System.out.printf("The cost before VAT is: %.2f pounds. \n", rent.calculateCostBeforeVAT());
        System.out.printf("The amount of VAT charged: %.2f pounds. \n", rent.calculateVAT());
        System.out.println("\n ------------------------------------------------- \n");
        System.out.printf("TOTAL COST OF APARTMENT: %.2f pounds. \n \n", rent.calculateTotalCost());     
        
        // Smart
        
        System.out.println("For SMART apartment the costs are as follows:");
        System.out.println("========================================================================= \n");
        System.out.printf("The floor area cost is: %.2f pounds. \n", rentSmart.calculateAreaCost());
        System.out.printf("The service charge is: %.2f pounds. \n", rentSmart.calculateServiceCharge());
        System.out.printf("The cost before VAT is: %.2f pounds. \n", rentSmart.calculateCostBeforeVAT());
        System.out.printf("The amount of VAT charged: %.2f pounds. \n", rentSmart.calculateVAT());
        System.out.println("\n ------------------------------------------------- \n");
        System.out.printf("TOTAL COST OF APARTMENT: %.2f pounds. \n \n", rentSmart.calculateTotalCost());    
        
        // Luxury
        
        System.out.println("For LUXURY apartment the costs are as follows:");
        System.out.println("========================================================================= \n");
        System.out.printf("The floor area cost is: %.2f pounds. \n", rentLuxury.calculateAreaCost());
        System.out.printf("The service charge is: %.2f pounds. \n", rentLuxury.calculateServiceCharge());
        System.out.printf("The cost before VAT is: %.2f pounds. \n", rentLuxury.calculateCostBeforeVAT());
        System.out.printf("The amount of VAT charged: %.2f pounds. \n", rentLuxury.calculateVAT());
        System.out.println("\n ------------------------------------------------- \n");
        System.out.printf("TOTAL COST OF APARTMENT: %.2f pounds. \n", rentLuxury.calculateTotalCost());
        
    }
    
}
// TOLL CHARGE MAIN CLASS
// This is user class for TollCharge class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 10/11/2015

import java.util.*;

public class TollChargeUserExtended{

    // Methods

    private static boolean secure(int wheelNum, double axleHeight, int axleNum, int daysNum, int nightsNum){

        boolean error = false;
        if(wheelNum < 2 || axleHeight <= 0 || axleNum < 2 || daysNum <= 0 || nightsNum <= 0){ error = true; }
        return error;

    }

    // Main method

    public static void main(String[] args){

        // Input data

        Scanner input = new Scanner(System.in);

        System.out.println("======= TOLL CHARGE EXTENDED =======");
        System.out.println("This program calculates the the toll charge of the vehicle dependent on its type. \n \n");

        System.out.print("Give me the number of wheels: ");
            int wheelNum = input.nextInt();
        System.out.println();

        System.out.print("Give me the height at the first axle: ");
            double axleHeight = input.nextDouble();
        System.out.println();

        System.out.print("Give me the number of axles: ");
            int axleNum = input.nextInt();
        System.out.println();

        System.out.print("How many times on days will you use this toll checkout? ");
            int daysNum = input.nextInt();
        System.out.println();

        System.out.print("How many times on nights will you use this toll checkout? ");
            int nightsNum = input.nextInt();
        System.out.println();

        boolean err = false;

        err = secure(wheelNum, axleHeight, axleNum, daysNum, nightsNum);

        if(err == false){

            TollCharge toll = new TollCharge(wheelNum, axleHeight, axleNum, false, daysNum, nightsNum);
            double passCost = toll.checkPassCost();
            double totalCost = toll.checkTotalCost();
            double daysCost = toll.checkDaysCost();
            double nightsCost = toll.checkNightsCost();
            System.out.printf("\n The cost for %d journeys on days without pass is %.2f pounds \n", daysNum, daysCost);
            System.out.printf("\n The cost for %d journeys on nights without pass is %.2f pounds \n", nightsNum, nightsCost);
            System.out.printf("\n The total cost without pass is %.2f pounds \n", totalCost);
            System.out.printf("\n Your vehicle is classified as %s (CLASS %d) so the cost of the monthly pass is %.2f pounds.\n", toll.displayClassName(), toll.displayClassNumber(), passCost);
            if(totalCost > passCost){

                System.out.print("\n It is better to buy a pass - you will save money! \n");

            } else if(totalCost == passCost){

                System.out.print("\n There is no difference between cost of pass and total cost without pass. \n");

            } else{

                System.out.print("\n It is better not to buy a pass. \n");

            }

        } else{

            System.out.println("You entered incorrect data.");

        }


    }
}

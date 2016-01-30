// TOLL CHARGE MAIN CLASS
// This is user class for TollCharge class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 10/11/2015

import java.util.*;

public class TollChargeUser{

    // Methods

    private static boolean secure(int wheelNum, double axleHeight, int axleNum, char night){

        boolean error = false;
        if(wheelNum < 2 || axleHeight <= 0 || axleNum < 2 || (night != 'y' && night != 'n')){ error = true; }
        return error;

    }

    // Main method

    public static void main(String[] args){

        // Input data

        Scanner input = new Scanner(System.in);

        System.out.println("======= TOLL CHARGE =======");
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

        System.out.print("Are you going at night? (y/n): ");
            char night = input.next().charAt(0);
        System.out.println();

        boolean err = false;

        err = secure(wheelNum, axleHeight, axleNum, night);
        if(err == false){

            boolean nightBool = false;
            switch(night){

                case 'y':
                    nightBool = true;
                break;
                case 'n':
                    nightBool = false;
                break;

            }
            TollCharge toll = new TollCharge(wheelNum, axleHeight, axleNum, nightBool, 0, 0);

            System.out.printf("\n The toll charge is %.2f pounds \n", toll.displayTollCharge());
            System.out.printf("\n Your vehicle is classified as %s (CLASS %d) \n", toll.displayClassName(), toll.displayClassNumber());

        } else{

            System.out.println("You entered incorrect data.");

        }


    }
}

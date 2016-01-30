// ROBOT MOVEMENT MAIN CLASS
// This is user class for RobotMovement class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 03/11/2015

import java.util.*;

public class RobotMovementUser{
    
    // Main method
    
    public static void main(String[] args){
        
        // Input data
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("======= ROBOT MOVEMENT =======");
        System.out.println("This program calculates the speed, horizontal distance, vertical distance, battery estimate of the robot. \n \n");
        
        // Input movement
        
        System.out.println("Give me the angle from vertical in a clockwise direction in degrees (0-90) inclusive: ");
        
        double angle = input.nextDouble();
        
        System.out.println();
        System.out.println("Give me the time to do this task in seconds: ");
        double time = input.nextDouble();
        System.out.println();
        
        // Instantiate object
        
        RobotMovement move = new RobotMovement(angle, time, 0, 0);

        
         // Main printing block
        
        System.out.println("You gave me all the parameters so I would like to calculate some data for you: \n \n");
        
        System.out.printf("Distance travelled by the robot is: %.2f meters. \n", move.calculateDistance());
        System.out.printf("The horizontal distance from its starting point is: %.2f metres. \n", move.calculateHorizontalDistance());
        System.out.printf("The vertical distance from its starting point is: %.2f metres. \n", move.calculateVerticalDistance());
        System.out.printf("The estimated battery usage (idle time) is: %.2f \n", move.calculateBatteryEstimate());
        
        
    }
    
}
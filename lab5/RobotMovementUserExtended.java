// ROBOT MOVEMENT MAIN CLASS
// This is user class for RobotMovement extended requirements class
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 03/11/2015

import java.util.*;

public class RobotMovementUserExtended{
    
    // Main method
    
    public static void main(String[] args){
        
        // Input data
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("======= ROBOT MOVEMENT =======");
        System.out.println("This program calculates the speed, horizontal distance, vertical distance, battery estimate of the robot. \n \n");
        
        // Input movement 1
        
        System.out.println("--- MOVEMENT 1 --- \n");
        System.out.println("Give me the angle from vertical in a clockwise direction in degrees (0-90) inclusive: ");
        
        double angle1 = input.nextDouble();
        
        System.out.println();
        System.out.println("Give me the time to do this task in seconds: ");
        double time1 = input.nextDouble();
        System.out.println();
        
        // Input movement 2
        
        System.out.println("--- MOVEMENT 2 --- \n");
        System.out.println("Give me the angle from vertical in a clockwise direction in degrees (0-90) inclusive: ");
        
        double angle2 = input.nextDouble();
        
        System.out.println();
        System.out.println("Give me the time to do this task in seconds: ");
        double time2 = input.nextDouble();
        System.out.println();
        
        // Input movement 3
        
        System.out.println("--- MOVEMENT 3 --- \n");
        System.out.println("Give me the angle from vertical in a clockwise direction in degrees (0-90) inclusive: ");
        
        double angle3 = input.nextDouble();
        
        System.out.println();
        System.out.println("Give me the time to do this task in seconds: ");
        double time3 = input.nextDouble();
        System.out.println();
        
        // Instantiate 3 objects
        
        RobotMovement move1 = new RobotMovement(angle1, time1, 0, 0);
        RobotMovement move2 = new RobotMovement(angle2, time2, move1.calculateHorizontalDistance(), move1.calculateVerticalDistance());
        RobotMovement move3 = new RobotMovement(angle3, time3, move2.calculateHorizontalDistance(), move2.calculateVerticalDistance());
        
        // Summing things into one thing
        
        double totalDistance = move1.calculateDistance()+move2.calculateDistance()+move3.calculateDistance();
        double totalTime = time1+time2+time3;
        double totalHorizontalDistance = move3.calculateHorizontalDistance();
        double totalVerticalDistance = move3.calculateVerticalDistance();
        double totalBatteryUsage = move1.calculateBatteryEstimate()+move2.calculateBatteryEstimate()+move3.calculateBatteryEstimate();
        
         // Main printing block
        
        System.out.println("You gave me all the parameters so I would like to calculate some data for you:");
        
        System.out.printf("The total distance travelled by the robot is: %.2f \n", totalDistance);
        System.out.printf("The total time traveled is: %.2f \n", totalTime);
        System.out.printf("The horizontal distance from its starting point is: %.2f \n", totalHorizontalDistance);
        System.out.printf("The vertical distance from its starting point is: %.2f \n", totalVerticalDistance);
        System.out.printf("The estimated battery usage (idle time) is: %.2f \n", totalBatteryUsage);
        
        
    }
    
}
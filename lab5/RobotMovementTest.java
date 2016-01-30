// ROBOT MOVEMENT TEST HARNESS CLASS
// This is test class for RobotMovement class.
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 27/10/2015

public class RobotMovementTest{
    
    // Main method
    
    public static void main(String[] args){
        
        testRobotMovement(0,0);
        testRobotMovement(0,90);
        testRobotMovement(0,30);
        testRobotMovement(4,0);
        testRobotMovement(4,60);
        
    }
    
    // Test method
    
    public static void testRobotMovement(double time, double angle){
    
        RobotMovement move = new RobotMovement(angle, time, 0, 0);
        
        System.out.printf("angle = %.2f , ", angle);
        System.out.printf("time = %.2f \n", time);
        System.out.printf("distance = %.2f \n", move.calculateDistance());
        System.out.printf("horizontal distance = %.2f \n", move.calculateHorizontalDistance());
        System.out.printf("vertical distance = %.2f \n", move.calculateVerticalDistance());
        System.out.printf("battery usage = %.2f \n", move.calculateBatteryEstimate());
        System.out.println("--------------------------------");

    }
    
}
// ROBOT MOVEMENT CLASS
// This class calculates the speed, horizontal distance, verical distance, battery estimate of the robot
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 03/11/2015

import java.math.*;

public class RobotMovement{
    
// CONSTANTS
    
    private final double BATTERYMULTIPLIER = 2.7;
    private final double ROBOTSPEED = 1.5;
    
// VARIABLES
    
    private double time;
    private double angle;
    private double angleRad;
    private double posHorizontal;
    private double posVertical;
    
// CONSTRUCTOR METHOD

    public RobotMovement(double inputAngle, double inputTime, double inputPosHorizontal, double inputPosVertical){
        
        time = Math.abs(inputTime);
        angle = Math.abs(inputAngle);
        angleRad = Math.abs(Math.toRadians(angle));
        posHorizontal = Math.abs(inputPosHorizontal);
        posVertical = Math.abs(inputPosVertical);
        
    }
    
 // METHODS
    
    public double calculateDistance(){
      
        return ROBOTSPEED*time;
      
    }
    public double calculateHorizontalDistance(){
    
        return posHorizontal+calculateDistance()*(Math.sin(angleRad));
    
    }
    public double calculateVerticalDistance(){
    
        return posVertical+calculateDistance()*(Math.cos(angleRad));
    
    }
    public double calculateBatteryEstimate(){
        
        return time*BATTERYMULTIPLIER;
        
    }

}
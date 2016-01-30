// TOLL CHARGE CLASS
// This class calculates the the toll charge of the vehicle dependent on its type.
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 10/11/2015

import java.math.*;

public class TollCharge{

// CONSTANTS

    private final double TOLL_CLASS[] = {3.00, 5.50, 10.00, 11.00, 12.50, 15.00};
    private final String TOLL_NAMES[] = {"Motorbike", "Car", "Car with trailer", "Van", "Small lorry", "Large lorry"};
    private final double PASSCOST[] = {200, 500, 1000};


// CLASS VARIABLES

    private int wheelsNum;
    private double axleHeight;
    private int axleNum;
    private boolean night;
    private int classNum;
    private double tollCharge;

    private double passCost;
    private int daysNum;
    private int nightsNum;

// CONSTRUCTOR METHOD

    public TollCharge(int inputWheelsNum, double inputAxleHeight, int inputAxleNum, boolean inputNight, int inputDaysNum, int inputNightsNum){

        wheelsNum = inputWheelsNum;
        axleHeight = inputAxleHeight;
        axleNum = inputAxleNum;
        night = inputNight;

        daysNum = inputDaysNum;
        nightsNum = inputNightsNum;

        if(wheelsNum >= 4){

            if(axleHeight >= 1.3){

                if(axleNum == 2){

                    tollCharge = TOLL_CLASS[3];
                    classNum = 4;
                    passCost = PASSCOST[1];

                } else if(axleNum >= 3 && axleNum <= 6){

                    tollCharge = TOLL_CLASS[4];
                    classNum = 5;
                    passCost = PASSCOST[2];

                } else{

                    tollCharge = TOLL_CLASS[5];
                    classNum = 6;
                    passCost = PASSCOST[2];

                }

            } else{

                if(axleNum == 2){

                    tollCharge = TOLL_CLASS[1];
                    classNum = 2;
                    passCost = PASSCOST[1];

                } else{

                    tollCharge = TOLL_CLASS[2];
                    classNum = 3;
                    passCost = PASSCOST[1];

                }

            }


        } else{

            tollCharge = TOLL_CLASS[0];
            classNum = 1;
            passCost = PASSCOST[0];

        }

        if(night == true)
            tollCharge /= 2;

    }

 // METHODS

    public double displayTollCharge(){

        return tollCharge;

    }

    public String displayClassName(){

        return TOLL_NAMES[classNum-1];

    }
    public int displayClassNumber(){

        return classNum;

    }
    public double checkTotalCost(){

        return checkDaysCost()+checkNightsCost();

    }
    public double checkDaysCost(){

        return tollCharge*daysNum;

    }
    public double checkNightsCost(){

        return tollCharge*nightsNum/2;

    }

    public double checkPassCost(){

        return passCost;

    }

}

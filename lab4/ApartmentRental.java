// APARTMENT RENTAL CLASS
// This class calculates and displays the area and cost of the floor, service charge, cost before VAT, VAT and total cost of apartment for each type (basic / smart / luxury) after giving a width and height of the apartment.
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 27/10/2015

public class ApartmentRental{
    
// CONSTANTS
    
    private final double SERVICECHARGEFIXED = 12.5;
    private final double VATMULTIPLIER = 0.2;
    private final double COSTPERSQUAREM;
    
// VARIABLES
    
    private double floorArea;
    
// CONSTRUCTOR METHOD

    public ApartmentRental(double width, double height, double costPerSquareM){
    
        floorArea = width*height;
        COSTPERSQUAREM = costPerSquareM;
    
    }
    
 // METHODS
    
    // Calculates floor area
    public double calculateFloorArea(){
        
        return floorArea;
        
    }
    
    // Calculates area cost
    public double calculateAreaCost(){
        
        return floorArea*COSTPERSQUAREM;
        
    }
    
    // Calculates service charge
    public double calculateServiceCharge(){
        
        return SERVICECHARGEFIXED+(floorArea/10);
        
    }
    
    // Calculates cost before VAT
    public double calculateCostBeforeVAT(){
        
        return calculateAreaCost()+calculateServiceCharge();
        
    }
    
    // Calculates VAT
    public double calculateVAT(){
        
        return calculateCostBeforeVAT()*VATMULTIPLIER;
        
    }
    
    // Calculates total cost
    public double calculateTotalCost(){
        
        return calculateCostBeforeVAT()+calculateVAT();
        
    }

}
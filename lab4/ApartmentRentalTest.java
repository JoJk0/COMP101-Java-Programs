// APARTMENT RENTAL TEST HARNESS CLASS
// This is test class for ApartmentRental class.
// Made by Jakub Janisz (u5jj1) for The University of Liverpool assignment
// 27/10/2015

public class ApartmentRentalTest{
    
    // Main method
    
    public static void main(String[] args){
        
        testApartmentRental(0,0);
        testApartmentRental(0,2);
        testApartmentRental(2,0);
        testApartmentRental(2,3);
        
    }
    
    // Test method
    
    public static void testApartmentRental(double width, double length){
    
        ApartmentRental apartment_basic = new ApartmentRental(width, length, 6.50);
        ApartmentRental apartment_smart = new ApartmentRental(width, length, 9.00);
        ApartmentRental apartment_luxury = new ApartmentRental(width, length, 13.50);
        
        System.out.println("\n width = "+width+" length = "+length+"\n");
        System.out.println("---------------------------------------------");
        System.out.println("Floor area = "+apartment_basic.calculateFloorArea()+" \n");
        System.out.println("-------- BASIC ---------");
        System.out.printf("Floor area cost = %.2f \n", apartment_basic.calculateAreaCost());
        System.out.printf("Service charge = %.2f \n", apartment_basic.calculateServiceCharge());
        System.out.printf("Cost before VAT = %.2f \n", apartment_basic.calculateCostBeforeVAT());
        System.out.printf("VAT = %.2f \n", apartment_basic.calculateVAT());
        System.out.printf("Total cost = %.2f \n", apartment_basic.calculateTotalCost());        
        System.out.println("-------- SMART ---------");
        System.out.printf("Floor area cost = %.2f \n", apartment_smart.calculateAreaCost());
        System.out.printf("Service charge = %.2f \n", apartment_smart.calculateServiceCharge());
        System.out.printf("Cost before VAT = %.2f \n", apartment_smart.calculateCostBeforeVAT());
        System.out.printf("VAT = %.2f \n", apartment_smart.calculateVAT());
        System.out.printf("Total cost = %.2f \n", apartment_smart.calculateTotalCost());        
        System.out.println("-------- LUXURY ---------");
        System.out.printf("Floor area cost = %.2f \n", apartment_luxury.calculateAreaCost());
        System.out.printf("Service charge = %.2f \n", apartment_luxury.calculateServiceCharge());
        System.out.printf("Cost before VAT = %.2f \n", apartment_luxury.calculateCostBeforeVAT());
        System.out.printf("VAT = %.2f \n", apartment_luxury.calculateVAT());
        System.out.printf("Total cost = %.2f \n", apartment_luxury.calculateTotalCost());
    
    }
    
}
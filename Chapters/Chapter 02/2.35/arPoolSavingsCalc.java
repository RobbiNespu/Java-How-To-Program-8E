/*
* 	Filename :  CarPoolSavingsCalc.java
* 
* 	Descrition : (2.34)  Car Pool salvings Calculator
* 			
*	
*	Created: 17/07/18 14:31:10
*
*	Revision:none
*	
*	Author:Hianuy Esperidião - hianuy2@gmail.com
*	Version 1.0:
*	
*	 
*	 
* ============================================================================================	 
*/


import java.util.Scanner;

public class CarPoolSavingsCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double milesPerDay, costPerGallon, milesPerGallon;
        double parkingFees, tollsPerDay, dailyDrivingCost;

        milesPerDay = requestInput("Enter total miles driven per day: ", sc);
        costPerGallon = requestInput("Enter cost per gallon for gasoline: ", sc);
        milesPerGallon = requestInput("Enter average miles per gallon: ", sc);
        parkingFees = requestInput("Enter parking fees per day: ", sc);
        tollsPerDay = requestInput("Enter tolls per day: ", sc);

        // calculate daily driving cost
        dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees + tollsPerDay;

        System.out.printf("Daily driving cost = %.2f\n", dailyDrivingCost);
    }
    // space saving in main()
    private static double requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextDouble();
    }
}

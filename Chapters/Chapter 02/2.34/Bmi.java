/*
* 	Filename : Bmi.java
* 
* 	Descrition : (2.34)  Write a program that calculates the BMI

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


public class bmi_calculator {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    float weight,height,imc;
    System.out.print("***************************************-BMI Calculator-*********************************\n");
    System.out.printf("Enter your weight in kg:\n");
    weight = input.nextFloat();
    System.out.printf("Enter your height in meters(use a comma if necessary):\n");
    height = input.nextFloat();
    imc = weight/(height*height);
    System.out.printf("Your imc is %f:\n",imc);
    System.out.printf("Compare the result with the table \n\n");
    System.out.printf("*************** Underweight:less than 18.5 ***************\n");
    System.out.printf("*************** Normal: between 18.5 and 24.9 *************\n");
    System.out.printf("*************** Overweight: betwenn 25 and 29.9 ***************\n");
    System.out.printf("*************** Obese: 30 or greater ***************\n");
    
    }
}

        
        
        
        
        
        
        
        
        
        
        

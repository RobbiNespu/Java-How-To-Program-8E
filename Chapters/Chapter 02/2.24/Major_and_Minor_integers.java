/*
* 	Filename : Major_and_Minor_integers.java

* 
* 	Descrition : (2.24) Write a program that reads 5 numbers and says which is the largest and the smallest of them

*	
* 			
*	
*	Created: 16/04/18 17:23:36
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


import java.util.*;
class Major_and_Minor_integers {

	public static void main(String[] args) {
		 double HigherNumber = 0;
		 double smallerNumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        System.out.println("Enter the second number:");
        System.out.println("Enter the third number:");
        System.out.println("Enter the fourth number:");
        System.out.println("Enter the fifth number:");

        double num1 = in.nextInt();
        double num2 = in.nextInt();
        double num3 = in.nextInt();
        double num4 = in.nextInt();
        double num5 = in.nextInt();

      
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1> num5) {
        	HigherNumber= num1;
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			HigherNumber = num2;
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			HigherNumber= num3;
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
				HigherNumber= num4;
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			HigherNumber= num5;
		}	

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
        	smallerNumber= num1;
		} else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			smallerNumber = num2;
		} else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			smallerNumber= num3;
		}else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			smallerNumber= num4;
		}else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
			smallerNumber= num5;
		}
  
        System.out.println("Higher number : " + HigherNumber);
		    System.out.println("Smaller Número : " + smallerNumber);
	}
}

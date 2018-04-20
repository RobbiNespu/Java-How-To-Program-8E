/*
* 	Filename :Arithmetic.java
* 
* 	Descrition :
* 			(2.15)write an application that prompts the user to insert two integers, obtains the user from these numbers and prints their sum, difference, product, quotient.
*	
*	Created: 12/04/18 22:44:42
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


public class arithmetic {
      public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);

	      System.out.println("Enter 1 if you want to make a sum:");
	      System.out.println("Enter 2 if you want to make a  subtraction:");
	      System.out.println("Enter 3 if you want to make a multiplication:");
	      System.out.println("Enter 4 if you want to make a  division:");

	      double i = in.nextInt();

	      System.out.println("Enter  the first number :");
	      double num1 = in.nextInt();
	      System.out.println("Enter the second number :");		
	      double num2 = in.nextInt();

	       if(i==1) {
		     System.out.println(num1 + num2);
	      }else {
		   if(i==2) {
			 System.out.println(num1 - num2);


		}else
		     if(i==3) {
			   System.out.println(num1 * num2);
		       }
		else {
			if(i==4) {
			      System.out.println(num1/num2);
	       }else {			
		   System.out.println("Operation invalid, Enter a number in the range of values");

			}
		     }
		}
	}		

}



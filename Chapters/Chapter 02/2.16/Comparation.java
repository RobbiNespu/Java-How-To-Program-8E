/*
* 	Filename :Comparation.java
* 
* 	Descrition :
*
*	
*	Created: 12/04/18 22:51:01
*
*	Revision:none
*	(2.16) write a program that compares two numbers and says which is the largest or which is the smallest or if the numbers are
*	Author:Hianuy Esperidião - hianuy2@gmail.com
*	Version 1.0:
*	
*	 
*	 
* ============================================================================================	 
*/


import java.util.*;
class Comparation {


	public static void main(String[] args) {
	
		System.out.println("Enter the fist number:");
		System.out.println("Enter the second number:");
			
		Scanner in = new Scanner(System.in);
			
		int num1 = in.nextInt();
			
		int num2 = in.nextInt();
		
			
		if(num1>num2) {
			System.out.println("the first number is greater than the second number");
			       }
				
		else{ 
		     if(num1==num2) {
		             System.out.println("the numbers are the same");
				       }
		else {
			if(num1<num2) {
		        	System.out.println("the first number is smaller than the second number");
		        	      }
		      }		

			}
	 }
}

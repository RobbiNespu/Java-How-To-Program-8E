/*
* 	Filename :  multipleOfNumber.java
* 
* 	Descrition : (2.26) Write a program that reads two numbers and verify that the first and multiple of the second

* 			
*	
*	Created: 18/04/18 20:15:31
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
class multipleOfNumber {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the first number:");
          System.out.println("Enter the second number:");

          double num1 = input.nextInt();
          double num2 = input.nextInt();

          if(num1 % num2 == 0)
            System.out.println("The first number is multiple of the second");
          else
            System.out.println("The first number is not multiple of the second");
    }

}

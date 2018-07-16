/*
* 	Filename :  pairOrUnspaired.java
* 
* 	Descrition : (2.25) write a program that reads a number and tells you whether it is pair or unspaired

*	
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
public class pairOrUnspaired {

    public static void main(String[] args) {
      int num1;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter with the number:");

      num1 = input.nextInt();

      if(num1 % 2 == 0 )
          System.out.print("The number is pair ");
      else
          System.out.print("The number is unspaired ");
      }

  }


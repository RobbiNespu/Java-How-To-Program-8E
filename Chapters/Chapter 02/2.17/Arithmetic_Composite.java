//
//* 	Filename Arithmetic_Composite.java
//* 
//* 	Descrition :
//* 	(2.17)Write a program that receives 3 numbers make the sum, the product and the media and say which is the largest number
//*	Created: 12/04/18 23:04:32
//*
//*	Revision:none
//*	
//*	Author:Hianuy Esperidião - hianuy2@gmail.com
//*	Version 1.0:
//*	
//*	 
//*	 
//* ============================================================================================	 
//

import java.util.Scanner;

class Arithmetic_Composite {

    public static void main(String[] args) {
		
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the first number:");
          System.out.println("Enter the second number:");
          System.out.println("Enter the three number:");

          double num1 = in.nextInt();
          double num2 = in.nextInt();
          double num3 = in.nextInt();

          double sum = num1 + num2 + num3;
          double average = (num1 + num2 + num3)/ 3;
          double product = num1 * num2 * num3;
          System.out.println(" the sum is :" + sum);
          System.out.println(" the average is:" + average);
          System.out.println(" the product is:" + product);
          if(num1>num2 && num1>num3)
                  System.out.println("The number 1 is greater than number 2 and 3");

        else{
              if(num2>num1 && num2 > num3) {
                    System.out.println("The number 2 is greater than number 1 and 3");
        else{
             if(num3>num1 && num3 > num2){
            System.out.println("The number 3 is greater than number 1 and 3");
             }
	    }			
	 }
   }
}

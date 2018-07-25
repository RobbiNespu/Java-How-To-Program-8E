/*
* 	Filename : Negative_and_positive_and_zero.java
* 
* 	Descrition : (2.32)  Write a program that receives 5 numbers and identifies whether a number is negative or positive or
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
public class  Negative_and_positive_and_zero{

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        double n1,n2,n3,n4,n5;
  
        
        System.out.printf("Enter the first number:\n");
        n1 = input.nextDouble();
        if(n1>0){
            System.out.printf("The first number is positive\n");        
        }
        if(n1<0){
            System.out.printf("the first number is negative\n");

        }
        else
            if(n1==0){
                System.out.printf("the first number is zero\n");
                      }


        System.out.printf("Enter the second number:\n");
        n2 = input.nextDouble();

        if(n2>0){
            System.out.printf("The second number is positive\n");        
        }
        if(n2<0){
            System.out.printf("the second number is negative\n");

        }
        else
            if(n2==0){
                System.out.printf("the second number is zero\n");
                      }


        System.out.printf("Enter the third number:\n");
        n3 = input.nextDouble();
        if(n3>0){
            System.out.printf("The third number is positive\n");        
        }
        if(n3<0){
            System.out.printf("the third number is negative\n");

        }
        else
            if(n3==0){
                System.out.printf("the third number is zero\n");
                      }


        System.out.printf("Enter the fourth number:\n");
        n4 = input.nextDouble();
        if(n4>0){
            System.out.printf("The  fourth number is positive\n");        
        }
        if(n4<0){
            System.out.printf("the fourth number is negative\n");

        }
        else
            if(n4==0){
                System.out.printf("the fourth number is zero\n");
                      }


        System.out.printf("Enter the fifth number:\n");
        n5 = input.nextDouble();
        if(n5>0){
            System.out.printf("The fifth number is positive\n");        
        }
        if(n5<0){
            System.out.printf("the fifth number is negative\n");

        }
        else
            if(n5==0){
                System.out.printf("the fifth number is zero\n");
                      }
     
    }
}

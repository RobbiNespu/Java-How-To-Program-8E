/*
* 	Filename : diameterAndAreaOfTheCircle.java
* 
* 	Descrition : (2.28) Write a program that reads an integer (radius) and calculate the diameter of the area and size of the circle use the class math.Pi
*
*	
* 			
*	
*	Created: 19/04/18 21:33:51
*
*	Revision:none
*	
*	Author:Hianuy Esperidião - hianuy2@gmail.com
*	Version 1.0:
*	
*	 
*	 
* ============================================================================================	 


import java.util.*;
class diameterAndAreaOfTheCircle {

    public static void main(String[] args) {
        double diameter = 0;
        double circuference = 0;
        double area = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for the radius:"); 

        double radius = input.nextInt();

        diameter = 2 * radius;
        circuference =  2*Math.PI * radius;
        area = Math.PI*(radius*radius);
        System.out.printf("The diameter value is:" + diameter ); 
        System.out.print("\nThe circuference value is:" + circuference); 
        System.out.print("\nThe area value is:" + area ); 
	}

}

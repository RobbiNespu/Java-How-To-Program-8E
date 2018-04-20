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


package x;
import java.util.*;
class diameterAndAreaOfTheCircle {

     public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int r ;
	System.out.print("Enter a value for the radius:"); 
		
	r = input.nextInt();
		
	System.out.printf("Diameter = %d\nCircuference = %.3f\nArea = %.3f\n",2 * r, 2 * Math.PI * r, Math.PI * r * r);
		  
     }

}

	

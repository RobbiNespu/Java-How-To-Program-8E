/*
* 	Filename :  GradeBookTest.java
* 
* 	Descrition : (3.11) modify the Gradebook class figure 3.10
*	
* 			
*	
*	Created: 07/08/18 22:16:01
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
public class GradeBookTest {

    
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java ","Jubileu");
      System.out.printf("initial name course is :%s\n\n",myGradeBook.getCourseName());

      
      System.out.print("Enter the course name:");
      String theName = input.nextLine();
      myGradeBook.setCourseName(theName);
      
      
      myGradeBook.displayMessage();
      
        
     }
}

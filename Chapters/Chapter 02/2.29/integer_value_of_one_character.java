/*
* Filename integer_value_of_one_character.java
* 
* 	Descrition : (2.29)Write a program that shows the corresponding value of characters
*	Created: 16/07/18 23:33:32
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
public class integer_value_of_one_character
 {

public static void main (String [] args) {
       Scanner input = new Scanner(System.in);
       System.out.printf("Enter a character: ");
       char character = input.next().charAt(0);
       System.out.printf("The character %c has the value %d\n", character,((int) character));

               
       
    }
}

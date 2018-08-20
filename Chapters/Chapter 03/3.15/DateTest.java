/*
* 	Filename :  DateTest.java 
* 
* Descrition : (3.15) Create a class called Date that includes three instance variables—a month (type
* int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
* variables and assumes that the values provided are correct. Provide a set and a get method for each instance
* variable. Provide a method displayDate that displays the month, day and year separated by forward
* slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities
*	
* 			
*	
*	Created: 19/08/18 23:54:34
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
public class DateTest {

   
    public static void main(String[] args) {
        String choice;
        int day;
        int month;
        int year;

        Scanner input = new Scanner(System.in);
        Date dates = new Date(8,20,2018);
        System.out.println(dates.getDay());
        System.out.println(dates.getMonth());
        System.out.println(dates.getYear());
        dates.displayMessage();
        System.out.println("\nDo you want to change the date?? Y/N");
        choice = input.nextLine();
        if(choice.equals ("Y") ||choice.equals ("y")){
              System.out.print("Enter a number for the day:");
              day = input.nextInt();
              dates.setDay(day);


              System.out.print("Enter a number for the month:");
              month = input.nextInt();
              dates.setMonth(month);

              System.out.print("Enter a number for year:");
              year = input.nextInt();
              dates.setYear(year);

              dates.displayMessage();

        }
        else{
          
      }
      
    }
    
}




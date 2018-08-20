/*
* 	Filename :  Date.java 
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





public class Date {
    
    private int month;
    private int day;
    private int year;
    

public  Date(int month_ , int day_,int year_){
    month = month_;
    day = day_;
    year = year_;
        
}
public void setMonth(int month_){
    month = month_;
}
public void setDay(int day_){
    day = day_;
}        
public void setYear(int year_){
    year = year_;
}        
public int getMonth(){
    return month;
}
public int getDay(){
    return day;
}
public int getYear(){
    return year;
}   
public void displayMessage(){
        
    System.out.print("" + getMonth()); 
    System.out.print("/" + getDay());
    System.out.print("/" + getYear());


  }
  
 }




























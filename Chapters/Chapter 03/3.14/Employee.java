/*
* 	Filename :  Employee.java 
* 
* Descrition : (3.14) Create a class called Invoice that a hardware store might use to represent
* an invoice for an item sold at the store. An Invoice should include four pieces of information as
* instance variables—a part number (type String), a part description (type String), a quantity of the
* item being purchased (type int) and a price per item (double). Your class should have a constructor
* that initializes the four instance variables. Provide a set and a get method for each instance variable.
* In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
* multiplies the quantity by the price per item), then returns the amount  as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
* 0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.
*	
* 			
*	
*	Created: 16/08/18 23:27:17
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

public class Employee {
  private  String name;
  private String lastName;
  private double salary;  
 
 
public Employee (String name1,String lastName1,double salary1){

    name = name1;
    lastName = lastName1;

    if(salary1 > 0)
        salary = salary1;
    else{

    }

}

public void  setName(String name1){
    name = name1;
}
public void setLastName(String lastName1){
    lastName = lastName1;
}
public void setSalary(double salary1){
    salary = salary1;
   
}
public double setSalaryIncrease(){
    double yearSalaryIncrease;
    yearSalaryIncrease =(((salaryAnual() * (0.1)) + salaryAnual()));
    return yearSalaryIncrease;
}
public String getName(){
    return name;
}
public String getLastName(){
    return lastName;
}
public double getSalary(){
    return salary;
}
public double salaryAnual(){
    return getSalary() * 12;
}


}

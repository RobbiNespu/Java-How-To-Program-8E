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
import java.util.Scanner;

public class EmployeeTest {

   
    public static void main(String[] args) {       
          String choice;
           
          Scanner input = new Scanner(System.in);
          Employee empregado1 = new Employee("JOSE","joao",2400);
          Employee empregado2 = new Employee("Maria","da cunha",6000);

          System.out.printf("The employee 1 data is thus:\n"
                  + "Name:%s\n"
                  + "Last name:%s\n"
                  + "Salary R$:%.0f\n",empregado1.getName()
          ,empregado1.getLastName(),empregado1.getSalary());

          System.out.printf("\nThe employee 2 data is thus:\n"
                  + "Name:%s\n"
                  + "Last name:%s\n"
                  + "Salary R$:%.0f\n",empregado2.getName()
          ,empregado2.getLastName(),empregado2.getSalary());

          System.out.printf("\nThe employee's annual salary %s is %.0f\n",empregado1.getName(),empregado1.salaryAnual());

          System.out.printf("\nThe employee´s anual salary %s is %.0f\n",empregado2.getName(),empregado2.salaryAnual());



          System.out.println("Wants to give employees a 10% increase? Y/N");
          choice = input.nextLine();
          if(choice.equals ("Y") ||choice.equals ("y")){
          System.out.printf("With an increase in salary, the %s will receive this annually:%.0f\n",empregado1.getName(),empregado1.setSalaryIncrease());
          System.out.printf("With an increase in salary,the %s will receive this annually:%.0f ",empregado2.getName(),empregado2.setSalaryIncrease());

          }
          else
            System.out.println("end of program");

    }
}



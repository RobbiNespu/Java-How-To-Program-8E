/*
* 	Filename :  AcountTest.java
* 
* 	Descrition : (3.12) modify the Acount class figure 3.13 to provide the debit method.
*	
* 			
*	
*	Created: 08/08/18 15:27:44
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

public class Acount {
    
    public static void main(String[] args) {
    
          Acount acount1 = new Acount(50);


          System.out.printf("acount1 balance: $%.2f\n ",acount1.getBalance());

          Scanner input = new Scanner(System.in);
          
          
          double depositAmount;
          
          System.out.printf("Enter deposit amount for acount1:");
          depositAmount = input.nextDouble();
          
          System.out.printf("After the deposit of %.2f to acount1 \n",depositAmount);
          acount1.credit(depositAmount);

          System.out.printf("acount1 balance: $%.2f\n ",acount1.getBalance());


          System.out.printf("Enter the amount to remove for acount1:");
          double debitAmount;
          
          debitAmount = input.nextDouble();
          acount1.debit(debitAmount);
          
          System.out.printf("acount1 balance: $%.2f\n ",acount1.getBalance());

    
    }
    
    
    
}

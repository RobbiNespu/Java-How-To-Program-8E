/*
* 	Filename :  Acount.java
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
/*
 *
 */

public class Acount {
    
    
    
    private double balance;
    public Acount(double initialBalance){
    
            if(initialBalance > 0.0)  
            balance = initialBalance;
        
    }
    public void credit(double amount){
       
     balance = balance + amount;
        
    }
    public double getBalance(){
      return balance;  
    }
    public Double debit(double amount){
            if  (balance > amount){
        
            balance = balance - amount;
          
    }
    else{
        System.out.print("insufficient funds.Your balance is only ");
    }
        return null;
    }        
    
}

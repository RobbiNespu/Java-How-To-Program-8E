/*
* 	Filename :  separating_the_digits.java
* 
* 	Descrition : (2.30)  Write an application that separates digits from a number up to 5 digits
*	
* 			
*	
*	Created: 15/07/18 18:15:31
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
public class separating_the_digits {
	
	 
	
	    public static void main (String [] args) {
	         
	       
	    	
	    
	        int digit1=0; //first digit of number
	        int digit2=0; //second digit of number
	        int digit3=0;//third digit of number
	        int digit4=0;//fourth digit of number
	        int digit5=0; //fifth digit of number
	      
	     // I used this to store each step of number division because I need this to use recursion

	        int result_division1=0; 
	        int result_division2=0;
	        int result_division3=0;
	        int result_division4=0;
	        int result_division5=0;
	        System.out.println("Enter the number of up to 5 digits for it to be separated:\n");
	        Scanner in = new Scanner(System.in);
	    	int number = in.nextInt();
			
			
	    	
	   	// I am using recursion.
	    	// I'll use an example to illustrate how the code works(12345).

	         result_division1=number/10; // 12345  .. 12345/10 = 1234
	         digit1=number%10; // 12345 rest of division for = 5
	         
	         result_division2=result_division1/10; // 1234 .... 1234/10 = 123
	         digit2=result_division1%10;// 1234 rest of division for 10  = 4
	         
	         result_division3 = result_division2/10; //123 ..... 123/10 = 12
	         digit3= result_division2%10; // 123 rest of division for  10 = 3
	         
	         result_division4 = result_division3/10; // 12 ... 12/10 = 1
	         digit4 = result_division3%10; // 12 rest of division for 10 = 2
	         
	         result_division5 = result_division4/10; // 1 .... 1/10 = 0.1
	         digit5 = result_division4%10;// 1 rest of division for 10 = 1
	      

	         //It is important to remember that we are using recursion so the first number is stored in digit 5 (end of recursion)
	         System.out.printf("Separate digits are: %d %d %d %d %d\n",digit5,digit4,digit3,digit2,digit1);
	         
	      
	        
	        
	    }
}
	     

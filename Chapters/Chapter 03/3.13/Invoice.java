/*
* 	Filename :  Invoice.java
* 
* Descrition : (3.13) create a class called invoice and it should include 4 parts of the information as instance variables 
* the number (string type), the description (string) the quantity purchased of an item (type int) price per item (double). 
* The class must initialize the instance variables and provide a get and set method for each variable. 
* End also a getInvoiceAmount method (multiplying the quantity by the price of the item). 
* And if quantity and price per item are not positive set to 0
*
*	
* 			
*	
*	Created: 15/08/18 23:05:02
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



public class Invoice {
    private String description;
    private String number;
    private double pricePerItem;
    private int quantityPurchased;
    private int zero =  0;
    
public Invoice (String description1,String number1 ,double pricePerItem1, int quantityPurchased1){

    description = description1;
    number = number1;

     if(pricePerItem1 > 0)
         pricePerItem = pricePerItem1;
     else{
         pricePerItem = zero;
    }
    
    
     if(quantityPurchased1 > 0)
       quantityPurchased = quantityPurchased1;
    else{
    quantityPurchased = zero ;
}

}

public String getDescription(){
    return description;
}
public String getNumber(){
    return  number; 
}

public double getpricePerItem(){
    return pricePerItem;
}    
public int getQuantityPurchased(){
    return quantityPurchased;
}    
public double getInvoiceAmount(){
    return getQuantityPurchased() * getpricePerItem();
    
};

  
    

public void setDescription(String description1){
   description = description1; 
}
public void setNumber(String number1){
    number = number1;

}

public void setpricePerItem(double pricePerItem1){
    pricePerItem = pricePerItem1;
}
public void setQuantityPurchased(int quantityPurchased1){
    quantityPurchased = quantityPurchased1;
}
}

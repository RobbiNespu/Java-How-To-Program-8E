/*
* 	Filename :  GradeBook.java
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



public class GradeBook {
    private String courseName;
    private String nameInstructor;
    
    public  GradeBook(String name, String instructor)
    {
    courseName = name;
    nameInstructor = instructor;
    } 
   
    public void setCourseName(String name){
        courseName = name;
      
    }
    public void setNomeInstrutor(String instructor){
         nameInstructor = instructor;
                        
    } 
    public String getCourseName(){
        return courseName;
        
    }
    public String getNameInstructor(){
        return nameInstructor;
        
    }
    public void displayMessage(){
        
     System.out.print("Welcome to the gradebook for "+ getCourseName()); 
     System.out.printf(".This course is preseted by:%s\n",getNameInstructor());
    }


}

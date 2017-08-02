/**
 * ConstChain.java 
 * version  1.1
 * compiled on 3rd August 2017
 */
package session3assignment33;
/**
 * 
 * This program will illustrate the class ConstChain for exemplifying the constructor chaining concept.
 * Author: CHHAYA YADAV
 *
 */
public class ConstChain {
	
	 public static void main(String args[])
	    {
	  	    System.out.println(" ");
		    System.out.println("*****************************DISPLAYING THE CONSTRUCTOR CHAINING IN BASE CLASS RECTANGLE******************************************");
		    
	        Rectangle   r1 = new  Rectangle();         // Constructor chaining in same parent class itself
	        
	        System.out.println(" ");
     	    System.out.println("************************DISPLAYING THE CONSTRUCTOR CHAINING FROM CHILD CLASS WITH NO ARGUMENTS************************************");   
		    
 	        Cuboid      c1 = new  Cuboid();              // Constructor chaining in child class by initiating with default constructor
 	   
 	        System.out.println(" "); 
 	        System.out.println("************************DISPLAYING THE CONSTRUCTOR CHAINING FROM CHILD CLASS WITH SINGLE ARGUMENTS********************************");  
 	        
	        Cuboid      c2 = new  Cuboid(10) ;          // Constructor chaining in child class by initiating with parameterized constructor with single arguments
	       
	        System.out.println(" ");
	        System.out.println("************************DISPLAYING THE CONSTRUCTOR CHAINING FROM CHILD CLASS WITH MULTIPLE ARGUMENTS******************************");  
	        
 	        Cuboid      c3 = new  Cuboid(10,20) ;       // Constructor chaining in child class by initiating with parameterized constructor with multiple arguments
	    }

}

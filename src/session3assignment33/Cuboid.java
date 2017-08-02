/**
 * Cuboid.java 
 * version  1.1
 * compiled on 3rd August 2017
 */
package session3assignment33;
/**
 * 
 * This program will illustrate the child class CUBOID to exemplify the constructor chaining
 * Author: CHHAYA YADAV
 *
 */
public class Cuboid extends Rectangle
{

// child class default constructor declared below
	
public Cuboid(){
        
	    super();                           //invokes the parent class default constructor
    
        System.out.println("Child Class  Cuboid Default Constructor invoked !");
    }

//child class parameterized constructor declared below with one argument

public Cuboid(int clen){
    
        
        super(clen) ;                     //invokes the parent class parameterized constructor with single argument
        
        System.out.println("Child Class  Cuboid Parameterized Constructor with single argument invoked !! ");
    }
 

// child class parameterized constructor declared below, with multiple argument

public Cuboid(int clen, int cbre){
    
       
        super(clen, cbre) ;               //invokes the parent class parameterized constructor with multiple arguments

        System.out.println("Child Class  Cuboid Parameterized Constructor with multiple arguments invoked !!! ");
    }
 
}



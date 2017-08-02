/**
 * Rectangle.java 
 * version  1.1
 * compiled on 3rd August 2017
 */
package session3assignment33;
/**
 * 
 * This program will illustrate the parent class RECTANGLE to exemplify the constructor chaining
 * Author: CHHAYA YADAV
 *
 */
public class Rectangle
{

// instance variable declaration	
     protected int length ;

     protected int breadth ;

// default constructor declared below , to illustrate constructor chaining

public   Rectangle(){
       
        this(10);                      //invoking the constructor in same class with single argument
        
        System.out.println("Parent Class Rectangle Default constructor has been invoked ! ");
        
    }
 
// parameterized constructor declared below , with one argument

public   Rectangle(int length){
    
        
        this(10,20);                       //invoking the constructor in same class with multiple argument
        
        System.out.println("Parent Class Rectangle parameterized constructor with single argument has been invoked !! ");
    }
 
// parameterized constructor declared below, with multiple arguments
 
public   Rectangle(int length, int breadth){
       
        this.length  = length ;
        
        this.breadth = breadth ;
        
        System.out.println("Parent Class Rectangle parameterized constructor with multiple arguments has been invoked !!! ");

    }

}






package com.ambientideas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World from Main!" );
    	int mysum = sum(5, 4);
        System.out.println("We can set a breakpoint and output a var: " + mysum);
    }
    
    public static int sum(int opr1, int opr2) {
      throw new java.lang.IllegalStateException("A big scary exception");
    }
}

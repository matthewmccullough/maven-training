package com.ambientideas;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("This is a Unit Test!");
    	App.main(null);
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testSum()
    {
    	System.out.println("This is a Unit Test of a sum.");
        assertEquals(9, App.sum(5, 4));
    }
}

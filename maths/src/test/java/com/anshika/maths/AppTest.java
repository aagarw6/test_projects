package com.anshika.maths;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{   
	Maths t;
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        t= new Maths();
    }

    public void testadd()
    {
    	assertEquals("testing ok",t.add(1,2),3);
    	
    }
    public void testsubtract()
    {
    	assertEquals("testing ok",t.subtract(4, 2),2);
    }
    public void testfactorial()
    {
    	assertEquals("testing ok",t.factorial(5),120);
    }
    public void testpro()
    {
    	assertEquals("testing ok",t.product(1,2),2);
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
        assertTrue( true );
    }
}

package com.vcjain.sonardemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.vcjain.sonardemo.number.Number;

/**
 * Unit test for simple App.
 */
public class NumberTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NumberTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NumberTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAddNumber()
    {
    	Number n = new Number(); 
    	int add = n.addNumber(1, 2);
        assertEquals(add,3);
    }
    public void testMultiplyNumber()
    {
    	Number n = new Number();
    	int add = n.multiplyNumber(1, 2);
        assertEquals(add,2);
    }
}

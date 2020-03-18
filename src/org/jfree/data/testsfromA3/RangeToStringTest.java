package org.jfree.data.testsfromA3;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeToStringTest 
{
    
    private Range exampleRange;
    private Range exampleRangeTwo;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception 
    {
        
    }

    @Before
    public void setUp() throws Exception 
    {
        exampleRange = new Range(-10,5);
        exampleRangeTwo = new Range(0,0);
    }
    
    @Test
    public void testToString()
    {
        String exampleRangeAsString = exampleRange.toString();
        assertTrue("A Range from -10 to 5 could not correctly be converted to a string!!", new String("Range[-10.0,5.0]").equals(exampleRangeAsString));
    }
    
    @Test
    public void testToStringAgain()
    {
        String exampleRangeTwoAsString = exampleRangeTwo.toString();
        assertTrue("A Range from 0 to 0 could not correctly be converted to a string!!", new String("Range[0.0,0.0]").equals(exampleRangeTwoAsString));
    }

    @After
    public void tearDown() throws Exception 
    {
        
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception 
    {
        
    }

}

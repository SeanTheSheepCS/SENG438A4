package org.jfree.data.testsfromA3;


import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeExpandToIncludeTest 
{
    Range nullRange;
    Range exampleRange;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception 
    {
        
    }
    
    @Before
    public void setUp() throws Exception 
    {
        nullRange = null;
        exampleRange = new Range(2,7);
    }
    
    @Test
    public void testARangeExpansionAboveUpperBound() 
    {
        try
        {
            Range shouldBeARangeFromTwoToTwenty = Range.expandToInclude(exampleRange, 20);
            assertEquals("The range produced by expand above upper bound did not match the expected result...", new Range(2,20), shouldBeARangeFromTwoToTwenty);
        }
        catch(Exception e)
        {
            fail("Testing a range expansion above the upper bound caused an exception...");
        }
    }
    
    @Test
    public void testARangeExpansionBelowLowerBound() 
    {
        try
        {
            Range shouldBeARangeFromMinusTenToTwo = Range.expandToInclude(exampleRange, -10);
            assertEquals("The range produced by expand below lower bound did not match the expected result...", new Range(-10,2), shouldBeARangeFromMinusTenToTwo);
        }
        catch(Exception e)
        {
            fail("Testing a range expansion below the lower bound caused an exception...");
        }
    }
    
    @Test
    public void testARangeExpansionOnANullRange()
    {
        try
        {
            Range shouldOnlyIncludeTen = Range.expandToInclude(null, 10);
            assertEquals("The range produced by expanding a null range did not match the expected result...", new Range(10,10), shouldOnlyIncludeTen);
        }
        catch(Exception e)
        {
            fail("Testing a range expansion on a null range caused an exception...");
        }
    }
    
    @Test
    public void testAnExpansionOnAValueAlreadyInTheRange()
    {
        try
        {
            Range shouldBeIdenticalExampleRange = Range.expandToInclude(exampleRange, 4);
            assertEquals("The range produced by expanding to a value already inside the range did not match the expected result", exampleRange, shouldBeIdenticalExampleRange);
        }
        catch(Exception e)
        {
            fail("Testing a range expansion on a value already inside the range caused an exception...");
        }
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

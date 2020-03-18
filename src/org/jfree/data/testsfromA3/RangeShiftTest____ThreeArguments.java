package org.jfree.data.testsfromA3;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeShiftTest____ThreeArguments 
{
    private Range exampleRange = new Range(-20,30);
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception 
    {
        
    }
    
    @Before
    public void setUp() throws Exception 
    {
        
    }
    
    @Test
    public void testShiftingWithZeroCrossingAllowed() 
    {
        Range shouldBeARangeFromTenToSixty = exampleRange.shift(exampleRange, 30, true);
        assertEquals("A shift with zero crossing allowed did not produce the correct result...", new Range(10,60), shouldBeARangeFromTenToSixty);
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

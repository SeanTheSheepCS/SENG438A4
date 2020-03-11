package org.jfree.data.testsfromA3;


import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeShiftTest____TwoArguments 
{
    Range exampleRange;
    Range nullRange;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception 
    {
        
    }

    @Before
    public void setUp() throws Exception 
    {
        exampleRange = new Range(-20, 12);
        nullRange = null;
    }
    
    @Test
    public void shiftToTheLeftWithoutAttemptingToCrossOverZeroTest() 
    {
        try
        {
            Range shouldBeARangeFromMinusTwentyFiveToSeven = Range.shift(exampleRange, -5);
            assertEquals("The range we got from shifting to the left without attemting to cross over zero did not match our expected range.", new Range(-25,7), shouldBeARangeFromMinusTwentyFiveToSeven);
        }
        catch(Exception e)
        {
            fail("Shifting to the left without attempting to cross over zero caused an exception!");
        }
    }
    
    @Test
    public void shiftToTheRightWithoutAttemptingToCrossOverZeroTest() 
    {
        try
        {
            Range shouldBeARangeFromMinusTenToTwentyTwo = Range.shift(exampleRange, 10);
            assertEquals("The range we got from shifting to the right without attemting to cross over zero did not match our expected range.", new Range(-10,22), shouldBeARangeFromMinusTenToTwentyTwo);
        }
        catch(Exception e)
        {
            fail("Shifting to the right without attempting to cross over zero caused an exception!");
        }
    }
    
    @Test
    public void shiftToTheLeftAndAttemptingToCrossOverZeroTest() 
    {
        try
        {
            Range shouldBeARangeFromMinusFourtyToZero = Range.shift(exampleRange, -20);
            assertEquals("The range we got from shifting to the left while attempting to cross over zero did not match our expected range.", new Range(-40,0), shouldBeARangeFromMinusFourtyToZero);
        }
        catch(Exception e)
        {
            fail("Shifting to the left while attempting to cross over zero caused an exception!");
        }
    }
    
    @Test
    public void shiftToTheRightAndAttemptingToCrossOverZeroTest() 
    {
        try
        {
            Range shouldBeARangeFromZeroToFourtyTwo = Range.shift(exampleRange, 30);
            assertEquals("The range we got from shifting to the right while attempting to cross over zero did not match our expected range.", new Range(0,42), shouldBeARangeFromZeroToFourtyTwo);
        }
        catch(Exception e)
        {
            fail("Shifting to the right while attempting to cross over zero caused an exception!");
        }
    }
    
    @Test
    public void shiftingAValueOfZeroTest()
    {
        try
        {
            Range shouldBeIdenticalToExampleRange = Range.shift(exampleRange, 0);
            assertEquals("The range we got from shifting a value of zero did not match our expected range.", new Range(-20,12), shouldBeIdenticalToExampleRange);
        }
        catch(Exception e)
        {
            fail("Shifting with a value of zero caused an exception!");
        }
    }

    @Test
    public void shiftingANullRangeTest()
    {
        try
        {
            Range shouldThrowAnException = Range.shift(null, 10);
            fail("Passing a null range into shift should throw an exception but did not.");
        }
        catch(InvalidParameterException ipe)
        {
            assertTrue("This message should never be printed", true);
        }
        catch(Exception e)
        {
            fail("Passing a null range into shift threw the wrong exception. It should have thrown an illegal parameter exception");
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

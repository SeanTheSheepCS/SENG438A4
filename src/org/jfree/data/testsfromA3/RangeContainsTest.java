package org.jfree.data.testsfromA3;


import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class RangeContainsTest {
	private Range range;
	
	@Before
	public void setUp() throws Exception {
		range = new Range(5,10);
	}

	@Test
	public void valueInrange() {
		boolean result = range.contains(6);
		assertTrue("a value is in the range", result);
	}
	
	@Test
	public void valueAboveRange() {
		boolean result = range.contains(11);
		assertFalse("value is above the range", result);
	}
	
	@Test
	public void valueBelowRange() {
		boolean result = range.contains(3);
		assertFalse("value is below the range", result);
	}
	
	@Test
	public void valueThatIsTheLowerBound()
	{
	    boolean result = range.contains(5);
	    assertTrue("The range does not think its lower bound is inside it.", result);
	}
	
	@Test
	public void valueThatIsTheUpperBound()
	{
	    boolean result = range.contains(10);
        assertTrue("The range does not think its lower bound is inside it.", result);
	}

}

package org.jfree.data.testsfromA3;

import static org.junit.Assert.*;
import org.jfree.data.Range; 
import org.junit.*;

public class RangeTest {
private Range exampleRange;
private Range exampleRangeTwo;

@BeforeClass 
public static void setUpBeforeClass()
		throws Exception {
	
}

@Before
public void setUp() throws Exception { 
	exampleRange = new Range(-1, 1);
	exampleRangeTwo = new Range(-5, 10);
}

@Test
public void centralValueShouldBeZero() {
	assertEquals("The central value of -1 and 1 should be 0",
			0, exampleRange.getCentralValue(), .000000001d);
}

@Test
public void centralValueButCentralValueIsNotZero()
{
    assertEquals("The central value of -5 and 10 should be 2.5", 2.5, exampleRangeTwo.getCentralValue(), .000000001d);
}

@Test
public void flippedLowerUpperRangeCreationTest() {
	try {
		Range newRange = new Range(9, 6);
	}
	catch(Exception e) {
		System.out.println("");
	}
}

@Test
public void hashCodeRangeTest() {
	Range newRange = new Range(6, 9);
	assertNotNull(newRange.hashCode());

}

@Test
public void constrainRangeTest() {
	Range newRange = new Range(3,6);
	double actual = newRange.constrain(0);
	double expected = 3;
	assertEquals(expected, actual, 0);
}

@After
public void tearDown() throws Exception {
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
}
}
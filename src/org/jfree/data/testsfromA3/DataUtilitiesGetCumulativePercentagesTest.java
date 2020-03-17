package org.jfree.data.testsfromA3;


import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DataUtilitiesGetCumulativePercentagesTest {

	@Before
	public void setUp() throws Exception {
		
	}
	
	
	@Test
	public void positiveCumilativePercentageTest() {
		Mockery mockingContext1 = new Mockery(); 
		final KeyedValues input = mockingContext1.mock(KeyedValues.class);
		mockingContext1.checking(new Expectations() { 
			{
				atLeast(1).of(input).getItemCount();
				will(returnValue(3));
				
				atLeast(1).of(input).getKey(0);
				will(returnValue(0));
				
				atLeast(1).of(input).getValue(0);
				will(returnValue(10));
				
				atLeast(1).of(input).getKey(1);
				will(returnValue(1));
				
				atLeast(1).of(input).getValue(1);
				will(returnValue(30));
				
				atLeast(1).of(input).getKey(2);
				will(returnValue(2));
				
				atLeast(1).of(input).getValue(2);
				will(returnValue(40));
				
			} 
		});
		
		Mockery mockingContext2 = new Mockery();
		final KeyedValues expected = mockingContext2.mock(KeyedValues.class);
		mockingContext2.checking(new Expectations() {
			{
				atLeast(1).of(expected).getItemCount(); 
				will(returnValue(3));
			
				atLeast(1).of(expected).getKey(0);
				will(returnValue(0));
				
				atLeast(1).of(expected).getValue(0);
				will(returnValue(0.125));
				
				atLeast(1).of(expected).getKey(1);
				will(returnValue(1));
				
				atLeast(1).of(expected).getValue(1);
				will(returnValue(0.500));
				
				atLeast(1).of(expected).getKey(2);
				will(returnValue(2));
				
				atLeast(1).of(expected).getValue(2);
				will(returnValue(1.0));
			} 
		});
		
	//	KeyedValues actual = DataUtilities.getCumulativePercentages(input); 
		
		//assertEquals(expected, actual);
		
		assertTrue("Cumalating percentages for positive numbers error (last value should be 1.0)", DataUtilities.getCumulativePercentages(input).equals(expected));
	}
	
	@Test
	public void negativeCumilativePercentageTest() {
		Mockery mockingContext1 = new Mockery(); 
		final KeyedValues input = mockingContext1.mock(KeyedValues.class);
		mockingContext1.checking(new Expectations() { 
			{
				atLeast(1).of(input).getItemCount();
				will(returnValue(3));
				
				atLeast(1).of(input).getKey(0);
				will(returnValue(0));
				
				atLeast(1).of(input).getValue(0);
				will(returnValue(-10));
				
				atLeast(1).of(input).getKey(1);
				will(returnValue(1));
				
				atLeast(1).of(input).getValue(1);
				will(returnValue(-30));
				
				atLeast(1).of(input).getKey(2);
				will(returnValue(2));
				
				atLeast(1).of(input).getValue(2);
				will(returnValue(-40));
				
			} 
		});
		
		Mockery mockingContext2 = new Mockery();
		final KeyedValues expected = mockingContext2.mock(KeyedValues.class);
		mockingContext2.checking(new Expectations() {
			{
				atLeast(1).of(expected).getItemCount(); 
				will(returnValue(3));
			
				atLeast(1).of(expected).getKey(0);
				will(returnValue(0));
				
				atLeast(1).of(expected).getValue(0);
				will(returnValue(0.125));
				
				atLeast(1).of(expected).getKey(1);
				will(returnValue(1));
				
				atLeast(1).of(expected).getValue(1);
				will(returnValue(0.500));
				
				atLeast(1).of(expected).getKey(2);
				will(returnValue(2));
				
				atLeast(1).of(expected).getValue(2);
				will(returnValue(1.0));
			} 
		});
		
		//KeyedValues actual = DataUtilities.getCumulativePercentages(input); 
		
	//	assertEquals(expected, actual);
		
		assertTrue("Cumalating percentages for negative numbers error (last value should be 1.0)", DataUtilities.getCumulativePercentages(input).equals(expected));
	}
	
	@Test
	public void zeroCumilativePercentageTest() {
		Mockery mockingContext1 = new Mockery(); 
		final KeyedValues input = mockingContext1.mock(KeyedValues.class);
		mockingContext1.checking(new Expectations() { 
			{
				atLeast(1).of(input).getItemCount();
				will(returnValue(3));
				
				atLeast(1).of(input).getKey(0);
				will(returnValue(0));
				
				atLeast(1).of(input).getValue(0);
				will(returnValue(0));
				
				atLeast(1).of(input).getKey(1);
				will(returnValue(1));
				
				atLeast(1).of(input).getValue(1);
				will(returnValue(0));
				
				atLeast(1).of(input).getKey(2);
				will(returnValue(0));
				
				atLeast(1).of(input).getValue(2);
				will(returnValue(0));
				
			} 
		});
		
		
		try {
			DataUtilities.getCumulativePercentages(input);	
			//fail("Exeption by dividing by zero");
		}
		catch(Exception err) {
			assertEquals("The method will try to divide by zero, so it should throw an exception",  ArithmeticException.class, err.getClass());
		}
		
	}
	
	@Test
	public void NullCumilativePercentageTest() {
		
		try {
			KeyedValues input = null;
			DataUtilities.getCumulativePercentages(input);	
			
		}
		catch(Exception err) {
			assertEquals("The method is calling the getCumulativePercentage on a null value, so it should throw an exception",  IllegalArgumentException.class, err.getClass());
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
	}



}

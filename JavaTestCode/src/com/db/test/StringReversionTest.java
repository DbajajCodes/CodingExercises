package com.db.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringReversionTest {
	
	@Test
	public void testValueIsReversed(){
		
	//Set the expectation
	String expected="jajaBtihskiD";	
	
	
	//Perform the execution
	assertEquals(expected,StringReversion.performStringReversion("DikshitBajaj"));
	
	//verify the results
	}

}

package com.db.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dikshit.chapter1.StringReversion;


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

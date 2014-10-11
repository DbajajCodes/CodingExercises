package com.dikshit.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ReplaceSpaceTest {

//	@Test
//	public void testHasMethodPeformOperation(){
//	 Mockito.verify(ReplaceSpace, times(1)).performOperation("a b c");
//	}
	
	@Test
	public void testPerformOperationBehavesAsExpected(){
		assertEquals("Mr%20John%20Smith", ReplaceSpace.performOperation("Mr John Smith") );
		
	}
	
}

package com.dikshit.chapter1;

import org.junit.Test;
import org.mockito.Mockito;


public class ReplaceSpaceTest {

	@Test
	public void testHasMethodPeformOperation(){
	 Mockito.verify(ReplaceSpace.performOperation("String value to pass"));
	}
	
}

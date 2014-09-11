package com.dikshit.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;


public class PermutationCheckTest {
	
	@Test
	public void testIfMethodReturnsTrue(){
		assertEquals(PermutationCheck.checkPermutation("dog", "god"),true);
		
	}
	
	@Test
	public void testIfMethodReturnsFalse(){
		assertEquals(PermutationCheck.checkPermutation("ewecdsrewrewr", "erarqraqewrqer"), false);
	}
	
	@Test
	public void testMethodReturnsFalseIfLengthIsUnequal(){
		String val1 = "firstValue";
		String val2 = "firstValue+";
		
		assertEquals(PermutationCheck.checkPermutation(val1, val2), false);
				
		
	}

}

package com.dikshit.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringCompressionTest {
	

@Test
public void testMethodReturnsSameValueIfLengthSame(){
	assertEquals("aabbccdd", StringCompression.performCompression("aabbccdd"));
}
	
@Test
public void testMethodPasses(){
	assertEquals("a2b1c5a2d3", StringCompression.performCompression("aabcccccaaddd"));
}



}

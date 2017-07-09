package pairinginterview;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAddNumbersForEmptyString() throws Exception {
		assertEquals(StringCalculator.add(""),0);
	}
	
	@Test
	public void testAddNumbersForSingleEntry() throws Exception {
		assertEquals(StringCalculator.add("4"),4);
	}
	
	@Test
	public void testAddNumbersForYetAnotherSingleEntry() throws Exception {
		assertEquals(StringCalculator.add("5"),5);
	}
	
	@Test
	public void testAddNumbersFor2Entries() throws Exception {
		assertEquals(StringCalculator.add("5,6"), 11);
	}
	
}

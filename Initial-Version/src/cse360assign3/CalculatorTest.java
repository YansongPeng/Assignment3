package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testTotal() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}
}
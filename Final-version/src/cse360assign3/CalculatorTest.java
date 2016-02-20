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
		Calculator calc = new Calculator();
		calc.add(5);
		System.out.print(calc.getTotal());
		
		assertEquals("5", outContent.toString());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(4);
		calc.add(6);
		System.out.print(calc.getTotal());
		
		assertEquals("10", outContent.toString());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(18);
		calc.subtract(6);
		calc.subtract(11);
		System.out.print(calc.getTotal());
		
		assertEquals("1", outContent.toString());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(16);
		calc.multiply(8);
		calc.multiply(5);
		System.out.print(calc.getTotal());
		
		assertEquals("640", outContent.toString());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(18);
		calc.divide(6);
		System.out.print(calc.getTotal());
		
		assertEquals("3", outContent.toString());
	}
	
	@Test
	public void testDivideZero() {
		Calculator calc = new Calculator();
		calc.add(16);
		calc.divide(0);
		System.out.print(calc.getTotal());
		
		assertEquals("0", outContent.toString());
	}
	
	@Test
	public void testGetHistory() {
		String[] result = new String[1000];
		Calculator calc = new Calculator();
		calc.add(4);
		calc.subtract(2);
		calc.multiply(2);
		calc.add(5);
		result = calc.getHistory();
		for (int index = 0; index <= calc.getIndex(); index++)
		{
			System.out.print(result[index]);
		}
		
		assertEquals("0 + 4 - 2 * 2 + 5 ", outContent.toString());
	}
	
	@Test
	public void testGetHistory2() {
		String[] result = new String[1000];
		Calculator calc = new Calculator();
		calc.add(12);
		calc.divide(4);
		calc.subtract(2);
		calc.multiply(15);
		calc.add(5);
		result = calc.getHistory();
		for (int index = 0; index <= calc.getIndex(); index++)
		{
			System.out.print(result[index]);
		}
		
		assertEquals("0 + 12 / 4 - 2 * 15 + 5 ", outContent.toString());
	}
}
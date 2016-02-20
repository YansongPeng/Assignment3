package cse360assign3;

/** Math calculation
 * @author Yansong Peng
 * @version Feb 18, 2016
 * 
 */

public class Calculator {

	private int total;
	private int[] inputValue;
	private int index;
	private String[] operator;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		inputValue = new int[1000];
		index = 0;
		operator = new String[1000];
	}
	
	/** Calculate the total */
	public int getTotal () {
		return total;
	}
	
	/** Add a integer
	 * 
	 * @param value
	 */
	public void add (int value) {
		index++;
		inputValue[index] = value;
		operator[index] = "+";
		total = total + value;
	}
	
	/** Subtract a value
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		index++;		
		inputValue[index] = value;
		operator[index] = "-";
		total = total - value;
	}
	
	/** Multiply a value
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		index++;
		inputValue[index] = value;
		operator[index] = "*";
		total = total * value;
	}
	
	/** Divide a value
	 * 
	 * @param value
	 */
	public void divide (int value) {
		index++;
		inputValue[index] = value;
		operator[index] = "/";
		if (value == 0) {
			total = 0;
		} 
		else {
			total = total / value;
		}
	}
	
	/** Display the result
	 * 
	 * @return	return the string will be printed
	 */
	public String[] getHistory () {
		String[] result = new String[1000];
		inputValue[0] = 0;
		operator[0] = " ";
		result[0] = inputValue[0] + operator[0];
		for(int value = 1; value <= index; value++) {
			result[value] = operator[value] + " " + inputValue[value] + " ";
		}
		return result;
	}
	
	/** Return the index
	 * 
	 * @return return the index which will be used in Test getHistory() method in CalculatorTest.java
	 */
	public int getIndex() {
		return index;
	}
}

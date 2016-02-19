package cse360assign3;

/** Math calculation
 * @author Yansong Peng
 * @version Feb 18, 2016
 * 
 */

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
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
		total = total + value;
	}
	
	/** Subtract a value
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** Multiply a value
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** Divide a value
	 * 
	 * @param value
	 */
	public void divide (int value) {
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
	public String getHistory () {
		return "";
	}
}

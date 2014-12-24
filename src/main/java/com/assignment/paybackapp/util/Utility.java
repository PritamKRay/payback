package com.assignment.paybackapp.util;

/**
 * The Utility class has methods for general use of whole application
 * 
 * 
 * @author Pritam Kumar
 * @version 1.0
 * @since 2014-12-15
 * 
 */
public class Utility {

	/**
	 * A method implementation to round off a given double value with required
	 * number of digits after decimal
	 * 
	 * @param value
	 * @param places
	 * @return A double value with required number of digits after decimal
	 */
	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
}

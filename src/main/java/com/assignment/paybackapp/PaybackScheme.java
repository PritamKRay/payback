package com.assignment.paybackapp;

/**
 * The PaybackScheme interface has methods related to payback schemes 
 * 
 * 
 * @author Pritam Kumar
 * @version 1.0
 * @since 2014-12-15
 * 
 */
public interface PaybackScheme {

	/**
	 * A method to calculate the interest on the loan based on the loan type
	 * @param loanType
	 * @return interest
	 */
	public double calculateInterest(String loanType);
}

package com.assignment.paybackapp;

/**
 * The Payment interface has methods related to EMI calculation 
 * 
 * 
 * @author Pritam Kumar
 * @version 1.0
 * @since 2014-12-15
 * 
 */
public interface Payment {

	/**
	 * A method to calculate the EMI of the loan
	 * @param duration
	 * @param amount
	 * @param interest
	 * @return EMI of the loan
	 */
	public double calculateEmi(int duration,double amount,double interest);
}

package com.assignment.paybackapp.loan;

import com.assignment.paybackapp.Payment;

/**
 * CarLoan class Implements Payment interface and overrides method to calculate
 * EMI for car loan based on parameters passed
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class CarLoan implements Payment {

	/**
	 * A method implementation to calculate EMI of a car loan based on the
	 * params passed
	 * 
	 * @param duration
	 * @param amount
	 * @param interest
	 * @return EMI of the car loan
	 */
	@Override
	public double calculateEmi(int duration, double amount, double interest) {

		int months = duration * 12;
		double payable = amount + (amount * interest * duration) / 100;
		double emi = payable / months;
		return emi;
	}

}

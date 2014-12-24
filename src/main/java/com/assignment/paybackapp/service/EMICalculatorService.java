package com.assignment.paybackapp.service;

import com.assignment.paybackapp.loan.Loan;

/**
 * The EmiCalculatorServiceinterface contains methods related to calculations of
 * EMI
 * 
 * 
 * @author Pritam Kumar
 * @version 1.0
 * @since 2014-12-15
 * 
 */
public interface EMICalculatorService {

	/**
	 * A method declaration to calculate the EMI of a loan
	 * 
	 * @param loan
	 *            : A loan object with all the supplied fields 
	 * @return EMI of the loan
	 */
	public double calculateEmi(Loan loan);
}

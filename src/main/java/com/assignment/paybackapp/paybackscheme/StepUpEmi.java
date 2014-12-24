package com.assignment.paybackapp.paybackscheme;

import com.assignment.paybackapp.PaybackScheme;

/**
 * StepUpEmi class Implements PaybackScheme interface and overrides method to calculate
 * interest for StepUpEmi scheme based on loanType
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class StepUpEmi implements PaybackScheme {

	/**
	 * A method implementation to calculate interest on loan based on the loanType
	 * 
	 * @param loanType
	 * @return interest on loan for stepUpEmi scheme
	 */
	@Override
	public double calculateInterest(String loanType) {
		/*
		 * Implement the calculation of the interest rate for a StepUp EMI
		 * based on the loan type,Currently returning a fixed value
		 */
		return 3.5;
	}

}

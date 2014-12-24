package com.assignment.paybackapp.paybackscheme;

import com.assignment.paybackapp.PaybackScheme;

/**
 * RegularEmi class Implements PaybackScheme interface and overrides method to calculate
 * interest for RegularEmi scheme based on loanType
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class RegularEmi implements PaybackScheme {

	/**
	 * A method implementation to calculate interest on loan based on the loanType
	 * 
	 * @param loanType
	 * @return interest on loan for regularEmi scheme
	 */
	@Override
	public double calculateInterest(String loanType) {

		// TODO Implement the calculation of the interest rate for a regular EMI
		// based on the loan type, Currently returning a fixed value 3.5
		return 3.5;
	}

}

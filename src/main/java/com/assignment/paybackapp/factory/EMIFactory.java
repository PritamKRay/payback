package com.assignment.paybackapp.factory;

import com.assignment.paybackapp.PaybackScheme;
import com.assignment.paybackapp.paybackscheme.RegularEmi;
import com.assignment.paybackapp.paybackscheme.StepUpEmi;

/**
 * EMIFactory is a factory class having factory method implementation to get
 * the different types of EMI classes objects based on the loanType parameter
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class EMIFactory {

	/**
	 * A method implementation to get different EMI class objects based on the
	 * parameter loanType
	 * 
	 * @param loanType
	 * @return An object based on the parameter passed
	 */
	public static PaybackScheme getEMIObject(String paybackScheme) {

		if (paybackScheme.equalsIgnoreCase("regularEmi")) {
			return new RegularEmi();
		} else if (paybackScheme.equalsIgnoreCase("stepUpEmi")) {
			return new StepUpEmi();
		} 
		throw new IllegalArgumentException("Payback Scheme not defined");
	}
}

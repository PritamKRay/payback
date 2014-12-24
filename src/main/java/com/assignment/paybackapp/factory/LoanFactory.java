package com.assignment.paybackapp.factory;

import com.assignment.paybackapp.Payment;
import com.assignment.paybackapp.loan.CarLoan;
import com.assignment.paybackapp.loan.EducationLoan;
import com.assignment.paybackapp.loan.HouseLoan;

/**
 * LoanFactory is a factory class having factory method implementation to get
 * the different types of loan classes objects based on the loanType parameter
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class LoanFactory {

	/**
	 * A method implementation to get different loan class objects based on the
	 * parameter loanType
	 * 
	 * @param loanType
	 * @return An object based on the parameter passed
	 */
	public static Payment getLoanObject(String loanType) {

		if (loanType.equalsIgnoreCase("car")) {
			return new CarLoan();
		} else if (loanType.equalsIgnoreCase("house")) {
			return new HouseLoan();
		} else if (loanType.equalsIgnoreCase("education")) {
			return new EducationLoan();
		}
		throw new IllegalArgumentException("Loan type not defined");
	}
}

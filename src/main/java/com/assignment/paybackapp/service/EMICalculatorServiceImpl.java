package com.assignment.paybackapp.service;

import com.assignment.paybackapp.factory.EMIFactory;
import com.assignment.paybackapp.factory.LoanFactory;
import com.assignment.paybackapp.loan.Loan;
import com.assignment.paybackapp.PaybackScheme;
import com.assignment.paybackapp.Payment;

/**
 * EMICalculatorServiceImpl implements all the methods of EMICalculatorService
 * interface
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class EMICalculatorServiceImpl implements EMICalculatorService {

	/**
	 * A method implementation to calculate the EMI of a loan Overrides the
	 * method from the implemented interface .Gets an object based on the from the
	 * LoanFactory class and calculates the EMI based on the implementation of
	 * the calculateEmi method
	 * 
	 * @param loan :A loan object
	 * @return EMI of the loan
	 */
	@Override
	public double calculateEmi(Loan loan) {
		/*
		 * Get a Loan object from LoanFactory based on the loanType selected by
		 * the user
		 */
		Payment plan = LoanFactory.getLoanObject(loan.getLoanType());

		/*
		 * Get a PaymentScheme object based on the payment scheme selected by
		 * the user
		 */
		PaybackScheme scheme = EMIFactory.getEMIObject(loan.getPaybackScheme());

		/*
		 * Calculate the interest rate based on the payback scheme and loan type
		 */
		double interest = scheme.calculateInterest(loan.getLoanType());

		/*
		 * call the calculateEmi method and pass the duration,amount and
		 * interest rate calculated above
		 */
		return plan.calculateEmi(loan.getDuration(), loan.getLoanAmount(), interest);
	}

}

package com.assignment.paybackapp.loan;

/**
 * A POJO class having all the properties needed to calculate the EMI and their
 * getters and setters
 * 
 * @author Pritam
 * @version 1.0
 * @since 2014-12-15
 *
 */
public class Loan {

	/*
	 * Loan class properties
	 */
	String loanType;
	String paybackScheme;
	double loanAmount;
	int duration = 1;
	double emi;

	/*
	 * Setters and getters for the properties
	 */
	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getPaybackScheme() {
		return paybackScheme;
	}

	public void setPaybackScheme(String paybackScheme) {
		this.paybackScheme = paybackScheme;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

}

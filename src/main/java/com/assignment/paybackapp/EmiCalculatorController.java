package com.assignment.paybackapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assignment.paybackapp.loan.Loan;
import com.assignment.paybackapp.util.Utility;
import com.assignment.paybackapp.service.EMICalculatorService;

/**
 * The EmiCalculatorController handles the requests from an User, Displays the
 * home page of the application and handles the requests from user to show the
 * appropriate results
 * 
 * 
 * @author Pritam Kumar
 * @version 1.0
 * @since 2014-12-15
 * 
 */
@Controller
public class EmiCalculatorController {

	/**
	 * Autowire services
	 */
	@Autowired
	EMICalculatorService emiCalculatorService;

	/**
	 * Request mapping for the default URL User is redirected to home page once
	 * the application is started A method to redirect the user to home page
	 * 
	 * @return redirect to home page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/home";
	}

	/**
	 * Request mapping for displaying the home page to the user A method to
	 * display the home page to the user
	 * 
	 * @param A
	 *            ModelMap with properties of Loan class
	 * @return home page
	 */

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String indexPage(ModelMap map) {
		Loan loan = new Loan();
		map.addAttribute("loan", loan);
		return "home";
	}

	/**
	 * Request mapping for calculating the EMI after user fills the details and
	 * submits the form A method to calculate the EMI based on user input
	 * 
	 * @param A ModelAttribute for Loan class 
	 * @param BindingResult
	 * @param ModelMap
	 * @return Returns result page with loan properties
	 */

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String calculate(@ModelAttribute(value = "loan") Loan loan,
			BindingResult result,ModelMap map) {
		double emi = emiCalculatorService.calculateEmi(loan);
		Double roundOffEmi = Utility.round(emi, 2);
		loan.setEmi(roundOffEmi);
		map.addAttribute("loan", loan);
		return "result";
	}

}

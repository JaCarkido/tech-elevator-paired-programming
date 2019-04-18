package com.techelevator.ssg.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.calculator.AlienWeightConversion;



@Controller
public class AlienWeightController {
	
	
	@RequestMapping("/alienWeight")
	public String displayAlienWeight() {
		return "alienWeight";
	}
	
	@RequestMapping("/alienWeightResult")
	public String displayAlienWeightResult(HttpServletRequest request) {
		String planetName = request.getParameter("planetChoice");
		int earthWeight = Integer.parseInt(request.getParameter("earthWeight"));
		
		AlienWeightConversion conversion = new AlienWeightConversion(planetName, earthWeight);
		request.setAttribute("conversion", conversion);
		
		return"alienWeightResult";
	}

}


/*


MortgageLoanEstimate estimate = new MortgageLoanEstimate(loanAmount, loanTerm, interestRate);
request.setAttribute("estimate", estimate);

return "mortgageCalculatorResult";



planetChoice=mercury
earthWeight=123
*/
package com.techelevator.ssg.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.calculator.AlienAgeConversion;
import com.techelevator.ssg.model.calculator.AlienWeightConversion;


@Controller
public class AlienAgeController {
	

	@RequestMapping("/alienAge")
	public String displayAlienAge() {
		return "alienAge";
	}
	
	@RequestMapping("/alienAgeResult")
	public String displayAlienAgeResult(HttpServletRequest request) {
		String planetName = request.getParameter("planetChoice");
		int earthAge = Integer.parseInt(request.getParameter("earthAge"));	
		
		AlienAgeConversion conversion = new AlienAgeConversion(planetName, earthAge);
		request.setAttribute("conversion", conversion);
		
		return "alienAgeResult";
	}

}
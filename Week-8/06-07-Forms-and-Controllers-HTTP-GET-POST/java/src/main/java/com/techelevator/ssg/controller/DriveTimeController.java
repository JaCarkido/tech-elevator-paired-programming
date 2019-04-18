package com.techelevator.ssg.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.calculator.AlienAgeConversion;
import com.techelevator.ssg.model.calculator.DriveTimeResult;


@Controller
public class DriveTimeController {
	

	@RequestMapping("/driveTime")
	public String displayDriveTime() {
		return "driveTime";
	}

	@RequestMapping("/driveTimeResult")
	public String displayDriveTimeResult(HttpServletRequest request) {
		String planetName = request.getParameter("planetChoice");
		int earthAge = Integer.parseInt(request.getParameter("earthAge"));
		String transChoice = request.getParameter("transChoice");
		
		DriveTimeResult conversion = new DriveTimeResult(planetName, earthAge, transChoice);
		request.setAttribute("conversion", conversion);
		
		return "driveTimeResult";
	}
	
}

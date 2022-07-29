package com.lti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lti.beans.ApplicationStatus;
import com.lti.services.LoanTrackerService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/loanTrackerController")
public class LoanTrackerController {

	@Autowired
	public LoanTrackerService loanTrackerService;
	
	@PostMapping("/track")
	public ApplicationStatus track(@RequestBody ApplicationStatus applicationstatus) 
	{
		return loanTrackerService.trackLoan(applicationstatus.getApplicationid());
		
	}
	
	
		

}


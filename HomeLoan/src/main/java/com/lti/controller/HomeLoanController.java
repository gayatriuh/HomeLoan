package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.Applicant;
import com.lti.beans.ApplicationStatus;
import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;
import com.lti.services.HomeLoanService;

@CrossOrigin(origins="*")
@RequestMapping("/homeloanappln")
@RestController
public class HomeLoanController {

	@Autowired
	public HomeLoanService hlservice;
	
	@PostMapping("/adduser")
	public boolean registerUser(@RequestBody User user) {
		return hlservice.registerUser(user);
		
	}
	
	
	@PostMapping("/addapplninfo")
	public boolean AddApplicantInfo(@RequestBody Applicant applicant) {
		System.out.println("inside the controller"+applicant);
		return hlservice.addApplicationInfo(applicant);
		
	}
	
	@GetMapping("/userlogin")
	public User userlogin(@RequestBody User user) {
		return hlservice.loginProcess(user);
		
	}
	
	@PostMapping("/addincome-salaried")
	public boolean AddIncomeSalariedInfo(@RequestBody IncomeSalaried incomeSalaried) {
		return hlservice.addIncomeSalariedInfo(incomeSalaried);
	}
	
	@PostMapping("/addincome-selfemp")
	public boolean AddIncomeSelfEmpInfo(@RequestBody IncomeSelfEmployed incomeSelfEmployed) {
		return hlservice.addIncomeSelfEmployedInfo(incomeSelfEmployed);
	}
	
	@PostMapping("/addpropertydet")
	public boolean AddPropertyInfo(@RequestBody Property property) {
	return hlservice.addPropertyInfo(property);
	}
	
	
	@PostMapping("/addloandet")
	public boolean addLoanInfo(@RequestBody Loan loan) {
		return hlservice.addLoanInfo(loan);
		}
	
	
	
	
	@PostMapping("/addappstatus")
	public boolean AddApplnStatus(@RequestBody ApplicationStatus applnStatus){
		return hlservice.addApplicationStatus(applnStatus);
	}
	
	
	
}
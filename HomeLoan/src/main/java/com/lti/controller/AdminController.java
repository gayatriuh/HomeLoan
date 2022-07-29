package com.lti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lti.beans.Admin;
import com.lti.beans.Applicant;
import com.lti.services.AdminServiceImpl;

@CrossOrigin(origins="")
@RestController
@RequestMapping("/adminController")
public class AdminController {

	@Autowired
	public AdminServiceImpl adminServiceIntf;
	
	@PostMapping(value="/adminlogin")
	public boolean adminlogin(@RequestBody Admin admin) 
	{
		return adminServiceIntf.adminLogin(admin);
		
		
	}
	
	@GetMapping(value="/pending")
	public List<Applicant> getPendingList(){
		List<Applicant> penlst=adminServiceIntf.viewPendingApprovals();
		return penlst;
		
	}
	
}
	



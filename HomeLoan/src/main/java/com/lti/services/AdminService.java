package com.lti.services;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.Applicant;



public interface AdminService {

	public boolean adminLogin(Admin admin);
	public List<Applicant> viewPendingApprovals();
	
}

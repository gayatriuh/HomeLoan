package com.lti.services;

import com.lti.beans.Applicant;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;

public interface HomeLoanService {

	public boolean registerUser(User users);
	public boolean addApplicationInfo(Applicant applicant);
	public User loginProcess(User users);
	public boolean addIncomeSalariedInfo(IncomeSalaried incomeSalaried);
	public boolean addIncomeSelfEmployedInfo(IncomeSelfEmployed incomeSelfEmployed);
	public boolean addPropertyInfo(Property property);
	public boolean addLoanInfo(Loan loan);
	
	public boolean addApplicationStatus(ApplicationStatus applicationStatus);
}

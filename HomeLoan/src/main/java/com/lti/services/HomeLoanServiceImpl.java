package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Applicant;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;
import com.lti.dao.HomeLoanDao;



@Service("homeLoanService")
public class HomeLoanServiceImpl implements HomeLoanService {

	@Autowired
	public HomeLoanDao homeLoanDao;
	
	@Transactional
	public boolean registerUser(User users) {
		
		return homeLoanDao.registerUser(users);
	}
	
	@Transactional
	public boolean addApplicationInfo(Applicant applicant) {
		
		return homeLoanDao.addApplicationInfo(applicant);
	}

	@Transactional
	public User loginProcess(User users) {

		return homeLoanDao.loginProcess(users);
	}

	@Transactional
	public boolean addIncomeSalariedInfo(IncomeSalaried incomeSalaried) {
		return homeLoanDao.addIncomeSalariedInfo(incomeSalaried);
	}

	@Transactional
	public boolean addIncomeSelfEmployedInfo(IncomeSelfEmployed incomeSelfEmployed) {
		return homeLoanDao.addIncomeSelfEmployedInfo(incomeSelfEmployed);
	}

	@Transactional
	public boolean addPropertyInfo(Property property) {
		return homeLoanDao.addPropertyInfo(property);
	}

	@Transactional
	public boolean addLoanInfo(Loan loan) {
		return homeLoanDao.addLoanInfo(loan);
	}

	

	@Transactional
	public boolean addApplicationStatus(ApplicationStatus applicationStatus) {
		return homeLoanDao.addApplicationStatus(applicationStatus);
	}
	
	
	
}

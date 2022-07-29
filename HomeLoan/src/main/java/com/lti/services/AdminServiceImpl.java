package com.lti.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
import com.lti.beans.Applicant;
import com.lti.dao.AdminDao;


@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	public AdminDao adminDao;
	
	@Transactional
	public boolean adminLogin(Admin admin) {
		
		return adminDao.adminLogin(admin);
	}

	@Transactional
	public List<Applicant> viewPendingApprovals() {
		
		return adminDao.viewPendingApprovals();
	}

	

	
	
}

package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;
import com.lti.beans.Applicant;



@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager em;
	
	public boolean adminLogin(Admin admin) {
		
		boolean flag = false;
		
		Admin a = null;
		 try {
			   
				String username =  admin.getUserName();
				String password = admin.getPassword();
				
				a = (Admin)em.createQuery("select a from Admin a where a.username=:username").setParameter("username", username).getSingleResult();
				
				if(( a.getUserName().equals(username) ) && ( a.getPassword().equals(password) ) ) {
					
					flag = true;
				}
				else flag = false;
			
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    	 
			}
		return flag;
	}
               

	public List<Applicant> viewPendingApprovals() {
		
		Query query = em.createQuery("Select l.appid from loantracker l where status is pending");
		return null;
		
	}

	
}

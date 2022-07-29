package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.beans.LoanAccount;



@Repository("accountdao")
public class AccountDaoImpl implements AccountDao{
	

	@PersistenceContext
	EntityManager em;
	
	
	public  LoanAccount trackAccount (int accNo){
	Query query = em.createQuery("SELECT a.balance FROM LoanAccount a where a.accNo=:accNo");
	query.setParameter("accNo", accNo);
	LoanAccount loanaccount =(LoanAccount) query.getSingleResult();
	return loanaccount;
	}


	
		
	}
	
	
	
